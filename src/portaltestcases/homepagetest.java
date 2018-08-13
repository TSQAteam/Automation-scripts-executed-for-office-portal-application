package portaltestcases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class homepagetest extends testbase{
	
	@Test 
	
	public void verifyhomepage () throws InterruptedException, FindFailed {
		loginpagetest.verify_login().move_tohomeportal().firstpage().secondpage().thirdpage().tapedit().addcontent().enablebox().fourthpage();
	  }
   
} 
 