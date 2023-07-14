package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class first_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Premkumar\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		// goto google.com
		driver.get("https://google.com");
		// enter text in search tab
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		// click on search button
		driver.findElement(By.name("btnK")).click();
		// close browser
		driver.close();

		System.out.println("Test Completed Successfully");
	}

}