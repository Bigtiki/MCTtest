package mct.pages;

public class RegPage extends MasterPage {

	
	
public void completeREgistraionWith(String email, String uname, String fname, String lname ) {
		
		// Locators For Registration 
		String emailField = "ID:txtEmail";
		String userNameField = "ID:txtUserName";
		String passwordField = "ID:txtPassword";
		String cnfPassword = "ID:txtCnfPassword";	
		String firstNameField = "ID:txtFirstName";
		String lastNameField = "ID:txtLastName";
		String addressField = "Xpath://input[@placeholder='Address *']";
		String checknewsBox = "Name:check_news";
		String btnRegister = "ID:btnRegister";
		
		
		typeOnElement(emailField, email); 
		typeOnElement(userNameField, uname);
		
		typeOnElement(passwordField, "Abc123");
		typeOnElement(cnfPassword, "Abc123");

		typeOnElement(firstNameField, fname);
		typeOnElement(lastNameField, lname);
		typeOnElement(addressField, "123 Fifth Ave");
		
		clickElement(checknewsBox);
		clickElement(btnRegister);

		


		
	}
}