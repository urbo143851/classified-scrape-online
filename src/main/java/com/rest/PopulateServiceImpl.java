package com.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.dao.ClickRecordRepository;
import com.domain.ClickRecord;

@Component
public class PopulateServiceImpl {
	
@Autowired
ClickRecordRepository clickRecordRepository;

	public List<ClickRecord> getRecordsByDate(String startDate, String beginDate){
	
		return clickRecordRepository.findByDate(startDate, beginDate);
	}
}
