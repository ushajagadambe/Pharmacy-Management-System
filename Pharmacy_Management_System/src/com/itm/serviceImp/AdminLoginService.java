package com.itm.serviceImp;

import com.itm.BO.AdminLoginBO;
import com.itm.DAOIMP.AdminLoginDAO;
import com.itm.DTO.AdminLoginDTO;

public class AdminLoginService {
	private AdminLoginDAO adminlogindao;
public boolean handleReq(AdminLoginDTO adminlogindto) throws Exception
{AdminLoginBO adminloginbo=null;boolean result;
adminloginbo=new AdminLoginBO();
adminloginbo.setUsername(adminlogindto.getUsername());
adminloginbo.setPassword(adminlogindto.getPassword());
adminlogindao=new AdminLoginDAO();
result=adminlogindao.validate(adminloginbo);
return result;
	
}
}
