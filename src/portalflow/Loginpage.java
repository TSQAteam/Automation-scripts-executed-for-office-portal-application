package portalflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import portaltestcases.testbase;

//extend testbase class for each page class

    public class Loginpage extends testbase{
	
	// Create constructor for all class 
	
	public Loginpage (WebDriver driver) { 
    this.driver=driver; 
    PageFactory.initElements(driver, this);  

	}
	
	@FindBy(xpath=("/html/body/div[1]/div/div/form/div[1]/div/div/input"))
	WebElement username;
	
	@FindBy (xpath=("/html/body/div[1]/div/div/form/div[2]/div/div/input"))
	WebElement password;
	
	@FindBy (xpath=("/html/body/div[1]/div/div/form/button"))
	WebElement login;
	
	
	
	public Loginpage enteremail() {
	loginpagetest = new Loginpage (driver);
	PageFactory.initElements(driver, Loginpage.class );
	username.sendKeys("bhuvanesh@versatile-soft.com");
 	return loginpagetest;
		
	} 
	
	public Loginpage enterpassword() {
		loginpagetest = new Loginpage (driver);
		PageFactory.initElements(driver, Loginpage.class );
		password.sendKeys("abc@123");
		return loginpagetest;
	}
	
	public Loginpage click_login() {
		loginpagetest = new Loginpage (driver);
		PageFactory.initElements(driver, Loginpage.class );
		login.click();
		return loginpagetest;
	}
	
	public Loginpage verify_login() throws InterruptedException {
		loginpagetest = new Loginpage (driver); 
		PageFactory.initElements(driver, Loginpage.class );
		enteremail().enterpassword().click_login();
		return loginpagetest;
	}

	// Connectivity scenario for next page and ensure class name [Navigation Purpose]
	// Need to add created classes under in test base "protected Homepage homepagetest;"
	
	  public Homepage move_tohomeportal() throws InterruptedException {
	    homepagetest = new Homepage (driver); 
		PageFactory.initElements(driver, Homepage.class );
     	Thread.sleep(3000);
		return homepagetest; 
	  }
		
	  }  
           
    
    
   