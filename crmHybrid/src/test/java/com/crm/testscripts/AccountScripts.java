package com.crm.testscripts;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.service.*;
import com.crm.testdata.AppData;
import com.crm.utils.*;
import com.crm.validator.AccountsValidator;

public class AccountScripts extends Common {

	
	public CrmService crService = null;
	public AppData ad = null;
	public AccountsValidator accountsValidator = null;
	
	@BeforeClass
	
	public void init(){
		crService = new CrmService();
		ad= new AppData();
		accountsValidator = new AccountsValidator();
		crService.openCrmHomePage();
		
	}
	
//	@AfterClass
//	
//	public void tearDown() throws InterruptedException{
//		
//		crService.logoutFromCrm();
//		Thread.sleep(2000);
//		crService.closeBrowser();
//	}
	
	@Test(description ="Check the Create Account functionality without clicking on Copy Billing button & without Details Section.",priority=0)
	public void createAccount() throws InterruptedException{
		crService.loginToCrm(ad.appData("Login").getRow(1).getCell(0).getStringCellValue(),ad.appData("Login").getRow(1).getCell(1).getStringCellValue());
		crService.createAccount();
		crService.createAccountBtnClick();
		crService.enterBasicUserDetails(ad.appData("UserDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("UserDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("UserDetails").getRow(1).getCell(2).getStringCellValue());
		crService.clickOnUserAdditionalEmail();
		crService.enterUserAdditionalEmail(ad.appData("UserDetails").getRow(2).getCell(1).getStringCellValue());
		crService.enterWebsiteDetails(ad.appData("UserDetails").getRow(1).getCell(3).getStringCellValue());
		crService.enterBillingAddress(ad.appData("BillingDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(2).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(3).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(4).getStringCellValue());
		crService.enterShippingAddress(ad.appData("ShippingDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("ShippingDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("ShippingDetails").getRow(1).getCell(2).getStringCellValue(),ad.appData("ShippingDetails").getRow(1).getCell(3).getStringCellValue(),ad.appData("ShippingDetails").getRow(1).getCell(4).getStringCellValue());
		crService.detailsSection(ad.appData("DetailSection").getRow(1).getCell(0).getStringCellValue(), ad.appData("DetailSection").getRow(1).getCell(1).getStringCellValue());
		crService.saveAccountBtnClick();
		//accountsValidator.validateAccountCreation(crService);
		accountsValidator.validateAccountEmailwithAdditonalEmail(crService);
		//crService.getBillingAdressData();
//		crService.getCreatedAccountEmail();
//		crService.getCreatedAccountName();
//		crService.getCreatedAccountPhone();
		//crService.getCreatedAccountEmailFromExcel();
		
		}

//	@Test(description ="Check the Create Account functionality with clicking on Copy Billing button & without Details Section.",priority=1)
//	public void createAccountWithBilling() throws InterruptedException{
//		
//		crService.createAccount();
//		crService.createAccountBtnClick();
//		crService.enterBasicUserDetails(ad.appData("UserDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("UserDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("UserDetails").getRow(1).getCell(2).getStringCellValue());
//		crService.enterWebsiteDetails(ad.appData("UserDetails").getRow(1).getCell(3).getStringCellValue());
//		crService.enterBillingAddress(ad.appData("BillingDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(2).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(3).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(4).getStringCellValue());
//		crService.copyBillingBtnClick();
//		crService.yesiwanttoleave();
//		//crService.saveAccountBtnClick();
//		
//			
//	}
	
//	@Test(description ="Check the Create Account functionality with clicking on Copy Billing button & with Details Section.",priority=3)
//	public void createAccountWithBillingDetailSec() throws InterruptedException{
//		crService.openCrmHomePage();
//		crService.loginToCrm(ad.appData("Login").getRow(1).getCell(0).getStringCellValue(),ad.appData("Login").getRow(1).getCell(1).getStringCellValue());
//		crService.createAccount();
//		crService.createAccountBtnClick();
//		crService.enterBasicUserDetails(ad.appData("UserDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("UserDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("UserDetails").getRow(1).getCell(2).getStringCellValue());
//		crService.enterWebsiteDetails(ad.appData("UserDetails").getRow(1).getCell(3).getStringCellValue());
//		crService.enterBillingAddress(ad.appData("BillingDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(2).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(3).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(4).getStringCellValue());
//		crService.copyBillingBtnClick();
//		crService.detailsSection(ad.appData("DetailSection").getRow(1).getCell(0).getStringCellValue(), ad.appData("DetailSection").getRow(1).getCell(1).getStringCellValue());
//		crService.saveAccountBtnClick();
//		Thread.sleep(5000);
//		crService.closeBrowser();
//	}
//	
//	@Test(description ="Check the Create Account functionality without clicking on Copy Billing button & with Details Section.",priority=4)
//	public void createAccountWithDetailSec() throws InterruptedException{
//		crService.openCrmHomePage();
//		crService.loginToCrm(ad.appData("Login").getRow(1).getCell(0).getStringCellValue(),ad.appData("Login").getRow(1).getCell(1).getStringCellValue());
//		crService.createAccount();
//		crService.createAccountBtnClick();
//		crService.enterBasicUserDetails(ad.appData("UserDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("UserDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("UserDetails").getRow(1).getCell(2).getStringCellValue());
//		crService.enterWebsiteDetails(ad.appData("UserDetails").getRow(1).getCell(3).getStringCellValue());
//		crService.enterBillingAddress(ad.appData("BillingDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(2).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(3).getStringCellValue(),ad.appData("BillingDetails").getRow(1).getCell(4).getStringCellValue());
//		crService.enterShippingAddress(ad.appData("ShippingDetails").getRow(1).getCell(0).getStringCellValue(),ad.appData("ShippingDetails").getRow(1).getCell(1).getStringCellValue(),ad.appData("ShippingDetails").getRow(1).getCell(2).getStringCellValue(),ad.appData("ShippingDetails").getRow(1).getCell(3).getStringCellValue(),ad.appData("ShippingDetails").getRow(1).getCell(4).getStringCellValue());
//		crService.detailsSection(ad.appData("DetailSection").getRow(1).getCell(0).getStringCellValue(), ad.appData("DetailSection").getRow(1).getCell(1).getStringCellValue());
//		crService.saveAccountBtnClick();
//		Thread.sleep(5000);
//		crService.closeBrowser();
//			
//		
//	}
//	
//	@Test(description ="Check the Create Account functionality without clicking on Copy Billing button & with Details Section.",priority=4)
//	public void removeAccount() throws InterruptedException{
//		crService.openCrmHomePage();
//		crService.loginToCrm(ad.appData("Login").getRow(1).getCell(0).getStringCellValue(),ad.appData("Login").getRow(1).getCell(1).getStringCellValue());
//		crService.createAccount();
//		crService.removeAllAccount();
//		Thread.sleep(5000);
//		crService.closeBrowser();
//			
//	}

	
}
