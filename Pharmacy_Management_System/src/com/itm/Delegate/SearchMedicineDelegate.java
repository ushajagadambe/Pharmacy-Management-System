package com.itm.Delegate;

import com.itm.DTO.SearchMedicineDTO;
import com.itm.VO.SearchMedicineVO;
import com.itm.serviceImp.SearchMedicineService;

public class SearchMedicineDelegate {
	private SearchMedicineService searchmedicineservice;
public int  serachmedicinedelegate(SearchMedicineVO VO) throws Exception
{
	SearchMedicineDTO dto=new SearchMedicineDTO();
	dto.setName(VO.getName());
	searchmedicineservice=new SearchMedicineService();
	return searchmedicineservice.searchmedicineser(dto);
}
}
