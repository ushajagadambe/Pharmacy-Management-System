package com.itm.serviceImp;

import com.itm.BO.SearchMedicineBO;
import com.itm.DAOIMP.SearchMedicineDAO;
import com.itm.DTO.SearchMedicineDTO;

public class SearchMedicineService {
private SearchMedicineDAO searchmedicinedao;
public int searchmedicineser(SearchMedicineDTO dto) throws Exception
{
	SearchMedicineBO bo=new SearchMedicineBO();
	bo.setName(dto.getName());
	searchmedicinedao=new SearchMedicineDAO();
	return searchmedicinedao.searchmedicine(bo);
}
}
