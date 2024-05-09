package model;

import java.io.Serializable;
import java.util.Random;

public class Sindan implements Serializable{
//	private String job = null;
//	private String jobId;
//	public String getJob() {return job;}
//	public String getJobId() {return jobId;}
//	public void setJob(String job) {this.job = job;}
//	public void setJobId(String jobId) {this.jobId = jobId;}

	public static String SindanJob() {
		String job = null;
//		Sindan sindan = new Sindan();
		int r = new Random().nextInt(5) + 1;
		switch(r) {
		case 1:
			job = "勇者";
//			sindan.setJob("勇者");
//			sindan.setJobId("01");
			break;
		case 2:
			job = "戦士";
//			sindan.setJob("戦士");
//			sindan.setJobId("02");
			break;
		case 3:
			job = "魔導士";
//			sindan.setJob("魔導士");
//			sindan.setJobId("03");
			break;
		case 4:
			job = "ナイト";
//			sindan.setJob("ナイト");
//			sindan.setJobId("04");
			break;
		case 5:
			job = "魔王";
//			sindan.setJob("魔王");
//			sindan.setJobId("05");
			break;
		}
		return job;
//		return sindan;
	}
	public static String SindanWeapon() {
		int r = new Random().nextInt(6) + 1;
	 String weapon = null;
		switch(r) {
		case 1:
			weapon = "両手剣";
			break;
		case 2:
			weapon = "槍";
			break;
		case 3:
			weapon = "メイス";
			break;
		case 4:
			weapon = "杖";
			break;
		case 5:
			weapon = "短剣";
			break;
		case 6:
			weapon = "双剣";
			break;
		}
//		System.out.println(weapon);
		return weapon;
	}
	public static String SindanZokusei() {
		String zokusei = null;
		int r = new Random().nextInt(4) + 1;
		switch(r) {
		case 1:
			zokusei = "火属性";
			break;
		case 2:
			zokusei = "水属性";
			break;
		case 3:
			zokusei = "闇属性";
			break;
		case 4:
			zokusei = "光属性";
			break;
		}
		return zokusei;
	}
	public static String SindanJobId(String job) {
		String jobId = null;
		if(job.equals("勇者")) {
			jobId = "img/Sindan01,png";
		} else if (job.equals("戦士")) {
			jobId = "img/Sindan02.png";
		}else if (job.equals("魔導士")){
			jobId = "img/Sindan03.png";
		} else if (job.equals("ナイト")) {
			jobId = "img/Sindan04.png";
		} else if(job.equals("魔王")) {
			jobId = "img/Sindan05.png";
		}
		return jobId;
	}
}
