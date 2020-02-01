package com.sc.dbhack.model;

public class CompanyDetails {
	
	private String companyId;
	private String companyName;
	private String description;
	private String sector;
	private String webUrl;
	private String iconUrl;
	private String companyPwd;
	private String approved;
	private String accountNo;
	private String ifsCode;
	
	protected CompanyDetails(){
		
	}

	public CompanyDetails(String companyId, String companyName, String description, String sector, String webUrl,
			String iconUrl, String companyPwd, String approved, String accountNo, String ifsCode) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.description = description;
		this.sector = sector;
		this.webUrl = webUrl;
		this.iconUrl = iconUrl;
		this.companyPwd = companyPwd;
		this.approved = approved;
		this.accountNo = accountNo;
		this.ifsCode = ifsCode;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getCompanyPwd() {
		return companyPwd;
	}

	public void setCompanyPwd(String companyPwd) {
		this.companyPwd = companyPwd;
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
