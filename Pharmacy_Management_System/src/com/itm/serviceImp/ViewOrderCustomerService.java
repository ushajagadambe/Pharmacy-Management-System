package com.itm.serviceImp;

import com.itm.BO.ViewOrderCustomerBO;
import com.itm.DAOIMP.ViewOrderCustomerDAO;
import com.itm.DTO.ViewOrderCustomerDTO;

public class ViewOrderCustomerService {
private ViewOrderCustomerDAO viewordercustomerdao;
public String viewordercustomerser(ViewOrderCustomerDTO dto) throws Exception
{
	ViewOrderCustomerBO bo=new ViewOrderCustomerBO();
	bo.setCust_name(dto.getName());
	viewordercustomerdao=new ViewOrderCustomerDAO();
	return viewordercustomerdao.viewordercustomerdao(bo);
	
}
}
