package com.ashokit.ies.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Application_Registration")
public class ApplicantRegistrationEntity {

	@Id
	@Column(name="Application_No")
	@GenericGenerator(name="AR_Seq_Gen",strategy="com.ashokit.ies.admin.generator.ApplicationGenerator")
	@GeneratedValue(generator="AR_Seq_Gen")
	private String appNo;
	@Column(name="Application_id")
	private Integer aid;
	@Column(name="First_Name")
	private String fname;
	@Column(name="Last_Name")
	private String lname;
	@Column(name="Date_of_Birth")
	private String dob;
	@Column(name="Gender")
	private String gender;
	@Column(name="SSN_No")
	private String ssnNo;
	@Column(name="Pnone_No")
	private Long phNo;
	@Column(name="Email")
	private String email;
	public ApplicantRegistrationEntity() {
		super();
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAppNo() {
		return appNo;
	}
	public void setAppNo(String appNo) {
		this.appNo = appNo;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(String ssnNo) {
		this.ssnNo = ssnNo;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ApplicantRegistrationEntity [aid=" + aid + ", appNo=" + appNo + ", fname=" + fname + ", lname=" + lname
				+ ", dob=" + dob + ", gender=" + gender + ", ssnNo=" + ssnNo + ", phNo=" + phNo + ", email=" + email
				+ "]";
	}
	
	
}
