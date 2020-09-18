package com.itm.Delegate;

import com.itm.DTO.ViewOrderCustomerDTO;
import com.itm.VO.ViewOrderCustomerVO;
import com.itm.serviceImp.ViewOrderCustomerService;

public class ViewOrdercustomerDelegate {
	private ViewOrderCustomerService viewordercustomerservice;
public String viewordercustdel(ViewOrderCustomerVO vo) throws Exception
{
	ViewOrderCustomerDTO dto=new  ViewOrderCustomerDTO();
	dto.setName(vo.getName());
	viewordercustomerservice=new ViewOrderCustomerService();
	return viewordercustomerservice.viewordercustomerser(dto);
	
}
}
