package com.ashokit.ies.admin.entity;

public class CitizenResponse {
	
	private String ssnNumber;
	private String fname;
	private String lname;
	private String gender;
	private String dob;
	private String state;
	public CitizenResponse() {
		super();
	}
	public String getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "CitizenResponse [ssnNumber=" + ssnNumber + ", fname=" + fname + ", lname=" + lname + ", gender="
				+ gender + ", dob=" + dob + ", state=" + state + "]";
	}


}
