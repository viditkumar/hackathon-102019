package com.sc.dbhack.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sc.dbhack.dao.InvestorDao;
import com.sc.dbhack.model.InvestorDetails;
import com.sc.dbhack.model.Response;

@Repository("investorDao")
@PropertySource("classpath:dbhack.properties")
public class InvestorDaoImpl implements InvestorDao {


	@Value("${sc.dbhack.viewallinvestors}")
	private String viewallinvestors;
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public Response createInvite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteInvite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response dealStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvestorDetails> viewInvestors(String projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvestorDetails> viewAllInvestors(String companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvestorDetails> adminViewAllInvestors(){

		List<InvestorDetails> investorDetail = jdbcTemplateObject.query(
			viewallinvestors,
			(rs, rowNum) ->
			new InvestorDetails(
				rs.getString("investorId"),
				rs.getString("investorName"),
				rs.getString("description"),
				rs.getString("sector"),
				rs.getString("interestedIn"),
				rs.getString("webUrl"),
				rs.getString("iconUrl"),
				rs.getString("expectedToInvest"),
				rs.getString("investorPwd"),
				rs.getString("approved"),
				rs.getString("accountNo"),
				rs.getString("ifsCode")
			)
		);
		return investorDetail;
	}

}
