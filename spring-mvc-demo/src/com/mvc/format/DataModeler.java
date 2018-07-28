package com.mvc.format;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataModeler {
	@RequestMapping("/dataModeler")
public String dataModeler()
{

		
	return "dataModelView";
	
}
}
