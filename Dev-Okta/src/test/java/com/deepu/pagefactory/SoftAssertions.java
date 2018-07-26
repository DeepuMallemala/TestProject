package com.deepu.pagefactory;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

	WebDriver driver;
	
	public SoftAssertions (WebDriver driver) {
		this.driver=driver;
	}

	
	public void testSoftAssertion() {
		By group= By.xpath("//select=@name='department']");
		
	
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 Starts");
		
		assertion.assertTrue(driver.findElement(group).getText().equals("department"));
		
		System.out.println("Test Completes");
		
	}

}
