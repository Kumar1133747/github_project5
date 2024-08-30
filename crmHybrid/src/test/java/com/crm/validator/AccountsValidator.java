package com.crm.validator;

import java.util.ArrayList;

import org.testng.Assert;

import com.crm.service.CrmService;
import com.crm.testdata.AppData;

public class AccountsValidator {

	
	public AppData ad = new AppData();
	public void validateAccountCreation(CrmService crService){
		
		String accountName = crService.getCreatedAccountName();
		Assert.assertEquals(accountName, ad.appData("UserDetails").getRow(1).getCell(0).getStringCellValue());
		
		String accountEmail = crService.getAccountEmail();
		Assert.assertEquals(accountEmail, ad.appData("UserDetails").getRow(1).getCell(1).getStringCellValue());
		
		String accountPhone = crService.getCreatedAccountPhone();
		Assert.assertEquals(accountPhone, ad.appData("UserDetails").getRow(1).getCell(2).getStringCellValue());
				
	}
	
	public void validateAccountEmailwithAdditonalEmail(CrmService crService){
		
		ArrayList<String> emailList = crService.getCreatedAccountEmail();
		ArrayList<String> emailListxl = crService.getCreatedAccountEmail();
		
		Assert.assertEquals(emailList, emailListxl);
		System.out.println(emailList);
		System.out.println(emailListxl);
		
	}
//	public void validateAccountBillingAdress(CrmService crService){
//		
//		
//		Assert.assertTrue(accountBilling.contains(ad.appData("BillingDetails").getRow(1).getCell(0).getStringCellValue()));
//		Assert.assertTrue(accountBilling.contains(ad.appData("BillingDetails").getRow(1).getCell(1).getStringCellValue()));
//		Assert.assertTrue(accountBilling.contains(ad.appData("BillingDetails").getRow(1).getCell(2).getStringCellValue()));
//		Assert.assertTrue(accountBilling.contains(ad.appData("BillingDetails").getRow(1).getCell(3).getStringCellValue()));
//		Assert.assertTrue(accountBilling.contains(ad.appData("BillingDetails").getRow(1).getCell(4).getStringCellValue()));
//	}
}

