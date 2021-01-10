package com.biz;

import java.util.List;

import com.dao.MYTestDao;
import com.dto.MYTestDto;


// Biz : business Logic -> 연산/처리
public class MYTestBiz {

	private MYTestDao dao = new MYTestDao();
	
	public List<MYTestDto> selectList(){
		return dao.selectList();
	}

}