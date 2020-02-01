package com.sc.dbhack.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sc.dbhack.dao.UsersDao;
import com.sc.dbhack.model.Admin;
import com.sc.dbhack.model.CompanyDetails;
import com.sc.dbhack.model.InvestorDetails;
import com.sc.dbhack.model.Response;

@Repository("userDao")
@PropertySource("classpath:dbhack.properties")
public class UsersDaoImpl implements UsersDao {
	
	@Value("${sc.dbhack.approvecompany}")
	private String approvecompany;
	@Value("${sc.dbhack.approveproject}")
	private String approveproject;
	@Value("${sc.dbhack.approveinvestor}")
	private String approveinvestor;
	@Value("${sc.dbhack.companyid}")
	private String companyid;
	@Value("${sc.dbhack.investorid}")
	private String investorid;
	@Value("${sc.dbhack.companysignup}")
	private String companysignup;
	@Value("${sc.dbhack.investorsignup}")
	private String investorsignup;
	@Value("${sc.dbhack.companyapproved}")
	private String companyapproved;
	@Value("${sc.dbhack.companypwd}")
	private String companypwd;
	@Value("${sc.dbhack.investorapproved}")
	private String investorapproved;
	@Value("${sc.dbhack.investorpwd}")
	private String investorpwd;
	@Value("${sc.dbhack.adminpwd}")
	private String adminpwd;
	@Value("${sc.dbhack.companyloginid}")
	private String companyloginid;
	@Value("${sc.dbhack.investorloginid}")
	private String investorloginid;
	
	@Autowired
    private JdbcTemplate jdbcTemplateObject;
	   
	@Override
	public int companySignUp(CompanyDetails companyDetails) {
		return jdbcTemplateObject.update(companysignup, 
				new Object[] {
									companyDetails.getCompanyId(),
									companyDetails.getCompanyName(),
									companyDetails.getDescription(),
									companyDetails.getSector(),
									companyDetails.getWebUrl(),
									companyDetails.getIconUrl(),
									companyDetails.getCompanyPwd(),
									companyDetails.getApproved(),
									companyDetails.getAccountNo(),
									companyDetails.getIfsCode()
							});
	}

	@Override
	public void investorSignUp(InvestorDetails investorDetails) {
		jdbcTemplateObject.update(investorsignup,
				new Object[] {
						investorDetails.getInvestorId(),
						investorDetails.getInvestorName(),
						investorDetails.getDescription(),
						investorDetails.getSector(),
						investorDetails.getInterestedIn(),
						investorDetails.getWebUrl(),
						investorDetails.getIconUrl(),
						investorDetails.getExpectedToInvest(),
						investorDetails.getInvestorPwd(),
						investorDetails.getApproved(),
						investorDetails.getAccountNo(),
						investorDetails.getIfsCode()
				});
	}

	@Override
	public Response adminLogin(Admin admin) {
		String adminPwd = jdbcTemplateObject.queryForObject(adminpwd,
				new Object[] { admin.getAdminId() }, String.class);
		
		if(adminPwd.equals(admin.getAdminPwd())){
			return new Response("Success", "Login Successful", null);
		} else {
			return new Response("Password Incorrect", null, null);
		}
	}

	@Override
	public Response companyLogin(CompanyDetails companyDetails) {
		
		String approvedState = jdbcTemplateObject.queryForObject(companyapproved,
				new Object[] { companyDetails.getCompanyName() }, String.class);
		String companyPwd = jdbcTemplateObject.queryForObject(companypwd,
				new Object[] { companyDetails.getCompanyName() }, String.class);
		String companyId = jdbcTemplateObject.queryForObject(companyloginid,
				new Object[] { companyDetails.getCompanyName() }, String.class);
		
		if(approvedState.equalsIgnoreCase("Y") && companyPwd.equals(companyDetails.getCompanyPwd())){
			return new Response("Success", "Login Successful", companyId);
		} else if(!companyPwd.equals(companyDetails.getCompanyPwd())){
			return new Response("Password Incorrect", null, companyId);
		} else {
			return new Response("Not Y", "Not Approved", companyId);
		}
	}

	@Override
	public Response investorLogin(InvestorDetails investorDetails) {
		String approvedState = jdbcTemplateObject.queryForObject(investorapproved,
				new Object[] { investorDetails.getInvestorName() }, String.class);
		String investorPwd = jdbcTemplateObject.queryForObject(investorpwd,
				new Object[] { investorDetails.getInvestorName() }, String.class);
		String investorId = jdbcTemplateObject.queryForObject(investorloginid,
				new Object[] { investorDetails.getInvestorName() }, String.class);
		
		if(approvedState.equalsIgnoreCase("Y") && investorPwd.equals(investorDetails.getInvestorPwd())){
			return new Response("Success", "Login Successful", null);
		} else if(!investorPwd.equals(investorDetails.getInvestorPwd())){
			return new Response("Password Incorrect", null, investorId);
		} else {
			return new Response("Not Y", "Not Approved", investorId);
		}
	}

	@Override
	public void approveCompany(String companyId, String approveStatus) {
		jdbcTemplateObject.update(approvecompany, approveStatus, companyId);
	}

	@Override
	public void approveProject(String projectId, String approveStatus) {
		jdbcTemplateObject.update(approveproject, approveStatus, projectId);
	}

	@Override
	public void approveInvestor(String investorId, String approveStatus) {
		jdbcTemplateObject.update(approveinvestor, approveStatus, investorId);
	}

	@Override
	public String generateCompanyId() {
		Long val = jdbcTemplateObject.queryForObject(companyid, new Object[] {}, Long.class);
		return val.toString();
	}

	@Override
	public String generateInvestorId() {
		Long val = jdbcTemplateObject.queryForObject(investorid, new Object[] {}, Long.class);
		return val.toString();
	}
}
