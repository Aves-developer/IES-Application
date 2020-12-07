package com.ashokit.ies.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name="Co_Triggers_Tab")
public class CoTriggersEntity {

	@Id
	@GeneratedValue
	@Column(name="Tri_id")
	private Integer triId;
	@Column(name="case_num")
	private Integer caseNum;
	@Column(name="create_date")
	private Date createDate;
	@Column(name="trg_status")
	private String trgStatus;
	@Column(name="update_date")
	private Date updateDate;
	
	
		
}
