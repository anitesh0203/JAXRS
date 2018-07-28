package com.mobile;

import javax.xml.ws.Endpoint;

public class PublishingService {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:2345/mobile", new MobilePhoneImpleme());
	}

}
