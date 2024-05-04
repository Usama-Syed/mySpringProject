/**
 * 
 */
package com.example.usama.myProject.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usama.myProject.bean.BayBean;
import com.example.usama.myProject.service.CustomService;

/**
 * 
 */
@RestController
@RequestMapping("/custom")
public class CustomController {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CustomController.class);
	
	@Autowired
	CustomService customService;
	
	@GetMapping("/exampleSwitchCase/{number}")
	public ResponseEntity<String> exampleSwitchCase(@PathVariable(value = "number") String input) {
		
		ResponseEntity<String> response = null;
		
		try {
			Integer number = Integer.parseInt(input);
			String result = customService.getNumberinLetters(number);
			response = new ResponseEntity<String>(result, HttpStatus.OK);
			
		} catch (Exception ex){
			response = new ResponseEntity<String>("Si è verificato un errore", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
		
	}
	
	@GetMapping("/bay/{bayId}")
	public ResponseEntity<BayBean> getBayInfo(@PathVariable(value = "bayId") String entityId) {
		
		ResponseEntity<BayBean> response = null;
		
		try {
			Long number = Long.parseLong(entityId);
			BayBean result = customService.getBayInfo(number);
			response = new ResponseEntity<BayBean>(result, HttpStatus.OK);
			
		} catch (Exception ex){
			//response = new ResponseEntity<BayBean>("Si è verificato un errore", HttpStatus.INTERNAL_SERVER_ERROR);
			logger.error(ex.getMessage());
			logger.error(ex.getStackTrace().toString());
		}
		
		return response;
		
		
	}

}
