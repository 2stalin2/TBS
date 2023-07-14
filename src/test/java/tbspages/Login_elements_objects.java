package tbspages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login_elements_objects {
	private WebDriver driver;
	By username = By.xpath("//input[@placeholder='Email']");
	By password = By.xpath("//input[@placeholder='Password']");
	By continuebutton = By.xpath("//button[@type='submit']");

	public Login_elements_objects(WebDriver driver) {
		this.driver = driver;

	}

	public void username(String text) {
		driver.findElement(username).sendKeys(text);
	}

	public void password(String text) {
		driver.findElement(password).sendKeys(text);
	}

	public void continuebutton() {
		driver.findElement(continuebutton).sendKeys(Keys.RETURN);
	}
}
