package com.sc.dbhack.dao;

import com.sc.dbhack.model.Response;

public interface AccountDao {
	
	public Response createAccount();
	public Response deleteAccount();
	public Response updateAccount();
	public Response viewAccount();

}
