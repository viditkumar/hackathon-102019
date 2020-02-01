package com.sc.dbhack.model;

public class InvestorDetails {
	
	private String investorId;
	private String investorName;
	private String description;
	private String sector;
	private String interestedIn;
	private String webUrl;
	private String iconUrl;
	private String expectedToInvest;
	private String investorPwd;
	private String approved;
	private String accountNo;
	private String ifsCode;
	
	protected InvestorDetails(){
		
	}
	
	public InvestorDetails(String investorId, String investorName, String description, String sector,
			String interestedIn, String webUrl, String iconUrl, String expectedToInvest, String investorPwd,
			String approved, String accountNo, String ifsCode) {
		super();
		this.investorId = investorId;
		this.investorName = investorName;
		this.description = description;
		this.sector = sector;
		this.interestedIn = interestedIn;
		this.webUrl = webUrl;
		this.iconUrl = iconUrl;
		this.expectedToInvest = expectedToInvest;
		this.investorPwd = investorPwd;
		this.approved = approved;
		this.accountNo = accountNo;
		this.ifsCode = ifsCode;
	}

	public String getInvestorId() {
		return investorId;
	}

	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getInterestedIn() {
		return interestedIn;
	}

	public void setInterestedIn(String interestedIn) {
		this.interestedIn = interestedIn;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getExpectedToInvest() {
		return expectedToInvest;
	}

	public void setExpectedToInvest(String expectedToInvest) {
		this.expectedToInvest = expectedToInvest;
	}

	public String getInvestorPwd() {
		return investorPwd;
	}

	public void setInvestorPwd(String investorPwd) {
		this.investorPwd = investorPwd;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfsCode() {
		return ifsCode;
	}

	public void setIfsCode(String ifsCode) {
		this.ifsCode = ifsCode;
	}

}
