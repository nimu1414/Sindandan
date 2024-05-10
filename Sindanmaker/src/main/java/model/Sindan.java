package model;

import java.io.Serializable;
import java.util.Random;

public class Sindan implements Serializable{
	private String job;
	private String jobId;
	private String weapon;
	private String zokusei;
	private String name;
	private int id;
	public String getZokusei() {return zokusei;}
	public String getWeapon() {return weapon;}
	public String getJob() {return job;}
	public String getJobId() {return jobId;}
	public String getName() {return name;}
	public int getId() {return id;}
	public void setName(String name) {this.name = name;}
	public void setZokusei(String zokusei) {this.zokusei = zokusei;}
	public void setWeapon(String weapon) {this.weapon = weapon;}
	public void setJob(String job) {this.job = job;}
	public void setJobId(String jobId) {this.jobId = jobId;}

	public Sindan(int id, String name,String job, String weapon, String zokusei) {
		this.id = id;
		this.job = job;
		this.name = name;
		this.weapon = weapon;
		this.zokusei = zokusei;
	}
	public Sindan( String name,String job, String weapon, String zokusei) {
		this.job = job;
		this.name = name;
		this.weapon = weapon;
		this.zokusei = zokusei;
	}

	public Sindan() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public static void SindanJob(Sindan sindan) {
//		String job = null;
//		Sindan sindan = new Sindan();
		int r = new Random().nextInt(5) + 1;
		switch(r) {
		case 1:
//			job = "勇者";
			sindan.setJob("勇者");
			sindan.setJobId("img/Sindan01.png");
			break;
		case 2:
//			job = "戦士";
			sindan.setJob("戦士");
			sindan.setJobId("img/Sindan02.png");
			break;
		case 3:
//			job = "魔導士";
			sindan.setJob("魔導士");
			sindan.setJobId("img/Sindan03.png");
			break;
		case 4:
//			job = "ナイト";
			sindan.setJob("ナイト");
			sindan.setJobId("img/Sindan04.png");
			break;
		case 5:
//			job = "魔王";
			sindan.setJob("魔王");
			sindan.setJobId("img/Sindan05.png");
			break;
		}
//		return job;
//		return sindan;
	}
	public static void SindanWeapon(Sindan sindan) {
//		Sindan sindan = new Sindan();
		int r = new Random().nextInt(6) + 1;
//	 String weapon = null;
		switch(r) {
		case 1:
//			weapon = "両手剣";
			sindan.setWeapon("両手剣");
			break;
		case 2:
//			weapon = "槍";
			sindan.setWeapon("槍");
			break;
		case 3:
//			weapon = "メイス";
			sindan.setWeapon("メイス");
			break;
		case 4:
//			weapon = "杖";
			sindan.setWeapon("杖");
			break;
		case 5:
//			weapon = "短剣";
			sindan.setWeapon("短剣");
			break;
		case 6:
//			weapon = "双剣";
			sindan.setWeapon("双剣");
			break;
		}
//		System.out.println(weapon);
//		return weapon;
	}
	public static void SindanZokusei(Sindan sindan) {
//		Sindan sindan = new Sindan();
//		String zokusei = null;
		int r = new Random().nextInt(4) + 1;
		switch(r) {
		case 1:
//			zokusei = "火属性";
			sindan.setZokusei("火属性");
			break;
		case 2:
//			zokusei = "水属性";
			sindan.setZokusei("水属性");
			break;
		case 3:
//			zokusei = "闇属性";
			sindan.setZokusei("闇属性");
			break;
		case 4:
//			zokusei = "光属性";
			sindan.setZokusei("光属性");
			break;
		}
//		return zokusei;
	}
//	public static String SindanJobId(String job) {
//		String jobId = null;
//		if(job.equals("勇者")) {
//			jobId = "img/Sindan01,png";
//		} else if (job.equals("戦士")) {
//			jobId = "img/Sindan02.png";
//		}else if (job.equals("魔導士")){
//			jobId = "img/Sindan03.png";
//		} else if (job.equals("ナイト")) {
//			jobId = "img/Sindan04.png";
//		} else if(job.equals("魔王")) {
//			jobId = "img/Sindan05.png";
//		}
//		return jobId;
//	}
}
