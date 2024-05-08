package model;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private String job;
	private String weapon;
	private String jobId;
	public User() {}
	public User(String name) {
		this.name = name;
	}
	public User(String name, String job, String weapon, String jobId) {
		this.name = name;
		this.job = job;
		this.weapon = weapon;
		this.jobId = jobId;
	}
	public String getName() {return name;}
	public String getJob() {return job;}
	public String getWeapon() {return weapon; }
	public String getJobId() {return jobId;}
	public void setJob(String job) {this.job = job;}
	public void setWeapon(String weapon) {this.weapon = weapon;}
	public void setJobId(String jobId) {this.jobId = jobId;}

}
