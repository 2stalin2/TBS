package testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import tbspages.Login_elements_objects;

public class Login {
	WebDriver driver = null;
	Login_elements_objects elements = null;
	private Object errorMessage;
	

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");		
//        ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);		
		driver = new ChromeDriver();
		elements = new Login_elements_objects(driver);
		
	}

	@Test
	public void launchurl() throws InterruptedException {
		driver.get("https://tbscmmstest.heptagon.tech/login");
		Thread.sleep(5000);
		elements.username("testing");
		elements.password("12345");
		elements.continuebutton();
		Thread.sleep(5000);
		// Check if error message is displayed
		WebElement validationMessage = driver.findElement(By.cssSelector("div[class='message-div']span"));		
		assertEquals(validationMessage.getText(), "User is not Authorized");		
		Thread.sleep(5000);
	}

	@Test
	public void invalidpasswd() throws InterruptedException {
		driver.get("https://tbscmmstest.heptagon.tech/login");
		Thread.sleep(5000);
		elements.username("sasikala.k@heptagon.in");
		elements.password("dfghj");
		elements.continuebutton();
		Thread.sleep(5000);
		// Check if error message is displayed
		WebElement validationMessage = driver.findElement(By.cssSelector("div[class='message-div']span"));		
		assertEquals(validationMessage.getText(), "User is not Authorized");
		Thread.sleep(5000);
	}

	@Test
	public void bumodule() throws InterruptedException {
		driver.get("https://tbscmmstest.heptagon.tech/login");
		Thread.sleep(5000);
		elements.username("sasikala.k@heptagon.in");
		elements.password("12345");
		elements.continuebutton();
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();

	}
}
