package portalflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import portaltestcases.testbase;

public class Homepage extends testbase {
	
	public Homepage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
 
	@FindBy(xpath=("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"))
	WebElement submenulea;
	 
	@FindBy(xpath=("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]"))
	WebElement submenuper;
	
	@FindBy(xpath=("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"))
	WebElement submenupro;
	
	@FindBy(xpath=("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"))
	WebElement submenuview;
	
	
	
	
	public Homepage firstpage() throws InterruptedException{	
		homepagetest = new Homepage (driver); 
		PageFactory.initElements(driver, Homepage.class );
		submenulea.click();
		Thread.sleep(3000);
		return homepagetest;	
		
	}
	
	public Homepage secondpage() throws InterruptedException{	
		homepagetest = new Homepage (driver); 
		PageFactory.initElements(driver, Homepage.class );
		submenuper.click();
		Thread.sleep(3000);
		return homepagetest;	
		
	}
	public Homepage thirdpage() throws InterruptedException{	
		homepagetest = new Homepage (driver); 
		PageFactory.initElements(driver, Homepage.class );
		submenupro.click();
		Thread.sleep(3000);
		return homepagetest;	
	}
	public Homepage fourthpage() throws InterruptedException{	
		homepagetest = new Homepage (driver); 
		PageFactory.initElements(driver, Homepage.class );
		submenuview.click();
		Thread.sleep(5000);
		return homepagetest;
	
	}
}

