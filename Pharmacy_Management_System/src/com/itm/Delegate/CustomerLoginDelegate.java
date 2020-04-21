package com.itm.Delegate;

import com.itm.DTO.CustomerLoginDTO;
import com.itm.VO.CustomerLoginVO;
import com.itm.serviceImp.CustomerLoginService;

public class CustomerLoginDelegate {
	private CustomerLoginService cutomerloginservice;
public boolean Handle(CustomerLoginVO customerloginvo)throws Exception
{System.out.println("delegate class");
	CustomerLoginDTO customerlogindto=null;boolean result;
	customerlogindto=new CustomerLoginDTO();
	customerlogindto.setUsername(customerloginvo.getUsername());
	customerlogindto.setPassword(customerloginvo.getUsername());
	cutomerloginservice=new CustomerLoginService();
	result=cutomerloginservice.handle(customerlogindto);
	return result;
    
}
}
