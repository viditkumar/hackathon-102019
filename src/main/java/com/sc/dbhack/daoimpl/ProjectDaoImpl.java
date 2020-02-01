package com.sc.dbhack.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sc.dbhack.dao.*;
import com.sc.dbhack.model.CompanyDetails;
import com.sc.dbhack.model.ProjectDetails;
import com.sc.dbhack.model.Response;

@Repository("projectDao")
@PropertySource("classpath:dbhack.properties")
public class ProjectDaoImpl implements ProjectDao {
	
	@Value("${sc.dbhack.projectcompany}")
	private String projectcompany;
	
	@Value("${sc.dbhack.projectinvestor}")
	private String projectinvestor;
	@Value("${sc.dbhack.countid}")
	private String countid;
	@Value("${sc.dbhack.createproject}")
	private String createproject;
	@Value("${sc.dbhack.updateproject}")
	private String updateproject;
	@Value("${sc.dbhack.deleteproject}")
	private String deleteproject;
	@Value("${sc.dbhack.projectdetail}")
	private String projectdetail;
	@Value("${sc.dbhack.companydetail}")
	private String companydetail;
	@Value("${sc.dbhack.viewallprojects}")
	private String viewallprojects;
	@Value("${sc.dbhack.viewallcompanies}")
	private String viewallcompanies;
	@Value("${sc.dbhack.genprojectid}")
	private String genprojectid;

	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public Response updateProject(ProjectDetails projectDetails){
		
		int count = jdbcTemplateObject.queryForObject(countid, new Object[] { projectDetails.getProjectId() }, Integer.class);
		if(count > 0){
			jdbcTemplateObject.update(updateproject, 
					new Object[] {
							projectDetails.getProjectName(),
							projectDetails.getDescription(),
							projectDetails.getSector(),
							projectDetails.getCompanyId(),
							projectDetails.getProjectUrl(),
							projectDetails.getPitchingVideoUrl(),
							projectDetails.getMinInvestmentReqd(),
							projectDetails.getSustainabilityDesc(),
							projectDetails.getViews(),
							projectDetails.getProjectIcon(),
							projectDetails.getApproved(),
							projectDetails.getFundingReceived(),
							projectDetails.getProjectId()
					});
			
			return new Response("", "", "Updated");
		} else{
			Long val = jdbcTemplateObject.queryForObject(genprojectid, new Object[] {}, Long.class);
			projectDetails.setProjectId(val.toString());
			jdbcTemplateObject.update(createproject, 
					new Object[] {
							projectDetails.getProjectId(),
							projectDetails.getProjectName(),
							projectDetails.getDescription(),
							projectDetails.getSector(),
							projectDetails.getCompanyId(),
							projectDetails.getProjectUrl(),
							projectDetails.getPitchingVideoUrl(),
							projectDetails.getMinInvestmentReqd(),
							projectDetails.getSustainabilityDesc(),
							projectDetails.getViews(),
							projectDetails.getProjectIcon(),
							projectDetails.getApproved(),
							projectDetails.getFundingReceived()
					});
			return new Response("", "", "New project Created");
		}
	}
	
	@Override
	public Response deleteProject(String projectId){
		int count = jdbcTemplateObject.queryForObject(countid, new Object[] { projectId }, Integer.class);
		if(count > 0){
			jdbcTemplateObject.update(deleteproject, projectId);
			return new Response("", "", "Deleted");
		} else{
			return new Response("", "", "Project Not Found");
		}
	}
	
	@Override
	public List<ProjectDetails> viewProjects(String id){
		
		List<ProjectDetails> projectDetail = jdbcTemplateObject.query(
				projectcompany,
                (rs, rowNum) ->
                        new ProjectDetails(
                        		rs.getString("projectId"),
                                rs.getString("projectName"),
                                rs.getString("description"),
                                rs.getString("sector"),
                                rs.getString("companyId"),
                                rs.getString("projectUrl"),
                                rs.getString("pitchingVideoUrl"),
                                rs.getString("minInvestmentReqd"),
                                rs.getString("sustainabilityDesc"),
                                rs.getString("views"),
                                rs.getString("projectIcon"),
                                rs.getString("approved"),
                                rs.getString("fundingReceived")
                        ),
                id
        );
		return projectDetail;
	}
	
