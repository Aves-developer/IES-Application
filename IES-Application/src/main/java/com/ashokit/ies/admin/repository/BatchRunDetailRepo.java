package com.ashokit.ies.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.admin.entity.BatchRunDetailsEntity;

public interface BatchRunDetailRepo extends JpaRepository<BatchRunDetailsEntity, Serializable> {

}
