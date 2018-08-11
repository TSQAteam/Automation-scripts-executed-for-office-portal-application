package portaltestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import portalflow.Homepage;
import portalflow.Loginpage;

public class testbase {
 
// Need to create object for all page class	
	
protected WebDriver driver;
protected Loginpage loginpagetest;
protected Homepage homepagetest;
public String browsername="firefox";

@BeforeClass
public void setup() {	
switch(browsername)
	 {
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "G://Bhuvanesh/Eclipseauto/driver/Chrome/chromedriver.exe");
	    driver = new ChromeDriver();
	    System.out.println("chrome browser is launched");
	   break; 
	 case "firefox":
		System.setProperty("webdriver.gecko.driver", "G://Bhuvanesh/Eclipseauto/driver/Firefox/geckodriver.exe");
     	driver = new FirefoxDriver();
		break;	
	}
	
	driver.get("http://portal.tendersoftware.com/login");
	loginpagetest=PageFactory.initElements(driver,Loginpage.class);
}


@AfterClass
public void close() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();	
}

}