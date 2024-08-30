package com.crm.service;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.crm.testdata.AppData;
import com.crm.utils.Common;
import com.crm.configuration.*;
import com.crm.objectrep.*;

public class CrmService extends BaseConfiguration {
	
	private static Logger logger = Logger.getLogger(CrmService.class.getName());

	public AppData ad = new AppData();
	CrmOr cr = new CrmOr();

	public void openCrmHomePage() {

		invokeBroswer();
	}
	
	public void closeCrmProject(){
		
		closeBrowser();
	}
	public void loginToCrm(String uname, String passwrd) {

		Common.insertText("id",	cr.getCrmObjects().getProperty("crm_login_usernameid"), uname, wd);
		Common.insertText("id",	cr.getCrmObjects().getProperty("crm_login_passwordid"), passwrd, wd);
		Common.clickButton("id",cr.getCrmObjects().getProperty("crm_login_buttonid"), wd);
		Common.validatePageTitle(PageConstants.CRM_LOGINPAGE_TITLE.title(), wd);
		
		logger.info("User logged into to CRM successfully");
		
		}
	
	public void logoutFromCrm(){
		
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_usermenu"), wd);
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_logout_user"), wd);
		
	}
	
	public void createAccount(){
	
	Common.clickButton("css", cr.getCrmObjects().getProperty("crm_accounts_dashboardcss"), wd);
	
}

	public void createAccountBtnClick(){
	
	Common.clickButton("css", cr.getCrmObjects().getProperty("crm_accounts_createaccountbtn_css"), wd);
	//Common.validatePageTitle(PageConstants.CRM_CREATEACCOUNT_PAGE_TITLE.title(), wd);
		
}
	
	public String getCreatedAccountName(){
		
		String accname =Common.getElementText("xpath", cr.getCrmObjects().getProperty("crm_accounts_accname_xpath"), wd);
		
		System.out.println(accname);
		
		return accname;
		
	}
	
	public String getAccountEmail(){
		String accemail =Common.getElementText("xpath", cr.getCrmObjects().getProperty("crm_accounts_accemail_xpath"), wd);
		System.out.println(accemail);
		return accemail;
		
	}
	public String getCreatedAccountPhone(){
	
		String accphone =Common.getElementText("xpath", cr.getCrmObjects().getProperty("crm_accounts_accphone_xpath"), wd);
		System.out.println(accphone);
		return accphone;
		
	}
	
	public void yesiwanttoleave(){
		
	Common.clickButton("css", cr.getCrmObjects().getProperty("crm_alertboxyescss"), wd);
	}

	public void saveAccountBtnClick(){
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_accounts_saveaccountbtn_xpath"), wd);
}

	public void enterBasicUserDetails(String name,String email, String phone){
	
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_nametb_css"), name, wd);
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_emailtb_css"), email, wd);
	Common.selectItemFromList("css", "value", cr.getCrmObjects().getProperty("crm_accounts_phonedd_css"), "value", "Mobile", wd);
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_phonetb_css"), phone, wd);
	
	}
	
	public void clickOnUserAdditionalEmail(){
	
		Common.clickButton("css", cr.getCrmObjects().getProperty("crm_accounts_additionalemailbtn_css"), wd);
	}

	public void enterUserAdditionalEmail(String email2){
	
		Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_additional_emailtb_css"), email2, wd);
	}
	
	

	public void enterShippingAddress(String street,String city, String state,String pincode, String country){
	
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_accounts_Shipping_street_xpath"), street, wd);
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_accounts_Shipping_city_xpath"), city, wd);
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_accounts_Shipping_state_xpath"), state, wd);
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_accounts_Shipping_postal_xpath"), pincode, wd);
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_accounts_Shipping_country_xpath"), country, wd);
		
	}

	public void enterBillingAddress(String street,String city, String state,String pincode, String country){
	
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_Billing_street_css"), street, wd);
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_Billing_city_css"), city, wd);
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_Billing_state_css"), state, wd);
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_Billing_postal_css"), pincode, wd);
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_Billing_country_css"), country,wd);
		
	}
	
	public ArrayList<String> getCreatedAccountEmail(){
	
		ArrayList<String> emailList= new ArrayList<String>();
		for(int i=1;i<=2;i++){
			String email = wd.findElement(By.cssSelector(".panel-body>div:nth-child(2)>div>div>div:nth-child("+i+")>a")).getText();
			emailList.add(email);
			
		}
		System.out.println(emailList);
		return emailList;
		
	}
	
