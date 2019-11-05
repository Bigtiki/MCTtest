package mct.pages;

public class HomePage extends MasterPage{



	public void loginTest() {

		// All Locators Variables for login Only 
		String loginLink = "ID:dLabellogin";
		String usernameFIeld = "ID:username";
		String passwordField = "ID:password";
		String loginButton = "ID:jqLogin";


		clickElement(loginLink);
		typeOnElement(usernameFIeld,"user");
		typeOnElement(passwordField,"pass");
		clickElement(loginButton);		

	}


	public void takeMetoSignUPPage() {
		// 
		String signUpButton = "ID:jqSignup";
		String loginLink = "ID:dLabellogin";


		clickElement(loginLink);
		clickElement(signUpButton);


	}

	public void logOut() {

		String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
		String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[3]/a";

		clickElement(profileNameLabel);
		clickElement(logOutLink);
	}
	
	
	public void validateProfileName(String expectedValue) {

		// Locators for Profile Name 
		String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
		
		String expectedProfilename = expectedValue;
		String actualProfilename = getElementText(profileNameLabel);
		
		if(actualProfilename.equalsIgnoreCase(expectedProfilename)){
			System.out.println("Login Test Passed ");
		} else {
			System.out.println("Login Test Failed... ");

		}


	}

	public void validateprofileNameNotExist() {
		
		String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
		
		if(elementNotExist(profileNameLabel)==false) {
			System.out.println("Log Out Happened Test Passed ");
		} else {
			
			System.out.println("Log Out Not Happened Test Faled ");
		}
		
	}


}