package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findElementBy {
	/*
	 <a href="home.html">Home</a>
	 <p class="content">This is a login Page.</p>
	 <form id="loginForm">
	   <input name="username" type="text" />
	   <input name="password" type="password" />
	   <input name="continue" type="submit" value="Login" />
	  </form>
	  
	 */
	
	public static WebElement byXpath(WebDriver driver, String path) {
		//path="//form[@id='loginForm']" 
		return driver.findElement(By.xpath(path));

	}

	public static WebElement byName(WebDriver driver, String name) {
		//name="username"
		return driver.findElement(By.name(name));

	}

	public static WebElement byId(WebDriver driver, String id) {
		//id="loginForm"
		return driver.findElement(By.id(id));

	}

	public static WebElement byClass(WebDriver driver, String className) {
		//className= "content"
		return driver.findElement(By.className(className));

	}

	public static WebElement byLinktext(WebDriver driver, String linkText) {
		//linkText="Home"
		return driver.findElement(By.linkText(linkText));

	}

	public static WebElement byCss(WebDriver driver, String cssSelector) {
		//cssSelector = "p.content"
		return driver.findElement(By.cssSelector(cssSelector));

	}

}
