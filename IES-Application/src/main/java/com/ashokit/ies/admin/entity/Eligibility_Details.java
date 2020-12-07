package com.ashokit.ies.admin.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="eligibility_details")
public class Eligibility_Details {
	@Id
	private Integer ed_trace_id;
	private String benefit_amt;
	private Integer case_num;
	private Date create_dt;
	private String deniel_reason;
	private String plan_endDate;
	private String plan_name;
	private String plan_startdate;
	private String plan_status;
	private Date update_date;
	public Eligibility_Details() {
		super();
	}
	public Integer getEd_trace_id() {
		return ed_trace_id;
	}
	public void setEd_trace_id(Integer ed_trace_id) {
		this.ed_trace_id = ed_trace_id;
	}
	public String getBenefit_amt() {
		return benefit_amt;
	}
	public void setBenefit_amt(String benefit_amt) {
		this.benefit_amt = benefit_amt;
	}
	public Integer getCase_num() {
		return case_num;
	}
	public void setCase_num(Integer case_num) {
		this.case_num = case_num;
	}
	public Date getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}
	public String getDeniel_reason() {
		return deniel_reason;
	}
	public void setDeniel_reason(String deniel_reason) {
		this.deniel_reason = deniel_reason;
	}
	public String getPlan_endDate() {
		return plan_endDate;
	}
	public void setPlan_endDate(String plan_endDate) {
		this.plan_endDate = plan_endDate;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public String getPlan_startdate() {
		return plan_startdate;
	}
	public void setPlan_startdate(String plan_startdate) {
		this.plan_startdate = plan_startdate;
	}
	public String getPlan_status() {
		return plan_status;
	}
	public void setPlan_status(String plan_status) {
		this.plan_status = plan_status;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	@Override
	public String toString() {
		return "Eligibility_Details [ed_trace_id=" + ed_trace_id + ", benefit_amt=" + benefit_amt + ", case_num="
				+ case_num + ", create_dt=" + create_dt + ", deniel_reason=" + deniel_reason + ", plan_endDate="
				+ plan_endDate + ", plan_name=" + plan_name + ", plan_startdate=" + plan_startdate + ", plan_status="
				+ plan_status + ", update_date=" + update_date + "]";
	}
	

}
