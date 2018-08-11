package portaltestcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testexecution{
	protected WebDriver driver;                

	
	@Test
	public void setup() throws InterruptedException, Exception {
	System.setProperty("webdriver.chrome.driver", "G://Bhuvanesh/Eclipseauto/driver/Chrome/chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("chrome browser is launched"); 
	driver.get("http://portal.tendersoftware.com/login"); 
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[1]/div/div/input")).sendKeys("bhuvanesh@versatile-soft.com");
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div/div/input")).sendKeys("abc@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
	Thread.sleep(3000);
	
//	Home section
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click(); //Leave
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click(); //Permission
	Thread.sleep(3000);
	
// Profile section
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click(); //Profile
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='widget-user-image']//a")).click();
	driver.findElement(By.xpath("//div[@class='drop_zone']")).click();
	
// To upload section 
	
	System.setProperty("webdriver.gecko.driver","G://Bhuvanesh/Eclipseauto/driver/Firefox/geckodriver.exe");
	driver.get("http://portal.tendersoftware.com/user/edit_profile");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//div[@class='drop_zone']")).click();
	Thread.sleep(2000);

	Robot robot = new Robot ();
	
	robot.setAutoDelay(2000);
	
    // Copy filepath into the clipborad	
	
	StringSelection stringSelection = new StringSelection("C:\\Users\\Images\\Thala.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	
	robot.setAutoDelay(3000);
	
    // Pressing conrole+v	
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);

    // Realesing conrole+v	
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.setAutoDelay(3000);
	
    //Pressing enter	
	
	robot.keyPress(KeyEvent.VK_ENTER);

    //Releasing enter	
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	driver.close();	 

	}
	

}
