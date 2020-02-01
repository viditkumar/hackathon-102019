package com.sc.dbhack.dao;

import java.util.List;

import com.sc.dbhack.model.CompanyDetails;
import com.sc.dbhack.model.ProjectDetails;
import com.sc.dbhack.model.Response;

public interface ProjectDao {
	
	public Response updateProject(ProjectDetails projectDetails);
	public Response deleteProject(String projectId);
	
	public void noOfProjectViews(String projectId);
	public ProjectDetails detailOfProject(String projectId);
	
	public CompanyDetails detailOfCompany(String companyId);
	
	
	
	public List<ProjectDetails> viewProjects(String id);
	public List<ProjectDetails> investorPortfolio(String id);
	
	public List<ProjectDetails> adminViewAllProjects();
	public List<CompanyDetails> adminViewAllCompanies();

}
