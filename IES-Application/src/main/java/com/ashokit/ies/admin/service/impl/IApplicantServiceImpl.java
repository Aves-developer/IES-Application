package com.ashokit.ies.admin.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.ies.admin.domain.ApplicantRegistration;
import com.ashokit.ies.admin.entity.ApplicantRegistrationEntity;
import com.ashokit.ies.admin.entity.CitizenResponse;
import com.ashokit.ies.admin.repository.AppRegistrationRepo;
import com.ashokit.ies.admin.response.Citizen;
import com.ashokit.ies.admin.service.IAppRegistrationService;



@Service
public class IApplicantServiceImpl implements IAppRegistrationService {

	@Autowired
	private AppRegistrationRepo repo;
	
	@Override
	public boolean saveAppRegistration(ApplicantRegistration appregis) {
		/*
		 * String url="http://localhost:9191/verify/get/{ssnNumber}"; RestTemplate
		 * rt=new RestTemplate();
		 * 
		 * ResponseEntity<Citizen> forentity=rt.getForEntity(url, Citizen.class); int
		 * codevalue=forentity.getStatusCodeValue(); if(codevalue==200) { Citizen
		 * citizen = forentity.getBody();
		 * 
		 * if(citizen.getState().equals("kentucky")) {
		 * 
		 * } }
		 */
		
		//save logic
		ApplicantRegistrationEntity entity=new ApplicantRegistrationEntity();
		BeanUtils.copyProperties(appregis, entity);
		 ApplicantRegistrationEntity save=repo.save(entity);
		return save!=null ? true : false ;
				
	}
	
	@Override
	public List<ApplicantRegistration> getAllAppRegistration() {
		List<ApplicantRegistration> listapp=new ArrayList<ApplicantRegistration>();
	List<ApplicantRegistrationEntity> entitylist=	repo.findAll();
	
		entitylist.forEach(entity->{
			ApplicantRegistration app=new ApplicantRegistration();
			BeanUtils.copyProperties(entity,app);
			listapp.add(app);
		});
		return listapp;
	}

	@Override
	public boolean updateRegistration(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRegistration(String appNo) {
		repo.deleteById(appNo);
		return true;
	}

	@Override
	public ApplicantRegistration editAppRegistration(String appNo) {
		
	Optional<ApplicantRegistrationEntity>optional=	 repo.findById(appNo);
	if(optional.isPresent()) {
	ApplicantRegistrationEntity appentity=	optional.get();
	ApplicantRegistration app=new ApplicantRegistration();
	BeanUtils.copyProperties(appentity, app);
	return app;
	}
		return null;
	}
	

	
	  @Override
	  public ApplicantRegistration findByAppNo(String appNo) {
	  Optional<ApplicantRegistrationEntity>optional=repo.findByAppNo(appNo);
	  if(optional.isPresent()) {
		  ApplicantRegistrationEntity entity=optional.get(); 
		  ApplicantRegistration app=new ApplicantRegistration();
	         BeanUtils.copyProperties(entity, app);
	  return app; 
	  }
	  return null;
	  }
	  
	 
	 @Override
	public boolean citizenStateCheck(String ssnNumber) {
	
		return false;
	}
	  
}
