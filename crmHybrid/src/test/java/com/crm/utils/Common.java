package com.crm.utils;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Common {

	public static WebDriver wd = null;
	public static void clickButton(String identifiedBy, String locator,
			WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("linktext")) {
			wd.findElement(By.linkText(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("plink")) {
			wd.findElement(By.partialLinkText(locator)).click();
		}

	}

	public static void linkText(String identifiedBy, String locator,
			WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("linktext")) {
			wd.findElement(By.linkText(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("plink")) {
			wd.findElement(By.partialLinkText(locator)).click();
		}

	}

	public static void insertText(String identifiedBy, String locator,
			String value, WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).sendKeys(value);
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).sendKeys(value);
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).sendKeys(value);
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).sendKeys(value);
		} else if (identifiedBy.equalsIgnoreCase("linktext")) {
			wd.findElement(By.linkText(locator)).sendKeys(value);
		} else if (identifiedBy.equalsIgnoreCase("plink")) {
			wd.findElement(By.partialLinkText(locator)).sendKeys(value);
		}
	}

	public static void selectItemFromDropdown(String identifiedBy,
			String selectBy, String locator, String value, int index,
			WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			Select dropdown = new Select(wd.findElement(By.id(locator)));
			if (selectBy.equalsIgnoreCase("index")) {
				dropdown.selectByIndex(index);
			} else if (selectBy.equalsIgnoreCase("text")) {
				dropdown.selectByVisibleText(value);
			} else if (selectBy.equalsIgnoreCase("value")) {
				dropdown.selectByValue(value);
			}

		} else if (identifiedBy.equalsIgnoreCase("name")) {
			Select dropdown = new Select(wd.findElement(By.name(locator)));
			if (identifiedBy.equalsIgnoreCase("index")) {
				dropdown.selectByIndex(index);
			} else if (identifiedBy.equalsIgnoreCase("text")) {
				dropdown.selectByVisibleText(value);
			} else if (identifiedBy.equalsIgnoreCase("value")) {
				dropdown.selectByValue(value);
			}
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			Select dropdown = new Select(wd.findElement(By.xpath(locator)));
			if (identifiedBy.equalsIgnoreCase("index")) {
				dropdown.selectByIndex(index);
			} else if (identifiedBy.equalsIgnoreCase("text")) {
				dropdown.selectByVisibleText(value);
			} else if (identifiedBy.equalsIgnoreCase("value")) {
				dropdown.selectByValue(value);
			}

		} else if (identifiedBy.equalsIgnoreCase("css")) {
			Select dropdown = new Select(
					wd.findElement(By.cssSelector(locator)));
			if (identifiedBy.equalsIgnoreCase("index")) {
				dropdown.selectByIndex(index);
			} else if (identifiedBy.equalsIgnoreCase("text")) {
				dropdown.selectByVisibleText(value);
			} else if (identifiedBy.equalsIgnoreCase("value")) {
				dropdown.selectByValue(value);
			}
		} else if (identifiedBy.equalsIgnoreCase("link")) {
			Select dropdown = new Select(wd.findElement(By.linkText(locator)));
			if (identifiedBy.equalsIgnoreCase("index")) {
				dropdown.selectByIndex(index);
			} else if (identifiedBy.equalsIgnoreCase("text")) {
				dropdown.selectByVisibleText(value);
			} else if (identifiedBy.equalsIgnoreCase("value")) {
				dropdown.selectByValue(value);
			}
		} else if (identifiedBy.equalsIgnoreCase("plink")) {
			Select dropdown = new Select(wd.findElement(By
					.partialLinkText(locator)));
			if (identifiedBy.equalsIgnoreCase("index")) {
				dropdown.selectByIndex(index);
			} else if (identifiedBy.equalsIgnoreCase("text")) {
				dropdown.selectByVisibleText(value);
			} else if (identifiedBy.equalsIgnoreCase("value")) {
				dropdown.selectByValue(value);
			}
		}
	}

	public static void selectItemFromList(String identifiedBy, String selectBy,
			String locator, String itemType, String value, WebDriver wd) {

		WebElement element = null;
		if (identifiedBy.equalsIgnoreCase("id")) {
			element = wd.findElement(By.id(locator));
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			element = wd.findElement(By.name(locator));
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			element = wd.findElement(By.xpath(locator));
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			element = wd.findElement(By.cssSelector(locator));
		} else if (identifiedBy.equalsIgnoreCase("link")) {
			element = wd.findElement(By.linkText(locator));
		} else if (identifiedBy.equalsIgnoreCase("plink")) {
			element = wd.findElement(By.partialLinkText(locator));
		}
		Select se = new Select(element);
		if (itemType.equalsIgnoreCase("value")) {
			se.selectByValue(value);
		} else if (itemType.equalsIgnoreCase("index")) {
			se.selectByIndex(Integer.parseInt(value));
		} else if (itemType.equalsIgnoreCase("text")) {
			se.selectByValue(value);
		}
	}

	public static void pressEnter(String identifiedBy, String locator,
			String value, WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).sendKeys(Keys.ENTER);
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).sendKeys(Keys.ENTER);
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
		} else if (identifiedBy.equalsIgnoreCase("linktext")) {
			wd.findElement(By.linkText(locator)).sendKeys(Keys.ENTER);
		} else if (identifiedBy.equalsIgnoreCase("plink")) {
			wd.findElement(By.partialLinkText(locator)).sendKeys(Keys.ENTER);
		}

	}

	public static String getTextFromField(String identifiedBy, String locator,
			WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			return wd.findElement(By.id(locator)).getAttribute("value");
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			return wd.findElement(By.name(locator)).getAttribute("value");
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			return wd.findElement(By.xpath(locator)).getAttribute("value");
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			return wd.findElement(By.cssSelector(locator))
					.getAttribute("value");
		}
		return null;
	}

	public static String getElementText(String identifiedBy, String locator,
			WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			return wd.findElement(By.id(locator)).getText();
		} 
		else if (identifiedBy.equalsIgnoreCase("name")) {
			return wd.findElement(By.name(locator)).getText();
		} 
		else if (identifiedBy.equalsIgnoreCase("xpath")) {
			return wd.findElement(By.xpath(locator)).getText();
		} 
		else if (identifiedBy.equalsIgnoreCase("css")) {
			return wd.findElement(By.cssSelector(locator)).getText();
		}
		return null;
	}

	public static void navigateForward(WebDriver wd) {

		wd.navigate().forward();

	}

	public static void navigateBack(WebDriver wd) {

		wd.navigate().back();

	}

	public static void scrollUp(WebDriver wd, int index) {

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("window.scollTo(0,index)");
	}

	public static void scrollDown(WebDriver wd, int index) {

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("window.scollTo(0,-index)");
	}

	public static void scrollHorizontal(WebDriver wd, int index) {

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("window.scollTo(index,0)");
	}

	public static void scrollVertical(WebDriver wd, int index) {

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("window.scollTo(-index,0)");
	}

	public static void refresh(WebDriver wd) {

		wd.navigate().refresh();

	}

	public static void upArrow(String identifiedBy, String locator, WebDriver wd) {
		wd.findElement(By.xpath(locator)).sendKeys(Keys.ARROW_UP);
	}

	public static void upDown(String identifiedBy, String locator, WebDriver wd) {
		wd.findElement(By.xpath(locator)).sendKeys(Keys.ARROW_DOWN);
	}

	public static void switchToFrame(String identifiedBy, String locator,
			WebDriver wd) {
		WebElement element = null;
		if (identifiedBy.equalsIgnoreCase("id")) {
			element = wd.findElement(By.id(locator));
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			element = wd.findElement(By.name(locator));
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			element = wd.findElement(By.xpath(locator));
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			element = wd.findElement(By.cssSelector(locator));
		}
		wd.switchTo().frame(element);
	}

	public static void switchToFrameByIndex(int index, WebDriver wd) {
		wd.switchTo().frame(index);
	}

	public static void radioButton(String identifiedBy, String locator,
			WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("linktext")) {
			wd.findElement(By.linkText(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("plink")) {
			wd.findElement(By.partialLinkText(locator)).click();
		}
	}

	public static void validatePageTitle(String exceptedTitle, WebDriver wd) {
		Assert.assertEquals(exceptedTitle, wd.getTitle());
	}

	public static void acceptAlertMessage(String identifiedBy, String locator,
			WebDriver wd) {

		Alert alert = wd.switchTo().alert();
		alert.accept();
	}

	public static void getTextFromList(String identifiedBy, String locator,
			WebDriver wd) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			List<WebElement> options = wd.findElements(By.id(locator));
			for (int i = 0; i < options.size(); i++) {
				options.get(i).getText();

			}
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			List<WebElement> options = wd.findElements(By.name(locator));
			for (int i = 0; i < options.size(); i++) {
				options.get(i).getText();
			}
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			List<WebElement> options = wd.findElements(By.xpath(locator));
			for (int i = 0; i < options.size(); i++) {
				options.get(i).getText();
			}

		} else if (identifiedBy.equalsIgnoreCase("css")) {
			List<WebElement> options = wd.findElements(By.cssSelector(locator));
			for (int i = 0; i < options.size(); i++) {
				options.get(i).getText();
			}

		} else if (identifiedBy.equalsIgnoreCase("link")) {
			List<WebElement> options = wd.findElements(By.linkText(locator));
			for (int i = 0; i < options.size(); i++) {
				options.get(i).getText();
			}

		}
	}

	public static void mouseHover(String identifiedBy, String locator,WebDriver wd){
	
		WebElement element = null;
		if(identifiedBy.equalsIgnoreCase("id"))
		{
			element = wd.findElement(By.id(locator));
		}
		else if(identifiedBy.equalsIgnoreCase("name"))
		{
			element = wd.findElement(By.name(locator));
		}
		else if(identifiedBy.equalsIgnoreCase("xpath"))
		{
			element = wd.findElement(By.xpath(locator));
		}
		else if(identifiedBy.equalsIgnoreCase("css"))
		{
			element = wd.findElement(By.cssSelector(locator));
		}
		else if(identifiedBy.equalsIgnoreCase("link"))
		{
			element = wd.findElement(By.linkText(locator));
		}
		else if(identifiedBy.equalsIgnoreCase("plink"))
		{
			element = wd.findElement(By.partialLinkText(locator));
		}
		Actions action = new Actions(wd);
		action.moveToElement(element).perform();
	}
	
	
	public static void takeScreenShot(WebDriver wd) {
		try {
			int count = 0;
			String newFileNamePath;
			File directory = new File(".");
			DateFormat dataFormat = new SimpleDateFormat("dd_MMM_yyyy_hh_mm_ssaa");
			Date date = new Date();

			newFileNamePath = directory.getCanonicalPath() + "\\Screen-Shots\\"	+ dataFormat.format(date) + "_" + ".png";
			BufferedImage screenCapture = new Robot().createScreenCapture(new Rectangle(968, 1009));
			File file = new File(newFileNamePath);
			ImageIO.write(screenCapture, "png", file);
			count++;
			File screenshot = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(newFileNamePath));
			Reporter.log("<a href =" + newFileNamePath + "target 'newFileNamePath' >ScreenShot" + count + "<a>");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	
}
