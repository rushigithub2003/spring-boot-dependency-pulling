package com.example.document.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.document.service.DocumentService;
import com.example.document.service.ExcelServiceImpl;
import com.example.document.service.PdfServiceImpl;

@RestController
public class DocumentController {

	@Autowired
	ApplicationContext springFactory;

	DocumentService ds;

	@GetMapping("print/{type}")
	String printInvoice(@PathVariable String type) {
		if (type.equals("pdf")) {
			ds = (PdfServiceImpl) springFactory.getBean("pdfServiceImpl");
		}

		if (type.equals("excelServiceImpl")) {
			ds = (ExcelServiceImpl) springFactory.getBean("excelServiceImpl");
		}

		ds.readDataFromDB();
		ds.processData();
		return ds.printData();
	}

}
