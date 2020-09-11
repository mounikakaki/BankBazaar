package com.spacexdata.main;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.codegen.model.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BankBazaar {
	
	WebDriver driver=null;
	Actions act;
	
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.bankbazaar.com/finance-tools/emi-calculator.html");
		
		
	}
	
	@Test
	public void validate() {
		driver.findElement(By.linkText("Personal Loan EMI Calculator")).click();
		act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//div[@class='emi-loan-amount-slider']//div[@id='tooltip']"))).
		moveByOffset(100, 200).release().build().perform();
		
		//drag the cursor on the loan amount throught the offset coordiantes and perform the action
		//the value will the reflected on the screen for every movement
		//get the value by finding the locator
		//if it matches with 4L then stop the activity.
		//keep the above 4 steps in an infinite loop and break the loop  once the condition is met
		
		
	}
	
	

}
