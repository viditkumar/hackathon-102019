package com.sc.dbhack.dao;

import com.sc.dbhack.model.TransactionDetails;

public interface TransactionDao {
	
	public String generateTransactionId();
	public void createTransaction(TransactionDetails transactionDetail);

}
