package com.mvc.format;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// show intial welcom eform 
	@RequestMapping("/showForm")
	public String showForm ()
	{
		return "helloWorldForm";
	}
	
	//process the form entered
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloWorldResponse";
	}
	
}
