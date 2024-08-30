package com.crm.objectrep;

import java.io.FileInputStream;
import java.util.Properties;

public class CrmOr {

	public  Properties obProp;
	public  Properties getCrmObjects(){
		
		try {
			FileInputStream fis= new FileInputStream("src//test//java//com//crm//objectrep//objects.properties");
			obProp = new Properties();
			obProp.load(fis);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return obProp;
	}
}
