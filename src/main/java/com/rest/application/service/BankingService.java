package com.rest.service;

import java.util.List;

public interface BankingService {

	public List<String> searchAllUsers(String criteria);
	
	public String createMortagageAccount(String accountNumber);
	
}