package chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {

	WebDriver OpenChrome(String Driverpath) {
		
		Driverpath="D:\\INSTALL\\QAE\\eclipse_Workspace\\Learn_Selenium\\Driver\\chromedriver.exe";
		
		 // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", Driverpath);  
	    WebDriver driver=new ChromeDriver();  
	      return driver;
	}
}
