package com.rest.application.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController
{

	@RequestMapping(method = RequestMethod.GET, value = "/usersearch/{criteria}")
	@ResponseBody
	public List<String> searchAllUsers(@PathParam("criteria") String criteria)
	{
		List<String> bookDetails = new ArrayList<>();
		System.out.println("criteria ::" + criteria);
		return bookDetails;
	}

}
