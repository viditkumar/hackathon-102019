package com.sc.dbhack.dao;

import com.sc.dbhack.model.Admin;
import com.sc.dbhack.model.CompanyDetails;
import com.sc.dbhack.model.InvestorDetails;
import com.sc.dbhack.model.Response;

public interface UsersDao {
	
	public int companySignUp(CompanyDetails companyDetails);
	public void investorSignUp(InvestorDetails investorDetails);
	
	public String generateCompanyId();
	public String generateInvestorId();
	
	public Response adminLogin(Admin admin);
	public Response companyLogin(CompanyDetails companyDetails);
	public Response investorLogin(InvestorDetails investorDetails);
	
	public void approveCompany(String companyId, String approveStatus);
	public void approveProject(String projectId, String approveStatus);
	public void approveInvestor(String investorId, String approveStatus);

}
