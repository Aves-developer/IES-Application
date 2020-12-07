package com.ashokit.ies.admin.entity;

import java.sql.Blob;

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
@Table(name="CO_PDFS")
public class CoPdfsEntity {
	@Id
	@GeneratedValue
	@Column(name="CO_PDF_ID")
	private Integer coPdfId;
	@Column(name="PLAN_STATUS")
	private String planStatus;
	@Column(name="CASE_STATUS")
	private String caseStaus;
	@Column(name="PDF_DOCUMENT")
	private Blob pdfDocument;
	@Column(name="PLAN_NAME")
	private String planName;

}


