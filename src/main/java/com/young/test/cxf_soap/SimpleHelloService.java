package com.young.test.cxf_soap;

public class SimpleHelloService implements HelloService {

	public String hello(String who) {
		return "hello " + who;
	}

}
