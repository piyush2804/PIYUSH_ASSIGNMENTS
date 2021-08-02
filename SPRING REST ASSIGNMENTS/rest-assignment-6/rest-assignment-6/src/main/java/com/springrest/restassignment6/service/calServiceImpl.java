package com.springrest.restassignment6.service;

import org.springframework.stereotype.Service;

@Service
public class calServiceImpl implements calService{
	
	int a=5;
	int b=10;
//	int sum=0;

	@Override
	public int functionality() {
		
		return a+b;
	}
	
	


}
