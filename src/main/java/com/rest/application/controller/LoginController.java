package com.rest.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling the requests for library management application
 * 
 * @author Dinesh
 *
 */

@RestController
@RequestMapping(path = "/search")
public class LoginController
{
	@RequestMapping(method = RequestMethod.GET, value="/check")
	@ResponseBody
	public String controllerCheck()
	{
		return "Hello";
	}

}
