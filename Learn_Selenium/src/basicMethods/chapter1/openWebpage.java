package chapter1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
/*
 * driver. get() is used to navigate particular URL 
 * and wait till page load. 
 * navigate() is used to navigate to particular URL 
 * and does not wait to page load. 
 * It maintains browser history or cookies to navigate back or forward.
 * 
 */

public class openWebpage {

	public String getPage(WebDriver driver, String url) {

		driver.get(url);
		return driver.getTitle();

	}

	public String navTo(WebDriver driver, String url) {

		driver.navigate().to(url);
		return driver.getTitle();

	}

	public String navBack(WebDriver driver, String url) {

		driver.navigate().back();
		return driver.getTitle();

	}

	public String navForward(WebDriver driver) {

		driver.navigate().forward();
		return driver.getTitle();

	}

	public String navRefresh(WebDriver driver) {
		 
		//WebElement ele=findElementBy.byId(driver,"id");
		driver.navigate().refresh();
		return driver.getTitle();

	}

}
