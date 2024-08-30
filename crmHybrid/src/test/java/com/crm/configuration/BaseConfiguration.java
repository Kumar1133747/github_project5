package com.crm.configuration;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseConfiguration {

	private static Logger logger = Logger.getLogger(BaseConfiguration.class.getName());
	public FileInputStream fis;
	public Properties prop;
	public String browser;
	public WebDriver wd;

	public void invokeBroswer() {
		try {
			PropertyConfigurator.configure("src//test//java/com//crm//configuration//log4j.properties");
			fis = new FileInputStream(
					"src//test/java//com/crm//configuration//config.properties");
			prop = new Properties();
			prop.load(fis);
			browser = prop.getProperty("Browser");

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"src//test//java//com//crm//configuration//chromedriver.exe");
				wd = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("iexplore")) {
				System.setProperty("webdriver.ie.driver",
						"src//test//java//com//crm//configuration//IEDriverServer.exe");
				wd = new InternetExplorerDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"src//test//java//com//crm//configuration//geckodriver.exe");
				wd = new InternetExplorerDriver();
				
			}
			wd.navigate().to(prop.getProperty("Uat_Url"));
			wd.manage().window().maximize();
			String impWait = prop.getProperty("Implicit_Wait");
			int imptimewait = Integer.parseInt(impWait);
			wd.manage().timeouts().implicitlyWait(imptimewait, TimeUnit.SECONDS);
			logger.info("Url navigated sucessfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
public  void closeBrowser(){
		
		wd.close();
	}
}
