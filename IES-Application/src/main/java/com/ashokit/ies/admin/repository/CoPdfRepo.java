package com.ashokit.ies.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.admin.entity.CoPdfsEntity;

public interface CoPdfRepo extends JpaRepository<CoPdfsEntity, Serializable> {

}
