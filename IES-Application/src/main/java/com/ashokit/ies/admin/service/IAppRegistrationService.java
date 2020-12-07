package com.ashokit.ies.admin.service;

import java.util.List;

import com.ashokit.ies.admin.domain.ApplicantRegistration;

public interface IAppRegistrationService {
	
	public boolean saveAppRegistration(ApplicantRegistration appregis);
	public List<ApplicantRegistration> getAllAppRegistration();
	public boolean updateRegistration(Integer id);
	public boolean deleteRegistration(String appNo);
	public ApplicantRegistration editAppRegistration(String appNo);
	public boolean citizenStateCheck(String ssnNumber);
	public ApplicantRegistration findByAppNo(String appNo);
	

}
