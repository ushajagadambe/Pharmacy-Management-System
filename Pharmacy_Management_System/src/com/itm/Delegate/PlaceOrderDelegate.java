package com.itm.Delegate;

import com.itm.DTO.PlaceOrderDTO;
import com.itm.VO.PlaceOrderVO;
import com.itm.serviceImp.PlaceOrderService;

public class PlaceOrderDelegate {
	private PlaceOrderService service;
public int placeorderdel(PlaceOrderVO vo) throws Exception
{ 
	PlaceOrderDTO dto=new PlaceOrderDTO();
	dto.setMed_name(vo.getName());
	dto.setQuantity(Integer.parseInt(vo.getQuantity()));
	dto.setCust_name(vo.getCust_name());
	service=new PlaceOrderService();
	return service.placeordeser(dto);
	
}
}
