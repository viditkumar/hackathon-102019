package com.sc.dbhack.model;

import java.util.Date;

public class TransactionDetails {

	private String transactionId;
	private String investorId;
	private String companyId;
	private String transactionAmt;
	private Date date;
	private String description;
	private String projectId;
	
	protected TransactionDetails(){
		
	}

	public TransactionDetails(String transactionId, String investorId, String companyId, String transactionAmt,
			Date date, String description, String projectId) {
		super();
		this.transactionId = transactionId;
		this.investorId = investorId;
		this.companyId = companyId;
		this.transactionAmt = transactionAmt;
		this.date = date;
		this.description = description;
		this.projectId = projectId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getInvestorId() {
		return investorId;
	}

	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getTransactionAmt() {
		return transactionAmt;
	}

	public void setTransactionAmt(String transactionAmt) {
		this.transactionAmt = transactionAmt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
}
