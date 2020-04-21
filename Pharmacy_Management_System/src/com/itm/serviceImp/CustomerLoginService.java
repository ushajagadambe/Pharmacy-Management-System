package com.itm.serviceImp;

import com.itm.BO.CustomerLoginBO;
import com.itm.DAOIMP.CustomerLoginDAO;
import com.itm.DTO.CustomerLoginDTO;

public class CustomerLoginService {
	private CustomerLoginDAO customerlogindao;
public boolean handle(CustomerLoginDTO cutomerlogindto)throws Exception
{
	CustomerLoginBO customerloginBO=null;
	customerloginBO=new CustomerLoginBO();
	customerloginBO.setUsername(cutomerlogindto.getUsername());
	customerloginBO.setPassword(cutomerlogindto.getPassword());
	customerlogindao=new CustomerLoginDAO();
	return customerlogindao.validate(customerloginBO);
	
}
}
