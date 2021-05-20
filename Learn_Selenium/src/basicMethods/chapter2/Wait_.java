package chapter2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_ {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\INSTALL\\QAE\\eclipse_Workspace\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
/*
 * Implicit Wait
 * Implicit wait time is applied to all the elements in the script
 * 
 */
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("nyc");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-destination-hp-package")).sendKeys("sa");
		driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-departing-hp-package")).sendKeys("05/25/2021");
		
		//driver.findElement(By.id("Fpackage-departing-hp-package")).sendKeys(Keys.TAB);
		// 5/20/2021 and 4/14/2022.

		//driver.findElement(By.id("package-returning-hp-package")).sendKeys("04/14/2022");
		//driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.TAB);
		
		WebDriverWait wait= new WebDriverWait(driver, 20);// SECONDS
		wait.until(ExpectedConditions.elementToBeClickable(By.id("partialHotelBooking-hp-package")));
		//*[@id="partialHotelBooking-hp-package"]
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		//Thread.sleep(5000L);

		driver.findElement(By.id("search-button-hp-package")).sendKeys(Keys.ENTER);
		//*[@id="search-button-hp-package"]
		
		/*
		 * Explicit Wait
		 * Explicit wait time is applied only to those elements which are intended by us
		 * In Explicit Wait, we need to specify "ExpectedConditions" on the element to be located
		 * 
		 * wait.until(ExpectedConditions.
		 * 
		 * 
		 * alertIsPresent() 
		 * elementSelectionStateToBe() 
		 * elementToBeClickable()
		 * elementToBeSelected() 
		 * frameToBeAvaliableAndSwitchToIt()
		 * invisibilityOfTheElementLocated() 
		 * invisibilityOfElementWithText()
		 * presenceOfAllElementsLocatedBy() 
		 * presenceOfElementLocated()
		 * textToBePresentInElement() 
		 * textToBePresentInElementLocated()
		 * textToBePresentInElementValue() 
		 * titleIs()
		 * titleContains() 
		 * visibilityOf()
		 * visibilityOfAllElements() 
		 * visibilityOfAllElementsLocatedBy()
		 * visibilityOfElementLocated()
		 * 
		 */
	}
}