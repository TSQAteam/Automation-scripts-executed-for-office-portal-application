package portaltestcases;

import org.testng.annotations.Test;

public class loginpagetest extends testbase{
	
	// Enable the continuity of the flow 
	
	@Test
	public void user () throws InterruptedException {
		loginpagetest.verify_login();
	 }
} 