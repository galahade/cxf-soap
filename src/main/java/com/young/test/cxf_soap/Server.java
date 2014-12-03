package com.young.test.cxf_soap;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
	
	public static void main(String[] args) throws Exception {
		
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(SimpleHelloService.class);
		factory.setAddress("http://localhost:9000/ws/HelloService");
		factory.create();
		
		System.out.println("Service start...");
		
	}

}
