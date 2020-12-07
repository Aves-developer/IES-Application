package com.ashokit.ies.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="BATCH_RUN_DTLS")
public class BatchRunDetailsEntity {
@Id
@GeneratedValue
@Column(name="Batch_Run_Seq")
private Integer batchRunSeq;
@Column(name="Batch_Name")
private String batchName;
@Column(name="Batch_Run_Status")
private String batchRunStatus;
@Column(name="End_Date")
private Date endDate;
@Column(name="Instance_Num")
private Integer instanceNum;
@Column(name="Start_Date")
private Date startDate;

}
  
