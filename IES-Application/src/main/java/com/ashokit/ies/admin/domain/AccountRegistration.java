package com.ashokit.ies.admin.domain;

import lombok.Data;
@Data
public class AccountRegistration {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String dob;
	private String gender;
	private Long ssnNo;
	private Long phoneNo;
	private String role;
	
}