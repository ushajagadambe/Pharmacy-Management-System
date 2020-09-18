package com.itm.Delegate;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itm.DTO.AddmedicineDTO;
import com.itm.VO.AddmedicineVO;
import com.itm.serviceImp.AddMedicineService;

public class AddMedicineDelegate {
	private AddMedicineService service;
public boolean addmedicinedel(AddmedicineVO addmedicinevo) throws SQLException
{ Date date = null,date2=null;
	String name=addmedicinevo.getName();
	String mdate=addmedicinevo.getMdate();
	String edate=addmedicinevo.getEdate();
	String power=addmedicinevo.getPower();
	int p=Integer.parseInt(power);
	int price=Integer.parseInt(addmedicinevo.getPrice());
	SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
	try {
		 date=format.parse(mdate);
		 date2=format.parse(edate); 
	} catch (ParseException e) {
		e.printStackTrace();}
	
	AddmedicineDTO dto=new AddmedicineDTO();
	dto.setName(name);
	dto.setMdate(date);
	dto.setEdate(date2);
	dto.setPower(p);
	dto.setPrice(price);
	service=new AddMedicineService();
	return service.addmedicineser(dto);
	
}
}
