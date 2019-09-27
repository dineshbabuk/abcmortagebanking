package com.rest.application.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.application.service.BankingService;
import com.rest.application.service.BankingServiceImpl;

/**
 * Controller class for handling account related functions
 * 
 * @author Dinesh
 * @author Pamela
 *
 */
@RestController
@RequestMapping("/mortage")
public class BankingController
{
@Autowired
BankingService bankingServiceImpl;
	
	@RequestMapping(method = RequestMethod.GET, value = "/usersearch/{criteria}")
	public List<String> searchAllUsers(@PathVariable(value = "criteria") String criteria)
	{
		List<String> bookDetails = new ArrayList<>();
		System.out.println("criteria ::" + criteria);
		return bookDetails;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/create/{accountNumber}")
	public String createMortagageAccount(@PathVariable(value = "accountNumber") String accountNumber) throws Exception
	{
		return bankingServiceImpl.createMortagageAccount(accountNumber);
		
		
		
	}


}
