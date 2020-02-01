package com.sc.dbhack.model;

public class ApprovalDetails {
	
	private String id;
	private String userType;
	private String approveStatus;
	
	protected ApprovalDetails(){
		
	}
	
	public ApprovalDetails(String id, String userType, String approveStatus) {
		super();
		this.id = id;
		this.userType = userType;
		this.approveStatus = approveStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	
}
