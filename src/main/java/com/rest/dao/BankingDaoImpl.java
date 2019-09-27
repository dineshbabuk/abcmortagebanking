package com.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BankingDaoImpl {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	/**
	 * Dao method to check if user account exists
	 * 
	 * @param 
	 * @return boolean
	 * @throws Exception
	 */
	/*
	 * private boolean userExists(AccountDetails accountDetails) {
	 * 
	 * String sql = "SELECT count(*) FROM account_details WHERE Account_Number  = ?"; int count
	 * = jdbcTemplate.queryForObject(sql, Integer.class,
	 * accountDetails.getUserId()); if (count == 0) { return false; } else
	 * { return true; } }
	 */

}
