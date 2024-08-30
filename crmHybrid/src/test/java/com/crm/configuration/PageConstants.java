package com.crm.configuration;

public enum PageConstants {

	CRM_LOGINPAGE_TITLE("EspoCRM"),
	CRM_CREATEACCOUNT_PAGE_TITLE("Accounts");
	
	private String title;
	
	PageConstants(String title){
		this.title=title;
	}
	public String title(){
		return title;
	}
}
