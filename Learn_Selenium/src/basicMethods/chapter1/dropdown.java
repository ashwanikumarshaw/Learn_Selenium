package chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	void selectItem(WebDriver driver,String text ) {
		Select drpCountry = new Select(findElementBy.byName(driver, "country"));
		drpCountry.selectByVisibleText(text);

	}
	void selectItem(WebDriver driver,int num) {

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(findElementBy.byId(driver, "country"));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(num);
	}

}
