package com.itm.serviceImp;

import com.itm.BO.CustomerRegBO;
import com.itm.DAOIMP.CustomerRegDAO;
import com.itm.DTO.CustomerRegDTO;

public class CustomerRegService {
	private CustomerRegDAO dao;
public boolean regService(CustomerRegDTO dto) throws Exception
{ CustomerRegBO bo=null;
	String username=null;String password=null;String address=null;long phone;boolean res=false;
	   username=dto.getName();
	   password=dto.getPassword();
	   address=dto.getAddress();
	   address=dto.getAddress();
	   phone=dto.getPhone();
	   phone=dto.getPhone();
	   bo=new CustomerRegBO();
	   bo.setName(username);
	   bo.setAddress(address);
	   bo.setPassword(password);
	   bo.setPhone(phone);
	   res=dao.equals(bo);
	return res;
	
}
}
