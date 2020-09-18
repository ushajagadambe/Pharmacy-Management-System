package com.itm.Delegate;

import com.itm.BO.RemoveMedicineBO;
import com.itm.DTO.RemoveMedicineDTO;
import com.itm.VO.RemoveMedicineVO;
import com.itm.serviceImp.RemoveMedicineService;

public class RemoveMedicineDelegate {
	private RemoveMedicineService removemedicineservice;
public boolean removemedicinedel(RemoveMedicineVO removemedicinevo) throws Exception
{
String name=removemedicinevo.getName();
System.out.println(name+"vo value");
 RemoveMedicineDTO dto=new RemoveMedicineDTO();
 dto.setName(name);

 removemedicineservice=new RemoveMedicineService();
	return removemedicineservice.Removemedicineser(dto);
	
}
}
