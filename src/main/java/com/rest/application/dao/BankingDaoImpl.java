package com.rest.application.dao;

import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.rest.application.exception.AccountDoesnotExistException;
import com.rest.application.model.AccountDetails;

@Repository
public class BankingDaoImpl implements BankingDao{


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
	
	 private boolean accountExists(String accountNumber) {
	 
	 String sql = "SELECT count(*) FROM account_details WHERE Account_Number  = ?"; int count
	 = jdbcTemplate.queryForObject(sql, Integer.class,
			 accountNumber); if (count == 0) { return false; } else
	 { return true; } }
	 

	/**
	 * Dao method to create new mortagage account
	 * 
	 * @param accountNumber
	 * @return String
	 * @throws Exception
	 */
	public String createMortagageAccount(String accountNumber) throws Exception {

		if (accountExists(accountNumber)) {

			String sql = "INSERT INTO Mortgage_Account_Details (Account_Number , Available_Balance) values (?, ?)";

			KeyHolder keyHolder = new GeneratedKeyHolder();
			jdbcTemplate.update(connection -> {
				PreparedStatement ps = connection.prepareStatement(sql, new String[] { "ticket_id" });
				ps.setString(1, accountNumber);
				ps.setDouble(2, 0.0);
				return ps;
			}, keyHolder);

			//final int newAppointmentId = keyHolder.getKey().intValue();

			//newCarAppointmentDetails.setAppointmentId(newAppointmentId);
		} else
			throw new AccountDoesnotExistException(accountNumber); 
		return "Mortagage Account created successfully";

	}


}
