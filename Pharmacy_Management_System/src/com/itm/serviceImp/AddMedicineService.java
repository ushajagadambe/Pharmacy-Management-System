package com.itm.serviceImp;

import java.sql.SQLException;

import com.itm.BO.AddMedicineBO;
import com.itm.DAOIMP.AddmedicineDAO;
import com.itm.DTO.AddmedicineDTO;

public class AddMedicineService {
	private AddmedicineDAO addmedicineDAO;
public boolean addmedicineser(AddmedicineDTO dto) throws SQLException
{
	AddMedicineBO bo=new AddMedicineBO();
	bo.setName(dto.getName());
	bo.setMdate(dto.getMdate());
	bo.setEdate(dto.getEdate());
	bo.setPower(dto.getPower());
	bo.setPrice(dto.getPrice());
	addmedicineDAO=new AddmedicineDAO();
	return addmedicineDAO.addmedicinedao(bo);
	
	
}
}
