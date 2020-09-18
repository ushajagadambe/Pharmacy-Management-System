package com.itm.serviceImp;

import com.itm.BO.CustomerRegBO;
import com.itm.DAOIMP.CustomerRegDAO;
import com.itm.DTO.CustomerRegDTO;

public class CustomerRegService {
	private CustomerRegDAO dao;
public boolean regService(CustomerRegDTO dto) throws Exception
{  System.out.println("welcome to service");
	CustomerRegBO bo=null;
	String username=null;String password=null;String address=null;long phone;
	   username=dto.getName();
	   password=dto.getPassword();
	   address=dto.getAddress();
	   phone=dto.getPhone();
	   bo=new CustomerRegBO();
	   bo.setName(username);
	   bo.setAddress(address);
	   bo.setPassword(password);
	   bo.setPhone(phone);
	   dao=new CustomerRegDAO();
	return dao.InsertCustomer(bo);
	
}
}
