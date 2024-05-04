package com.example.usama.myProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usama.myProject.bean.BayBean;
import com.example.usama.myProject.repository.BayRepository;

@Service
public class CustomService {
	
	@Autowired
	BayRepository bayRepo;

	public String getNumberinLetters(Integer number) {
		String result; 

		switch (number) {
		case 1: 
			result = "uno";
			break;
		case 2: 
			result = "due";
			break;
		case 3: 
			result = "tre";
			break;
		case 4: 
			result = "quattro";
			break;
		case 5: 
			result = "cinque";
			break;
		case 6: 
			result = "sei";
			break;
		case 7: 
			result = "sette";
			break;
		case 8: 
			result = "otto";
			break;
		case 9: 
			result = "nove";
			break;
		case 10: 
			result = "dieci";
			break;
		default: 
			result = "Non previsto";
		}

		return result;
	}

	public BayBean getBayInfo(Long bayId) {
		
		return bayRepo.getBayMainInfo(bayId);
	}
	
}
