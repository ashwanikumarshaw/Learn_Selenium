package chapter1;

import org.openqa.selenium.WebDriver;
/*
 * close() method shall close the browser which is in focus.
 * close() method closes the active WebDriver instance.
 * quit() method closes all the browsers.
 * quit() method closes all the active WebDriver instances.
 */

public class closeQuit {

	void clo(WebDriver driver) {
		driver.close();

	}

	void qui(WebDriver driver) {
		driver.quit();

	}

}
