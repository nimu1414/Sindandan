package model;

import java.util.List;

import DAO.SindansDAO;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Sindan sin = new Sindan();
//		sin.SindanJob(sin);
//		System.out.println(sin.getJob());
//		sin.SindanWeapon(sin);
//		System.out.println(sin.getWeapon());
		SindansDAO sindan = new SindansDAO();
		List<Sindan> sindanList = sindan.findAll();

		for (Sindan sin : sindanList) {
			System.out.println(sin.getJob() + "," + sin.getWeapon() + ","
		+ sin.getZokusei() + "," + sin.getName() + ",");


		}
	}

}
