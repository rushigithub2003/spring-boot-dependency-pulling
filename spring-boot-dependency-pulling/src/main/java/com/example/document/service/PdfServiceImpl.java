package com.example.document.service;

import org.springframework.stereotype.Service;

@Service
public class PdfServiceImpl extends DocumentServiceAB {

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data For PDF");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print PDF");
		return "PDF";
	}

}
