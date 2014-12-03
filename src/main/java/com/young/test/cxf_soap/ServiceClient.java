package com.young.test.cxf_soap;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ServiceClient {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloService.class);
		factory.setServiceClass(HelloService.class);
		factory.setAddress("http://localhost:9000/ws/HelloService");
		HelloService helloworld = (HelloService) factory.create();
		System.out.println(helloworld.hello("outofmemory.cn"));
		System.exit(0);
	}

}
