package com.itm.Delegate;

import com.itm.DTO.CustomerRegDTO;
import com.itm.VO.CustomerRegVO;
import com.itm.serviceImp.CustomerRegService;

public class CustomerRegDelegate {
	private CustomerRegService customerService ;
public boolean Reg(CustomerRegVO vo) throws Exception
{      System.out.println("welcome to Delegate");
String username=null;String password=null;String address=null;String phone;boolean res=true;
username=vo.getName();
password=vo.getPassword();
address=vo.getAddress();
phone=vo.getPhone();
CustomerRegDTO dto=new CustomerRegDTO();
long p=Long.parseLong(phone);
dto.setName(username);
dto.setPassword(password);
dto.setAddress(address);
dto.setPhone(p);
customerService=new CustomerRegService();
return customerService.regService(dto);
}
}
