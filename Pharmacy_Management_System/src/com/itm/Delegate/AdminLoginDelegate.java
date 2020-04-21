package com.itm.Delegate;

import com.itm.DTO.AdminLoginDTO;
import com.itm.VO.AdminLoginVO;
import com.itm.serviceImp.AdminLoginService;

public class AdminLoginDelegate {
	private AdminLoginService adminloginservice;
public boolean handleReq(AdminLoginVO VO) throws Exception
{boolean result;
	AdminLoginDTO adminlogindto=null;
	String username=null;
	String password=null;
	username=VO.getUsername();
	password=VO.getPassword();
	adminlogindto=new AdminLoginDTO();
	adminlogindto.setUsername(username);
	adminlogindto.setPassword(password);
	adminloginservice=new AdminLoginService();
	result=adminloginservice.handleReq(adminlogindto);
	return result;
	
}
}
