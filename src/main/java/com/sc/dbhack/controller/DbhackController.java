package com.sc.dbhack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sc.dbhack.dao.InvestorDao;
import com.sc.dbhack.dao.ProjectDao;
import com.sc.dbhack.dao.TransactionDao;
import com.sc.dbhack.dao.UsersDao;
import com.sc.dbhack.daoimpl.ProjectDaoImpl;
import com.sc.dbhack.daoimpl.TransactionDaoImpl;
import com.sc.dbhack.daoimpl.UsersDaoImpl;
import com.sc.dbhack.model.Admin;
import com.sc.dbhack.model.ApprovalDetails;
import com.sc.dbhack.model.CompanyDetails;
import com.sc.dbhack.model.InvestorDetails;
import com.sc.dbhack.model.ProjectDetails;
import com.sc.dbhack.model.Response;
import com.sc.dbhack.model.TransactionDetails;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DbhackController {

	@Autowired
	private UsersDao userDao;
	
	@Autowired
	private TransactionDao transactionDao;
	
	@Autowired
	private ProjectDao projectDao;
	
	@Autowired
	private InvestorDao investorDao;
	
//	UsersDao userDao = new UsersDaoImpl();
//	TransactionDao transactionDao = new TransactionDaoImpl();
//	ProjectDao projectDao = new ProjectDaoImpl();

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(path = "/testAPI")
	@ResponseBody
	public String testAPI() {
		return "Hello StatusCode:200";
	}

	// Sign-Up as company
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/signup/companies")
	@ResponseBody
	public Response createCompany(@RequestBody CompanyDetails companyDetails) {

		companyDetails.setCompanyId("C" + userDao.generateCompanyId());
//		companyDetails.setCompanyId("123");
		companyDetails.setApproved("P");

		userDao.companySignUp(companyDetails);
		return new Response("Admin Approval is Pending", "Done", companyDetails.getCompanyId());
	}


	
	// Sign-Up as investor
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/signup/investors")
	@ResponseBody
	public Response createInvestor(@RequestBody InvestorDetails investorDetails) {

		investorDetails.setInvestorId("I" + userDao.generateInvestorId());
		investorDetails.setApproved("P");
		
		userDao.investorSignUp(investorDetails);
		return new Response("Admin Approval is Pending", "Done", investorDetails.getInvestorId());
	}

	// Login as company
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(path = "/login/companies")
	@ResponseBody
	public Response loginCompany(@RequestBody CompanyDetails companyDetails) {
		return userDao.companyLogin(companyDetails);
	}
	
	// Login as investor
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/login/investors")
	@ResponseBody
	public Response loginInvestor(@RequestBody InvestorDetails investorDetails) {
		return userDao.investorLogin(investorDetails);
	}
	
	// Login as admin
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/login/admin")
	@ResponseBody
	public Response loginAdmin(@RequestBody Admin admin) {
		return userDao.adminLogin(admin);
	}

	// Approval
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/approve")
	@ResponseBody
	public Response approveRequest(@RequestBody ApprovalDetails approvalDetail) {

		if (approvalDetail.getId().substring(0, 1).equalsIgnoreCase("C")) {
			userDao.approveCompany(approvalDetail.getId(), approvalDetail.getApproveStatus());
		} else if (approvalDetail.getId().substring(0, 1).equalsIgnoreCase("I")) {
			userDao.approveInvestor(approvalDetail.getId(), approvalDetail.getApproveStatus());
		} else {
			userDao.approveProject(approvalDetail.getId(), approvalDetail.getApproveStatus());
		}
		if(approvalDetail.getApproveStatus().equalsIgnoreCase("Y")){
			return new Response("Approved to " + approvalDetail.getApproveStatus(), "Approved", null);
		} else {
			return new Response("Approved to " + approvalDetail.getApproveStatus(), "Rejected", null);
		}
	}

	// Create/Edit Project
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/update/project")
	@ResponseBody
	public Response updateProject(@RequestBody ProjectDetails projectDetails) {
		return projectDao.updateProject(projectDetails);
	}
	
	// Delete Project
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/delete/project/{projectId}")
	@ResponseBody
	public Response deleteProject(@PathVariable String projectId) {

		return projectDao.deleteProject(projectId);
	}
	
	// Add account details

	// Project/Investor Wall

	// Get Project Details
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(path = "/getprojectdetails/{id}")
	@ResponseBody
	public ProjectDetails detailOfProject(@PathVariable String id) {

		return projectDao.detailOfProject(id);
	}
	
	// Get company detail
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(path = "/getcompanydetails/{id}")
	@ResponseBody
	public CompanyDetails detailOfCompany(@PathVariable String id) {

		return projectDao.detailOfCompany(id);
	}
	
	// Invite companies

	// Transaction
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/transaction")
	@ResponseBody
	public Response transaction(@RequestBody TransactionDetails transactionDetail) {

		transactionDetail.setTransactionId(transactionDao.generateTransactionId());

		transactionDao.createTransaction(transactionDetail);
		return new Response("Transaction Successful", "Done", transactionDetail.getTransactionId().toString());
	}

	// Investor portfolio
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/investorportfolio/{id}")
	@ResponseBody
	public List<ProjectDetails> getInvestorPortfolio(@PathVariable String id) {

		List<ProjectDetails> projectList = projectDao.investorPortfolio(id);

		return projectList;
	}
	
	// List of projects to be viewed
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/listofprojects/{id}")
	@ResponseBody
	public List<ProjectDetails> getListOfProjects(@PathVariable String id) {

		List<ProjectDetails> projectList = projectDao.viewProjects(id);

		return projectList;
	}

	// Mail portfolio
	
	// View all projects (for admin)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(path = "/adminviewallprojects")
	@ResponseBody
	public List<ProjectDetails> getAllAdminProjects() {

		List<ProjectDetails> projectList = projectDao.adminViewAllProjects();
	
		return projectList;
	}

	// view all companies (for admin)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(path = "/adminviewallcompanies")
	@ResponseBody
	public List<CompanyDetails> getAllAdminCompaniess() {

		List<CompanyDetails> companyList = projectDao.adminViewAllCompanies();
	
		return companyList;
	}

	// view all investors (for admin)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(path = "/adminviewallinvestors")
	@ResponseBody
	public List<InvestorDetails> getAllAdminInvestors() {

		List<InvestorDetails> investorList = investorDao.adminViewAllInvestors();
	
		return investorList;
	}

}
