package com.mobile;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class MobilePhoneImpleme extends ErrorHandler{
  
	@WebMethod
	public void result(int number, String mobileData)
	{
		
		MobilePhone mobile= new MobilePhone(number,mobileData);
		if (mobileData.equals("samsung"))
		{
			mobile.setName("Apple");
		}

		
		
		
		
	}
	
}
