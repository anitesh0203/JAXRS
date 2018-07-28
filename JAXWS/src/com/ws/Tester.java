package com.ws;

import javax.xml.ws.Endpoint;

public class Tester {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:4301/anitesh",new CarImplementation());
		
	}

}
