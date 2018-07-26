package com.devokta.pages;

import java.util.List;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeSheet<WebElement> {

	WebDriver driver;
	
	public TimeSheet(WebDriver driver) {
		this.driver = driver;
	}

	public void enterDataToTimeSheet(String c) {
		 By cancelButton = By.xpath("//a[@class='btn floatLeft']");
		 driver.findElement(cancelButton).click();
		 
		 
		By sunDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:0:day:day']");
		driver.findElement(sunDay).sendKeys(c);
	
		
		By mondtime = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:1:day:day']");
		
	    String 	mon=driver.findElement(mondtime).getText();
		System.out.println(mondtime);
		
		if(mon!=null&&mon.equals("8.00")) {
		
	     System.out.println(mondtime);
		}
		else {
			driver.findElement(mondtime).sendKeys(c);
			System.out.println(mondtime);
		}
		
		
		By tuesDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:2:day:day']");
	    String 	tues =driver.findElement(tuesDay).getText();
	   // System.out.println(tuesDay);
		
		if(tues!=null&&tues.equals("8.00")) {
			System.out.println(tuesDay);
		}
		
		else {
			//driver.findElement(tuesDay).sendKeys(c);
			System.out.println(tuesDay);
		}
		
		
		By wednesDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:3:day:day']");
		String wed =driver.findElement(wednesDay).getText();
		
		if(wed!=null&&wed.equals("8.00")) {
			System.out.println("wednesDay");
		}
		else {
			//driver.findElement(wednesDay).sendKeys(c);
			System.out.println(wednesDay);
		}
	
		
		By thursDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:4:day:day']");
	    String thurs=	driver.findElement(thursDay).getText();
		
		if(thurs!=null&&thurs.equals("8.00")) {
			System.out.println("thursDay");
		}
		else {
			//driver.findElement(thursDay).sendKeys(c);
			System.out.println(thursDay);
		}
	
		
		By friDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:5:day:day']");
		String fri =driver.findElement(friDay).getText();
		if(fri!=null&&fri.equals("8.00")) {
			System.out.println("friDay");
		}
		else {
			//driver.findElement(friDay).sendKeys(c);
			System.out.println(friDay);
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		By storebutton=By.xpath("//a[@class='bluebutton store']");
		driver.findElement(storebutton).click(); 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		By okButton=By.xpath("//button[@class='swal2-confirm swal2-styled']");
		
		//assertTrue(driver.findElement(okButton).getText().equals("OK"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(okButton).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
          //  By signOut= By.xpath("a");
		//driver.findElement(signOut).click();
		assertTrue(driver.findElement(By.linkText("Sign out")).getText().equals("Sign out"));
		
        signOutClickLinkByHref("https://dev-timesheets.mynisum.com/eh/logout");
		
	}
	public void signOutClickLinkByHref(String href) {
		 List<org.openqa.selenium.WebElement> anchors = driver.findElements(By.tagName("a"));
	       Iterator<org.openqa.selenium.WebElement> i = anchors.iterator();

	       int j = 0;
	       while(i.hasNext()) {
	           org.openqa.selenium.WebElement anchor = i.next();

	           if(anchor.getAttribute("href").contains(href)) {
	               j++;
	           }

	           if(anchor.getAttribute("href").contains(href)) {
	               anchor.click();
	               break;
	           }
	       }
	}	  
}
