package com.ashokit.ies.admin.service;

import java.util.List;

import com.ashokit.ies.admin.domain.AccountRegistration;

public interface IRegistrationService {
		
		public boolean saveRegistration(AccountRegistration accRegistration);
		public List<AccountRegistration> fetchAllRecord();
		public AccountRegistration getRegistrationById(Integer id);
		public AccountRegistration editRegistrationData(Integer id);
		public boolean upadateRegistration(AccountRegistration accRegistration);
		public boolean deleteRegistration(Integer id);
		public boolean isUniqeEmail(String email);
		
		public boolean sendSuccessMessage(String to,String subject,String body);
       public String getSuccesMailBody(AccountRegistration accRegistration);
	}

