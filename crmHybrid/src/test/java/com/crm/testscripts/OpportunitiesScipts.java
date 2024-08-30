package com.crm.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.service.CrmService;
import com.crm.testdata.AppData;
import com.crm.utils.Common;

public class OpportunitiesScipts extends Common {

	public CrmService crService = null;
	public AppData ad = null;
	
	@BeforeClass
	
	public void init(){
		crService = new CrmService();
		ad= new AppData();
		crService.openCrmHomePage();
		crService.loginToCrm(ad.appData("Login").getRow(1).getCell(0).getStringCellValue(),ad.appData("Login").getRow(1).getCell(1).getStringCellValue());
		
		
	}
	
	@Test(description ="Check the Create Opportunity functionality without Account & Contact details.",priority=0)
	public void createOpportunitywithoutAccountandContact() throws InterruptedException{
		
		crService.createOpportunity();
		crService.opportunityName(ad.oppData("Sheet1").getRow(1).getCell(0).getStringCellValue());
		crService.opportunityStageDropdown(ad.oppData("Sheet1").getRow(1).getCell(2).getStringCellValue());
		crService.opportunityAmount(ad.oppData("Sheet1").getRow(1).getCell(3).getStringCellValue());
		crService.opportunityProbability(ad.oppData("Sheet1").getRow(1).getCell(4).getStringCellValue());
		crService.opportunityProbability(ad.oppData("Sheet1").getRow(1).getCell(4).getStringCellValue());
		crService.opportunityCloseDate(ad.oppData("Sheet1").getRow(1).getCell(5).getStringCellValue());
		crService.OpportunityleadDropdown(ad.oppData("Sheet1").getRow(1).getCell(7).getStringCellValue());
		crService.opportunityDesp(ad.oppData("Sheet1").getRow(1).getCell(8).getStringCellValue());		
		
	}
	
	@Test(description ="Check the Create Opportunity functionality without Account & Contact details.",priority=1)
	public void createOpportunitywithAccountandwithoutContact() throws InterruptedException{
		
		crService.createOpportunity();
		crService.opportunityName(ad.oppData("Sheet1").getRow(2).getCell(0).getStringCellValue());
		crService.opportunityAccount(ad.oppData("Sheet1").getRow(1).getCell(1).getStringCellValue());		
		crService.opportunityStageDropdown(ad.oppData("Sheet1").getRow(1).getCell(2).getStringCellValue());
		crService.opportunityAmount(ad.oppData("Sheet1").getRow(1).getCell(3).getStringCellValue());
		crService.opportunityProbability(ad.oppData("Sheet1").getRow(1).getCell(4).getStringCellValue());
		crService.opportunityProbability(ad.oppData("Sheet1").getRow(1).getCell(4).getStringCellValue());
		crService.opportunityCloseDate(ad.oppData("Sheet1").getRow(1).getCell(5).getStringCellValue());
		crService.OpportunityleadDropdown(ad.oppData("Sheet1").getRow(1).getCell(7).getStringCellValue());
		crService.opportunityDesp(ad.oppData("Sheet1").getRow(1).getCell(8).getStringCellValue());		
		
	}
	@Test(description ="Check the Create Opportunity functionality without Account & Contact details.",priority=2)
	public void createOpportunitywithoutAccountandwithContact() throws InterruptedException{
		
		crService.createOpportunity();
		crService.opportunityName(ad.oppData("Sheet1").getRow(3).getCell(0).getStringCellValue());
		crService.opportunityAccount(ad.oppData("Sheet1").getRow(1).getCell(1).getStringCellValue());		
		crService.opportunityStageDropdown(ad.oppData("Sheet1").getRow(1).getCell(2).getStringCellValue());
		crService.opportunityAmount(ad.oppData("Sheet1").getRow(1).getCell(3).getStringCellValue());
		crService.opportunityProbability(ad.oppData("Sheet1").getRow(1).getCell(4).getStringCellValue());
		crService.opportunityProbability(ad.oppData("Sheet1").getRow(1).getCell(4).getStringCellValue());
		crService.opportunityCloseDate(ad.oppData("Sheet1").getRow(1).getCell(5).getStringCellValue());
		crService.OpportunityleadDropdown(ad.oppData("Sheet1").getRow(1).getCell(7).getStringCellValue());
		crService.opportunityDesp(ad.oppData("Sheet1").getRow(1).getCell(8).getStringCellValue());		
		
	}
	
	@Test(description ="Check the Create Opportunity functionality without Account & Contact details.",priority=2)
	public void createOpportunitywithAccountandContact() throws InterruptedException{
		
		crService.createOpportunity();
		crService.opportunityName(ad.oppData("Sheet1").getRow(4).getCell(0).getStringCellValue());
		crService.opportunityAccount(ad.oppData("Sheet1").getRow(1).getCell(1).getStringCellValue());		
		crService.opportunityStageDropdown(ad.oppData("Sheet1").getRow(1).getCell(2).getStringCellValue());
		crService.opportunityAmount(ad.oppData("Sheet1").getRow(1).getCell(3).getStringCellValue());
		crService.opportunityProbability(ad.oppData("Sheet1").getRow(1).getCell(4).getStringCellValue());
		crService.opportunityProbability(ad.oppData("Sheet1").getRow(1).getCell(4).getStringCellValue());
		crService.opportunityCloseDate(ad.oppData("Sheet1").getRow(1).getCell(5).getStringCellValue());
		crService.OpportunityleadDropdown(ad.oppData("Sheet1").getRow(1).getCell(7).getStringCellValue());
		crService.opportunityDesp(ad.oppData("Sheet1").getRow(1).getCell(8).getStringCellValue());		
		
	}
}
