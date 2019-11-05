package mct.testrunner;

import java.util.Random;

import mct.pages.HomePage;
import mct.pages.MasterPage;
import mct.pages.RegPage;

public class SmokeTest {

	public static void main(String[] args) {
		
		
		// ====== >>> Login Test 
		MasterPage master = new MasterPage();
		master.openBrowser();
		master.gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
		
		HomePage home = new HomePage();
		home.loginTest();
		home.waitFor(2000);
		home.validateProfileName("James williams");
		home.logOut();
		home.waitFor(2000);
		home.validateprofileNameNotExist();
		
		master.closeBrowser();
		
		
		// ====== >>> REgistration Test
		
		MasterPage master2 = new MasterPage();
		master2.openBrowser();
		master2.gotoURL("https://demo.iscripts.com/multicart/demo/index.php");

		HomePage home2 = new HomePage();
		home2.takeMetoSignUPPage();
		home2.waitFor(2000);
		RegPage regpage = new RegPage();
		
        Random rand = new Random(); 
        int regNumber = rand.nextInt(1000);
        
		regpage.completeREgistraionWith("mrabc"+regNumber+"@gmail.com","mrabc"+regNumber,"mr","abc"+regNumber);
		home2.waitFor(4000);
		home2.validateProfileName("mr abc"+regNumber);
		System.out.println("We varifying today!");
		master.closeBrowser();
		

		

	}

}