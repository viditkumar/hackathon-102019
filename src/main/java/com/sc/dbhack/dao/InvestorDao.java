package com.sc.dbhack.dao;

import java.util.List;

import com.sc.dbhack.model.InvestorDetails;
import com.sc.dbhack.model.Response;

public interface InvestorDao {
	
	public Response createInvite();
	public Response deleteInvite();
	
	public Response dealStatus();
	
	public List<InvestorDetails> viewInvestors(String projectId);
	public List<InvestorDetails> viewAllInvestors(String companyId);
	
	public List<InvestorDetails> adminViewAllInvestors();

}
