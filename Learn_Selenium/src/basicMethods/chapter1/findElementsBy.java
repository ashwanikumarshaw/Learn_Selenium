package chapter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findElementsBy {
	/*
	 <a href="home.html">Home</a>
	 <p class="content">This is a login Page.</p>
	 <form id="loginForm">
	   <input name="username" type="text" />
	   <input name="password" type="password" />
	   <input name="continue" type="submit" value="Login" />
	  </form>
	  
	 */

	/* To access 
	 * List<WebElement> elements = driver.findElements(By.id(id));
	 * 
	 * Or
	 * 
	 * List<WebElement> elements = findElementsBy.byId(driver,"btnK");
	 * 
	 * int i=0;
	 * while(i++!=element.size()){
	 * syso(elements.get(i).getAttribute(value));
	 * }
	 */
	
	public static List<WebElement> byXpath(WebDriver driver, String path) {
		//path="//form[@id='loginForm']" 
		return driver.findElements(By.xpath(path));

	}

	public static List<WebElement> byName(WebDriver driver, String name) {
		//name="username"
		return driver.findElements(By.name(name));

	}

	public static List<WebElement> byId(WebDriver driver, String id) {
		//id="loginForm"
		return driver.findElements(By.id(id));

	}

	public static List<WebElement> byClass(WebDriver driver, String className) {
		//className= "content"
		return driver.findElements(By.className(className));

	}

	public static List<WebElement> byLinktext(WebDriver driver, String linkText) {
		//linkText="Home"
		return driver.findElements(By.linkText(linkText));

	}

	public static List<WebElement> byCss(WebDriver driver, String cssSelector) {
		//cssSelector = "p.content"
		return driver.findElements(By.cssSelector(cssSelector));

	}


}
