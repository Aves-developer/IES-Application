package com.ashokit.ies.admin.domain;

import lombok.Data;

@Data
public class ApplicantRegistration {
	
	
	private String appNo;
	private Integer aid;
	private String fname;
	private String lname;
	private String dob;
	private String gender;
	private Long ssnNo;
	private Long phNo;
	private String email;

}
