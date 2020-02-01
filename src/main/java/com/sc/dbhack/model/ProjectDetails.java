package com.sc.dbhack.model;

public class ProjectDetails {
	
	private String projectId;
	private String projectName;
	private String description;
	private String sector;
	private String companyId;
	private String projectUrl;
	private String pitchingVideoUrl;
	private String minInvestmentReqd;
	private String sustainabilityDesc;
	private String views;
	private String projectIcon;
	private String approved;
	private String fundingReceived;
	
	protected ProjectDetails(){
		
	}
	
	public ProjectDetails(String projectId, String projectName, String description, String sector, String companyId,
			String projectUrl, String pitchingVideoUrl, String minInvestmentReqd, String sustainabilityDesc,
			String views, String projectIcon, String approved, String fundingReceived) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.description = description;
		this.sector = sector;
		this.companyId = companyId;
		this.projectUrl = projectUrl;
		this.pitchingVideoUrl = pitchingVideoUrl;
		this.minInvestmentReqd = minInvestmentReqd;
		this.sustainabilityDesc = sustainabilityDesc;
		this.views = views;
		this.projectIcon = projectIcon;
		this.approved = approved;
		this.fundingReceived = fundingReceived;
	}
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getProjectUrl() {
		return projectUrl;
	}
	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}
	public String getPitchingVideoUrl() {
		return pitchingVideoUrl;
	}
	public void setPitchingVideoUrl(String pitchingVideoUrl) {
		this.pitchingVideoUrl = pitchingVideoUrl;
	}
	public String getMinInvestmentReqd() {
		return minInvestmentReqd;
	}
	public void setMinInvestmentReqd(String minInvestmentReqd) {
		this.minInvestmentReqd = minInvestmentReqd;
	}
	public String getSustainabilityDesc() {
		return sustainabilityDesc;
	}
	public void setSustainabilityDesc(String sustainabilityDesc) {
		this.sustainabilityDesc = sustainabilityDesc;
	}
	public String getViews() {
		return views;
	}
	public void setViews(String views) {
		this.views = views;
	}
	public String getProjectIcon() {
		return projectIcon;
	}
	public void setProjectIcon(String projectIcon) {
		this.projectIcon = projectIcon;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getFundingReceived() {
		return fundingReceived;
	}
	public void setFundingReceived(String fundingReceived) {
		this.fundingReceived = fundingReceived;
	}
	
}
