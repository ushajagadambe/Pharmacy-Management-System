package com.itm.serviceImp;

import com.itm.BO.PlaceOrderBO;
import com.itm.DAOIMP.PlaceOrderDAO;
import com.itm.DTO.PlaceOrderDTO;

public class PlaceOrderService {
private PlaceOrderDAO placeOrderDAO;
public int placeordeser(PlaceOrderDTO placeorderdto) throws Exception
{
	PlaceOrderBO bo=new PlaceOrderBO();
	bo.setMed_name(placeorderdto.getMed_name());
	bo.setQuantity(placeorderdto.getQuantity());
	bo.setCust_name(placeorderdto.getCust_name());
	placeOrderDAO=new PlaceOrderDAO();
	return placeOrderDAO.placeorder(bo);
	
	
}
}
