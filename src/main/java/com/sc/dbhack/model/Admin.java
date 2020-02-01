package com.sc.dbhack.model;

public class Admin {
	
	private String adminId;
	private String adminPwd;
	
	protected Admin(){
		
	}
	
	public Admin(String adminId, String adminPwd) {
		super();
		this.adminId = adminId;
		this.adminPwd = adminPwd;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	
}
