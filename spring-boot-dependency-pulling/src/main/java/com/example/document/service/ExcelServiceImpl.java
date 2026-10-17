package com.example.document.service;

import org.springframework.stereotype.Service;

@Service
public class ExcelServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data For Excel");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("print excel");
		return "Excel";
	}

}