	public ArrayList<String> getCreatedAccountEmailFromExcel(){
		
		ArrayList<String> emailList= new ArrayList<String>();
		for(int i=1;i<=2;i++){
			String email = ad.appData("UserDetails").getRow(i).getCell(1).getStringCellValue();
			emailList.add(email);
			
		}
		System.out.println(emailList);
		return emailList;
		
	}
	public String getBillingAdressData(){
		
		String accbilling = Common.getElementText("xpath", cr.getCrmObjects().getProperty("crm_accounts_billing_xpath"), wd);
		System.out.println(accbilling);
		return accbilling;
	}

	public void enterWebsiteDetails(String website){
		
	Common.insertText("css", cr.getCrmObjects().getProperty("crm_accounts_websitetb_css"), website, wd);
			
	}

	public void copyBillingBtnClick(){
	
	Common.clickButton("css", cr.getCrmObjects().getProperty("crm_accounts_copyBillingBtnClick_css"), wd);
	
}

	public void detailsSection(String sic, String desp) {
	
	Common.selectItemFromList("css", "value", cr.getCrmObjects().getProperty("crm_accounts_details_typedd_css"), "value", "Partner", wd);
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_accounts_details_sic_xpath"), sic, wd);
	Common.selectItemFromList("xpath", "value", cr.getCrmObjects().getProperty("crm_accounts_details_industrydd_xpath"), "value", "Computer", wd);
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_accounts_details_despctb_xpath"), desp, wd);
	
}

	public void removeAllAccount() {
	
	Common.radioButton("xpath", cr.getCrmObjects().getProperty("crm_accounts_selectaccountchkbox_xpath"), wd);
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_accounts_actionaccountbtn_xpath"), wd);
	Common.linkText("xpath", cr.getCrmObjects().getProperty("crm_accounts_removeaccountlt_xpath"), wd);
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_accounts_removeaccountbtn_xpath"), wd);
	
}

	public void createCase(){
	
	Common.linkText("xpath", cr.getCrmObjects().getProperty("crm_case_linktext"), wd);
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_case_createcasebtn"), wd);
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_case_name_textfld"), "Hello Testing", wd);
}
	
	// Opportunities methods 
	
	public void createOpportunity(){
		
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_opportunity_dashboard_xpath"), wd);
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_opportunity_createopportunitybtn_xpath"), wd);
		
	}
	
	public void opportunityName(String  name){
		
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunityname_xpath"), name, wd);
		
	}
	
	public void opportunityAccount(String accname){
		
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunityacctselc_xpath"), accname, wd);
	}
	
	public void opportunityAccountclickbtn(){
		
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunityacctselcbtn_xpath"), wd);
	}
	
	public void opportunityStageDropdown (String stageitem){
		
	Common.selectItemFromList("xpath", "value", cr.getCrmObjects().getProperty("crm_opportunity_opportunitystagedd_xpath"), "value", stageitem, wd);
		
	}
	
	public void opportunityAmount(String  amount){
		
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunityamount_xpath"), amount, wd);
		
	}
	
	public void opportunityProbability(String  prb){
		
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunityamount_xpath"), prb, wd);
		
	}
	
	public void opportunityCloseDate(String  date){
		
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunityclosedate_xpath"), date, wd);
			
	}
	
	public void opportunityContact(String con){
		
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunitycontact_xpath"), con, wd);
	}
	
	public void opportunityContactbtn(){
		
	Common.clickButton("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunitycreatecontactbtn_xpath"), wd);
			
	}
	
	public void OpportunityleadDropdown (String leaditem){
		
	Common.selectItemFromList("xpath", "value", cr.getCrmObjects().getProperty("crm_opportunity_opportunityleadsource_xpath"), "value", leaditem, wd);
			
	}
		
	public void opportunityDesp(String  despc){
			
	Common.insertText("xpath", cr.getCrmObjects().getProperty("crm_opportunity_opportunitydesc_xpath"), despc, wd);
				
	}

	public String getCreatedAccountType() {
		
		String accType = Common.getElementText("xpath", cr.getCrmObjects().getProperty("crm_accounts_type_xpath"), wd);
		System.out.println(accType);
		return accType;
		
	}

}
