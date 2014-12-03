package com.young.test.cxf_soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloService {

	@WebMethod
	@WebResult String hello(@WebParam String who);
}
