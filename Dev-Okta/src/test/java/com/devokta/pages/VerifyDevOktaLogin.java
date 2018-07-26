package com.devokta.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.deepu.pagefactory.SoftAssertions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import com.nisum.datadriven.InputData;

public class VerifyDevOktaLogin {
	
	String a = "hmallemala@nisum.com";
	String b = "Honey$123";

	WebDriver driver;
	
	@Test
	public void verifyValidLogin() throws InterruptedException  {		
		WebDriver driver = PageUtil.getDriverDetails("https://dev-572298.oktapreview.com");
		
		DevOktaLoginPage login= new DevOktaLoginPage(driver);
		
		login.loginToDevOkta(a, b);
				
		
		ehourDevPage ehdpg= new ehourDevPage(driver);
		ehdpg.clickOnEhourDev();
		
		UserInfo uIF=new UserInfo(driver);
		//uIF.EmpInfo();
		
		String c= "8.00";
		
		driver.get("https://dev-timesheets.mynisum.com/eh/consultant/overview?1&openPanel=TIMESHEET");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> child_windows = driver.getWindowHandles();
		 
		for(String childWindow:child_windows) {
			if(!parentWindow.equals(childWindow)) {
				System.out.println("Child window Name"+childWindow+":"+driver.getTitle());
				driver.switchTo().window(childWindow);
			}				
		}
		
		//driver = PageUtil.getDriverDetails("https://dev-timesheets.mynisum.com/eh/consultant/overview?1&openPanel=TIMESHEET");
		//driver.switchTo().window(parentWindow);
		TimeSheet timeSheet = new TimeSheet(driver);
		timeSheet.enterDataToTimeSheet(c);	
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		SoftAssertions soft= new SoftAssertions(driver);
		//soft.testSoftAssertion();
		
	}
	
	/*@Test(dataProvider="inputCsvData",dataProviderClass=InputData.class)
	public void inputDataDriverCSVFileData(InputData inputData) {
		
		driver.get(appURL);
		
		NewInputDataPage inputData =PageFactory.initElements(driver, NewInputDataPage.class);
	}*/

}


