package com.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class SiteHelper extends CustomExceptionHandler{
	@WebMethod
	public String returnData(Product product, String input){
		if(input.equalsIgnoreCase("site"))
			return "www.google.com";
		else if(input.endsWith("port"))
			return "american ip";
		
		else 
			return new CustomExceptionHandler().exceptionHandler("404", "not found");
	}

}