	@Override
	public List<ProjectDetails> investorPortfolio(String id) {
		List<ProjectDetails> projectDetail = jdbcTemplateObject.query(
				projectinvestor,
                (rs, rowNum) ->
                        new ProjectDetails(
                        		rs.getString("projectId"),
                                rs.getString("projectName"),
                                rs.getString("description"),
                                rs.getString("sector"),
                                rs.getString("companyId"),
                                rs.getString("projectUrl"),
                                rs.getString("pitchingVideoUrl"),
                                rs.getString("minInvestmentReqd"),
                                rs.getString("sustainabilityDesc"),
                                rs.getString("views"),
                                rs.getString("projectIcon"),
                                rs.getString("approved"),
                                rs.getString("fundingReceived")
                        ),
                id
        );
		return projectDetail;
	}
	
	@Override
	public void noOfProjectViews(String projectId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectDetails detailOfProject(String projectId) {
		ProjectDetails projectDetails = jdbcTemplateObject.queryForObject(
				projectdetail,
				new Object[]{projectId},
				(rs, rowNum) ->
				new ProjectDetails(
				rs.getString("projectId"),
				rs.getString("projectName"),
				rs.getString("description"),
				rs.getString("sector"),
				rs.getString("companyId"),
				rs.getString("projectUrl"),
				rs.getString("pitchingVideoUrl"),
				rs.getString("minInvestmentReqd"),
				rs.getString("sustainabilityDesc"),
				rs.getString("views"),
				rs.getString("projectIcon"),
				rs.getString("approved"),
				rs.getString("fundingReceived")
			)
		);
		return projectDetails;
	}

	@Override
	public CompanyDetails detailOfCompany(String companyId) {
		CompanyDetails companyDetails = jdbcTemplateObject.queryForObject(
				companydetail,
				new Object[]{companyId},
				(rs, rowNum) ->
				new CompanyDetails(
					rs.getString("companyId"),
					rs.getString("companyName"),
					rs.getString("description"),
					rs.getString("sector"),
					rs.getString("webUrl"),
					rs.getString("iconUrl"),
					rs.getString("companyPwd"),
					rs.getString("approved"),
					rs.getString("accountNo"),
					rs.getString("ifsCode")
			)
		);
		return companyDetails;
	}

	@Override
	public List<ProjectDetails> adminViewAllProjects(){

		List<ProjectDetails> projectDetail = jdbcTemplateObject.query(
		viewallprojects,
		new Object[]{},
		(rs, rowNum) ->
		new ProjectDetails(
				rs.getString("projectId"),
				rs.getString("projectName"),
				rs.getString("description"),
				rs.getString("sector"),
				rs.getString("companyId"),
				rs.getString("projectUrl"),
				rs.getString("pitchingVideoUrl"),
				rs.getString("minInvestmentReqd"),
				rs.getString("sustainabilityDesc"),
				rs.getString("views"),
				rs.getString("projectIcon"),
				rs.getString("approved"),
				rs.getString("fundingReceived")
			)
		);
		return projectDetail;
	}

	@Override
	public List<CompanyDetails> adminViewAllCompanies(){

		List<CompanyDetails> CompanyDetail = jdbcTemplateObject.query(
		viewallcompanies,
		new Object[]{},
		(rs, rowNum) ->
			new CompanyDetails(
					rs.getString("companyId"),
					rs.getString("companyName"),
					rs.getString("description"),
					rs.getString("sector"),
					rs.getString("webUrl"),
					rs.getString("iconUrl"),
					rs.getString("companyPwd"),
					rs.getString("approved"),
					rs.getString("accountNo"),
					rs.getString("ifsCode")
			)
		);
		return CompanyDetail;
	}

}
