package mct.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class MasterPage {


	public static WebDriver driver;

	public void openBrowser() {

		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver");
		driver = new ChromeDriver();*/
		/*System.setProperty("webdriver.safari.driver", System.getProperty("user.dir")+ "/safaridriver");
		driver = new SafariDriver();*/
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+ "/geckodriver");
		driver = new FirefoxDriver();


	}


	public void gotoURL(String url) {
		driver.get(url);
	}



	public void clickElement(String locatores) {
		if(locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).click();
		} else if(locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).click();
		} else if(locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).click();
		}

	}

	public void typeOnElement(String locatores, String valueTotype) {
		if(locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).sendKeys(valueTotype);
		}  else if(locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).sendKeys(valueTotype);
		} else if(locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).sendKeys(valueTotype);
		}

	}

	public String getElementText(String locatores) {
		if(locatores.contains("ID")) {
			return driver.findElement(By.id(locatores.split(":")[1])).getText();
		}  else if(locatores.contains("Xpath")) {
			return driver.findElement(By.xpath(locatores.split(":")[1])).getText();
		} else if(locatores.contains("Name")) {
			return driver.findElement(By.name(locatores.split(":")[1])).getText();
		}

		return "";

	}


	public boolean elementNotExist(String locatores) {

		try {
			if(locatores.contains("ID")) {
				return driver.findElement(By.id(locatores.split(":")[1])).isDisplayed();
			}  else if(locatores.contains("Xpath")) {
				return driver.findElement(By.xpath(locatores.split(":")[1])).isDisplayed();
			} else if(locatores.contains("Name")) {
				return driver.findElement(By.name(locatores.split(":")[1])).isDisplayed();
			}	
		} catch(Exception e) {
			return false;
		}

		return false;
	}




	public void closeBrowser() {
		driver.quit();
	}

	public void waitFor(int mls) {
		try {
			Thread.sleep(mls); // Sleep for one thousand milisecond 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



}