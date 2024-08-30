package com.crm.testdata;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AppData {
	
	public FileInputStream fis;
	XSSFWorkbook wb = null;
	XSSFSheet sh = null;
	
	public XSSFSheet appData(String sname){
		
		try {
			fis = new FileInputStream("src//test//java//com//crm//testdata//TestData.xlsx");
			 wb = new XSSFWorkbook(fis);
			 sh = wb.getSheet(sname);
		} 
		catch (Exception e) {
						
			e.printStackTrace();
		}
		return sh;
	}
	
	public XSSFSheet oppData(String sname){
		
		try {
			fis = new FileInputStream("src//test//java//com//crm//testdata//Opportunity.xlsx");
			 wb = new XSSFWorkbook(fis);
			 sh = wb.getSheet(sname);
		} 
		catch (Exception e) {
						
			e.printStackTrace();
		}
		return sh;
	}


}
