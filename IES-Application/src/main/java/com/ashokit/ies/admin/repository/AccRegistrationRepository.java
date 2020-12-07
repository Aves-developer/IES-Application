package com.ashokit.ies.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.admin.entity.RegistrationEntity;

public interface AccRegistrationRepository extends JpaRepository<RegistrationEntity, Serializable> {

	public RegistrationEntity findByEmail(String email);
}
