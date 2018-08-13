package portalflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.junit.jupiter.api.Test;

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
		
	@FindBy(xpath=("//span[contains(text(),'Edit Profile')]"))
	WebElement editpro;
	
	@FindBy(id="current_address")
	WebElement entrycontent;
	
	@FindBy(id="same_as")
	WebElement check;
	
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

	public Homepage tapedit() throws InterruptedException, FindFailed{	
		homepagetest = new Homepage (driver); 
		PageFactory.initElements(driver, Homepage.class );
		editpro.click();
		Thread.sleep(3000);
				
		Pattern Drop = new Pattern("G:\\Bhuvanesh\\Mine Documents\\Portaltest\\Drop.png");
		Thread.sleep(3000);
		Pattern name = new Pattern("G:\\Bhuvanesh\\Mine Documents\\Portaltest\\name.png"); 
		Thread.sleep(3000);
		Pattern open = new Pattern("G:\\Bhuvanesh\\Mine Documents\\Portaltest\\open.png");
		Thread.sleep(3000);
		
		Screen src = new Screen(); 
		src.setAutoWaitTimeout(3000);
		src.click(Drop);
		Thread.sleep(3000);
		src.type(name,"G:\\Bhuvanesh\\Mine Documents\\portal.txt"); //uploading image path
		src.click(open);
		
		return homepagetest;
	
	
	}
	
	public Homepage addcontent() throws InterruptedException, FindFailed{	
		homepagetest = new Homepage (driver); 
		PageFactory.initElements(driver, Homepage.class );
		entrycontent.sendKeys("No. 7, Mission Street, Puducherry");
		Thread.sleep(3000);
		return homepagetest;
	
	
    }
		
 	public Homepage enablebox() throws InterruptedException, FindFailed{	
				homepagetest = new Homepage (driver); 
				PageFactory.initElements(driver, Homepage.class );
				check.click(); 
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

