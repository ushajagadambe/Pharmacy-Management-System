package com.itm.serviceImp;

import com.itm.BO.RemoveMedicineBO;
import com.itm.DAOIMP.RemoveMedicineDAO;
import com.itm.DTO.RemoveMedicineDTO;

public class RemoveMedicineService {
	private RemoveMedicineDAO removemedicinedao;
public boolean Removemedicineser(RemoveMedicineDTO dto) throws Exception
{
	String name=dto.getName();
	System.out.println(name+"dto value");
	RemoveMedicineBO bo=new RemoveMedicineBO();
	bo.setName(name);
	removemedicinedao=new RemoveMedicineDAO();
	return removemedicinedao.removemedicinedao(bo);
	
	
}
}
