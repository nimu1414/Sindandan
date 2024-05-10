package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Sindan;

public class SindansDAO {
	//データベース接続に使用する情報
		private final String JDBC_URL =
				"jdbc:h2:tcp://localhost/~/Sindan";
		private final String DB_USER = "sa";
		private final String DB_PASS = "";

		public List<Sindan> findAll(){
			List<Sindan> sindanList = new ArrayList<>();
			//JDBCドライバを読み込む
			try {
				Class.forName("org.h2.Driver");
			} catch (ClassNotFoundException e){
				throw new IllegalStateException("JDBCドライバを読み込めませんでした。");
			}
			//データベース接続
			try (Connection conn =
					DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

				//SELECT文の準備
				String sql =
						"SELECT USER_ID,NAME,JOB,WEAPON,ZOKUSEI FROM SINDANS ORDER BY USER_ID DESC";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				//SELECTを実行
				ResultSet rs = pStmt.executeQuery();

				//SELECT文の結果をArrayListに格納
				while (rs.next()) {
					int id = rs.getInt("USER_ID");
					String userName = rs.getString("NAME");
					String job = rs.getString("JOB");
					String weapon = rs.getString("WEAPON");
					String zokusei = rs.getString("ZOKUSEI");
					Sindan sindan = new Sindan(id,userName,job,weapon,zokusei);
					sindanList.add(sindan);

				}
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
			return sindanList;
		}
		public boolean create(Sindan sindan) {
			//JDBCドライバを読み込む
			try {
				Class.forName("org.h2.Driver");

			} catch(ClassNotFoundException e) {
				throw new IllegalStateException("JDBCドライバを読み込めませんでした");
			}
			//データベース接続
			try (Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
				//Insert文の準備
				String sql = "INSERT INTO SINDANS(NAME,JOB,WEAPON,ZOKUSEI) VALUES(?,?,?,?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				//INSERT文中の「？」に使用する値を設定してSQL文を作成
				pStmt.setString(1, sindan.getName());
				pStmt.setString(2, sindan.getJob());
				pStmt.setString(3, sindan.getWeapon());
				pStmt.setString(4, sindan.getZokusei());


				//INSERT文を実行
				int result = pStmt.executeUpdate();
				if (result != 1) {
					return false;
				}
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
}
