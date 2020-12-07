package com.ashokit.ies.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Plan_Tab")
public class PlanEntity {
	@Id
	@GeneratedValue
	@Column(name="Plan_Id")
	private Integer pid;
	@Column(name="Plan_Name")
	private String pname;
	@Column(name="Plan_Description")
	private String pdesc;
	@Column(name="Plan_Start_Date")
	private String psdate;
	@Column(name="Plan_End_Date")
	private String pedate;
	public PlanEntity() {
		super();
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public String getPsdate() {
		return psdate;
	}
	public void setPsdate(String psdate) {
		this.psdate = psdate;
	}
	public String getPedate() {
		return pedate;
	}
	public void setPedate(String pedate) {
		this.pedate = pedate;
	}
	@Override
	public String toString() {
		return "PlanEntity [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", psdate=" + psdate + ", pedate="
				+ pedate + "]";
	}
	
}
