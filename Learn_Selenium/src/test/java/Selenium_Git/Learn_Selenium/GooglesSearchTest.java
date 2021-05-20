package Selenium_Git.Learn_Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import chapter2.*;

public class GooglesSearchTest {
	@Test(priority = 1)
	void googleIt() {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver",
				"D:\\INSTALL\\QAE\\eclipse_Workspace\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch website
		driver.navigate().to("http://www.google.com/");

		// Click on the search text box and send value
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
				.sendKeys("ashwani kumar shaw");

		// Click on the search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();

		System.out.println("pass");

		try {
			Take_screenshot.takeSnapShot(driver,
					"D:\\INSTALL\\QAE\\eclipse_Workspace\\Learn_Selenium\\Snapshot\\num1.png");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	void Readfile() {

		String filePath = "D:\\INSTALL\\QAE\\eclipse_Workspace\\Learn_Selenium\\Excel";
		String fileName = "Read.xlsx";
		String sheetName = "Sheet1";
		//
		try {
			ReadExcel.readExcel(filePath, fileName, sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	void Writeile() {

		String filePath = "D:\\INSTALL\\QAE\\eclipse_Workspace\\Learn_Selenium\\Excel";
		String fileName = "Write.xlsx";
		String sheetName = "Sheet1";
		String[] dataToWrite = { "Ashwani ", "Kumar", "Shaw" };

		try {
			WriteExcel.writeExcel(filePath, fileName, sheetName, dataToWrite);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
