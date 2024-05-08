package model;

import java.util.Random;

public class Sindan {
	private String job;
	private String jobId;
	public String getJob() {return job;}
	public String getJobId() {return jobId;}
	public void setJob(String job) {this.job = job;}
	public void setJobId(String jobId) {this.jobId = jobId;}

	public static void SindanJob() {
		Sindan sindan = new Sindan();
		int r = new Random().nextInt(5) + 1;
		switch(r) {
		case 1:
			sindan.setJob("勇者");
			sindan.setJobId("01");
			break;
		case 2:
			sindan.setJob("戦士");
			sindan.setJobId("02");
			break;
		case 3:
			sindan.setJob("魔導士");
			sindan.setJobId("03");
			break;
		case 4:
			sindan.setJob("ナイト");
			sindan.setJobId("04");
			break;
		case 5:
			sindan.setJob("魔王");
			sindan.setJobId("05");
			break;
		}
		System.out.println(sindan.getJob());
		System.out.println(sindan.getJobId());
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
		return weapon;
	}
}
