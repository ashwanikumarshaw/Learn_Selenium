package Selenium_Git.Learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglesSearchTest {
	@Test
	void googleIt() {
		// declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "D:\\INSTALL\\QAE\\eclipse_Workspace\\Learn_Selenium\\Driver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	    // Launch website  
	    driver.navigate().to("http://www.google.com/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("ashwani kumar shaw");  
	          
	    // Click on the search button  
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click(); 
	    System.out.println("pass");
	}

}
