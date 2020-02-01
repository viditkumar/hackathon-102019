package com.sc.dbhack.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sc.dbhack.dao.TransactionDao;
import com.sc.dbhack.model.TransactionDetails;

@Repository("transactionDao")
@PropertySource("classpath:dbhack.properties")
public class TransactionDaoImpl implements TransactionDao {
	
	@Value("${sc.dbhack.transaction}")
	private String transaction;
	@Value("${sc.dbhack.transactionid}")
	private String transactionid;
	
	@Autowired
    private JdbcTemplate jdbcTemplateObject;

	@Override
	public void createTransaction(TransactionDetails transactionDetail) {
		jdbcTemplateObject.update(transaction, new Object[] {
				transactionDetail.getTransactionId(),
				transactionDetail.getInvestorId(),
				transactionDetail.getCompanyId(),
				transactionDetail.getTransactionAmt(),
				transactionDetail.getDescription(),
				transactionDetail.getProjectId()
		});
	}

	@Override
	public String generateTransactionId() {
		Long val = jdbcTemplateObject.queryForObject(transactionid, new Object[] {}, Long.class);
		return val.toString();
	}
}
