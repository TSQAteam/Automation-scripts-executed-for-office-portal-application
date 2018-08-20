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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.android.dx.rop.cst.CstArray.List;

public class testexecution{
	private static final String Male = null;
	protected WebDriver driver;                
 
	
	@Test
	public void setup() throws InterruptedException, Exception {
	System.setProperty("webdriver.chrome.driver", "G://Bhuvanesh/Eclipseauto/driver/Chrome/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("chrome browser is launched"); 
	driver.get("http://portal.tendersoftware.com/login"); 
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[1]/div/div/input")).sendKeys("bhuvanesh@versatile-soft.com");
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div/div/input")).sendKeys("abc@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
	Thread.sleep(3000);
	
//	Home section - Merge 
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click(); //Leave
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click(); //Permission
	Thread.sleep(3000);
	
// Profile section // To upload section by sikuli concepts
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click(); // Tap Profile
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Edit Profile')]")).click(); // Tap Edit profile
	Thread.sleep(2000);
		
	Pattern Drop = new Pattern("G:\\Bhuvanesh\\Mine Documents\\Sikulishot\\Portaltest\\Drop.png");
	Thread.sleep(3000);
	Pattern name = new Pattern("G:\\Bhuvanesh\\Mine Documents\\Sikulishot\\Portaltest\\name.png"); 
	Thread.sleep(3000);
	Pattern open = new Pattern("G:\\Bhuvanesh\\Mine Documents\\Sikulishot\\Portaltest\\open.png");
	Thread.sleep(3000);
	
	
//  ImagePath.setBundlePath("C:\\someDir\\sikulipatterns");	
	Screen src = new Screen(); 
	src.setAutoWaitTimeout(3000);
	src.click(Drop);
	Thread.sleep(3000);
	src.type(name,"G:\\Bhuvanesh\\Mine Documents\\portal.txt"); //uploading image path
	src.click(open);
	
	WebElement toClear = driver.findElement(By.id("current_address"));
	toClear.sendKeys(Keys.CONTROL + "a");
	toClear.sendKeys(Keys.DELETE);
	
	driver.findElement(By.id("current_address")).sendKeys("No. 7, Mission Street, Puducherry");
	Thread.sleep(3000);
	
	driver.findElement(By.id("same_as")).click();
	Thread.sleep(5000);
	
	
	
//Blood  Drop down	
	
	WebElement blood_dropdown=driver.findElement(By.id("blood_gp"));
	Select blood_dd=new Select(blood_dropdown);
	
	WebElement selected_value=blood_dd.getFirstSelectedOption();
	
// It should return blood	
	System.out.print("Before Selection selected values is "+selected_value.getText());
	
// It will select A1B
	blood_dd.selectByIndex(11);
	
	WebElement selected_value1=blood_dd.getFirstSelectedOption();
	System.out.print("After Selection selected values is "+selected_value1.getText());
	
// Calendar selection 
	
		
	driver.findElement(By.id("date_of_birth")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
	
	System.out.println("DOB Selected");
	
	Thread.sleep(3000);
	
// Fa name 
	
	WebElement toClear1 = driver.findElement(By.id("father_name"));
	toClear1.sendKeys(Keys.CONTROL + "a");
	toClear1.sendKeys(Keys.DELETE);
	
	driver.findElement(By.id("father_name")).sendKeys("N kanniappan");
	Thread.sleep(3000);
	
		
//Gender  Drop down	
	
	
	executeScript("window.scrollBy(0,3500)");
	Thread.sleep(3000);
	
	String gender = "Male";

	if(gender.equalsIgnoreCase(Male))
	{
		String xp="//button[@title='Female']";
		WebElement gender2 = driver.findElement(By.xpath(xp));
		Actions acions=new Actions(driver);
		acions.moveToElement(gender2).perform();
		Thread.sleep(3000);
		
		// We need to do manaually drag the mouse in the web page for above code , so i user sikuli concepts below here
		
		Pattern dropg = new Pattern("G:\\Bhuvanesh\\Mine Documents\\Sikulishot\\Portaltest\\dropg.png");
		Thread.sleep(3000);
		Screen src1 = new Screen(); 
		src1.setAutoWaitTimeout(3000);
		src1.click(dropg);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Male")).click();
		System.out.println("Male is selected");
		Thread.sleep(3000);
		
	}
	
	
	else
	{
		String xp="//button[@title='Male']";
		WebElement gender3 = driver.findElement(By.xpath(xp));
		Actions acions=new Actions(driver);
		acions.moveToElement(gender3).perform();
		Thread.sleep(3000);
		
		// We need to do manaually drag the mouse in the web page for above code , so i used sikuli concepts below here
		
		Pattern dropg = new Pattern("G:\\Bhuvanesh\\Mine Documents\\Sikulishot\\Portaltest\\dropg.png");
		Thread.sleep(3000);
		Screen src1 = new Screen(); 
		src1.setAutoWaitTimeout(3000);
		src1.click(dropg);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Female")).click();
		System.out.println("Female is selected");
	}
			
	
	
// To upload section by robot concepts
	
    //System.setProperty("webdriver.gecko.driver","G://Bhuvanesh/Eclipseauto/driver/Firefox/geckodriver.exe");
	//driver.get("http://portal.tendersoftware.com/user/edit_profile");
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//div[@class='drop_zone']")).click();
	//Thread.sleep(2000);
    //Robot robot = new Robot ();
	//robot.setAutoDelay(2000);
	
	// Copy filepath into the clipborad	
	
	//StringSelection stringSelection = new StringSelection("C:\\Users\\Images\\Thala.jpg");
	//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	//robot.setAutoDelay(3000);
    
	// Pressing conrole+v	
	
	//robot.keyPress(KeyEvent.VK_CONTROL);
	//robot.keyPress(KeyEvent.VK_V);
    
	// Realesing conrole+v	
	
	//robot.keyRelease(KeyEvent.VK_CONTROL);
	//robot.keyRelease(KeyEvent.VK_V);
	//robot.setAutoDelay(3000);
	
	//Pressing enter	
	
	//robot.keyPress(KeyEvent.VK_ENTER);

    //Releasing enter	
	
	//robot.keyRelease(KeyEvent.VK_ENTER);
	
			
	}


	private void executeScript(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
