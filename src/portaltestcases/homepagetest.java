package portaltestcases;

import org.testng.annotations.Test;

public class homepagetest extends testbase{
	
	@Test 
	
	public void verifyhomepage () throws InterruptedException {
		loginpagetest.verify_login().move_tohomeportal().firstpage().secondpage().thirdpage().fourthpage();
	  }

}
