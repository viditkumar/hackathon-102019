package com.sc.dbhack.model;

public class AccountDetails {
	
	private String userType;
	private String userId;
	private String accountNo;
	private String ifsCode;
	private String accountType;
	
	public AccountDetails(String userType, String userId, String accountNo, String ifsCode, String accountType) {
		super();
		this.userType = userType;
		this.userId = userId;
		this.accountNo = accountNo;
		this.ifsCode = ifsCode;
		this.accountType = accountType;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
