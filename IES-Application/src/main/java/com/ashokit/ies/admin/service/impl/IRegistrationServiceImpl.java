package com.ashokit.ies.admin.service.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.admin.domain.AccountRegistration;
import com.ashokit.ies.admin.entity.RegistrationEntity;
import com.ashokit.ies.admin.repository.AccRegistrationRepository;
import com.ashokit.ies.admin.service.IRegistrationService;
import com.ashokit.ies.admin.utils.EmailUtils;
@Service
public class IRegistrationServiceImpl implements IRegistrationService {

	@Autowired
	private EmailUtils emailUtils ;
	@Autowired
	private AccRegistrationRepository repo;
	@Override
	public boolean saveRegistration(AccountRegistration accRegistration) {
		RegistrationEntity entity= new RegistrationEntity();
		BeanUtils.copyProperties(accRegistration,entity);
		RegistrationEntity saved=repo.save(entity);
		if(saved.getId()!=null) {
			String to=accRegistration.getEmail();
			String subject= "Registration Successfull ! IES";
			String body=getSuccesMailBody(accRegistration);
			sendSuccessMessage(to, subject, body);
			return true;
		}
		return false;
	}

	@Override
	public List<AccountRegistration> fetchAllRecord() {
	List<AccountRegistration> acclist=new ArrayList<AccountRegistration>();
		
	List<RegistrationEntity> listAcc=repo.findAll();
	listAcc.forEach(entity->{
		AccountRegistration ar=new AccountRegistration();
		BeanUtils.copyProperties(entity, ar);
		acclist.add(ar);
	});
	
		return acclist;
	}

	@Override
	public AccountRegistration getRegistrationById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountRegistration editRegistrationData(Integer id) {
	Optional<RegistrationEntity> optional=repo.findById(id);
	   if(optional.isPresent()) {
		 RegistrationEntity entity=  optional.get();
		 AccountRegistration ac=new AccountRegistration();
		 BeanUtils.copyProperties(entity, ac);
		 return ac;
	   }
	
		return null;
	}

	@Override
	public boolean upadateRegistration(AccountRegistration accRegistration) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRegistration(Integer id) {
		repo.deleteById(id);
		return true;
	}

	@Override
	public boolean isUniqeEmail(String email) {
	RegistrationEntity reg=	repo.findByEmail(email);
		return reg!=null? false:true;
	}
	
	@Override
	public boolean sendSuccessMessage(String to, String subject, String body) {
		return emailUtils.sendMail(to, subject, body);
	}
	@Override
	public String getSuccesMailBody(AccountRegistration acc) {
		String fileName="Mail_Body_Template";
		List<String> replacedLine=null;
		String mailBody=null;
		try {
			Path path=Paths.get(fileName, "");
			@SuppressWarnings("resource")
			Stream<String> lines =Files.lines(path);
			replacedLine= lines.map(line -> line.replace("{FIRSTNAME}", acc.getFirstName())
					                         .replace("{LASTNAME}", acc.getLastName()))
			                                 .collect(Collectors.toList());
				mailBody=	String.join("", replacedLine);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mailBody;
	}

}