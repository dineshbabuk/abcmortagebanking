package com.rest.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.application.dao.BankingDao;

@Service
public class BankingServiceImpl implements BankingService{

	@Autowired
	BankingDao bankingDao;
	
	@Override
	public List<String> searchAllUsers(String criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createMortagageAccount(String accountNumber) throws Exception {

		return bankingDao.createMortagageAccount(accountNumber);
		
		 
	}

}
