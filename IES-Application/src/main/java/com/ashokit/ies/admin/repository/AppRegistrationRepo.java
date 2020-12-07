package com.ashokit.ies.admin.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ashokit.ies.admin.entity.ApplicantRegistrationEntity;


public interface AppRegistrationRepo extends JpaRepository<ApplicantRegistrationEntity, Serializable> {
	public Optional<ApplicantRegistrationEntity> findByAppNo(String appNo);
	
}
