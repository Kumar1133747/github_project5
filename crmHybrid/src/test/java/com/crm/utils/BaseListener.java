package com.crm.utils;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class BaseListener extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult tr){
		Reporter.log("Test Started......");
		
	}
	
	
	@Override
	public void onTestSuccess(ITestResult tr){
		Reporter.log("Test '" +tr.getName()+"'PASSED");
		//Reporter.log(tr.getTestClass());
		Reporter.log("Priority of the method: " +tr.getMethod().getPriority());
		
	}
	
	@Override 
	public void onTestFailure(ITestResult tr){
		Reporter.log("Test '" +tr.getName()+"'FAILED");
		Reporter.log("Priority of the method: " +tr.getMethod().getPriority());
		Common.takeScreenShot(Common.wd);
		
	}
}
