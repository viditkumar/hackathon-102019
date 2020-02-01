package com.sc.dbhack.model;

import java.util.Date;

public class Invites {
	
	private String invitedId;
	private String projectId;
	private String investorId;
	private Boolean dealDone;
	private Date date;
	
	public Invites(String invitedId, String projectId, String investorId, Boolean dealDone, Date date) {
		super();
		this.invitedId = invitedId;
		this.projectId = projectId;
		this.investorId = investorId;
		this.dealDone = dealDone;
		this.date = date;
	}

	public String getInvitedId() {
		return invitedId;
	}

	public void setInvitedId(String invitedId) {
		this.invitedId = invitedId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getInvestorId() {
		return investorId;
	}

	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	public Boolean getDealDone() {
		return dealDone;
	}

	public void setDealDone(Boolean dealDone) {
		this.dealDone = dealDone;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
