package launchbrowser;

import org.openqa.selenium.By;

//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\munae\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.className("btnk")).click();

		Thread.sleep(3000);

		// driver.get("http://selenium.dev");
		// System.out.println(driver.getTitle());
		// driver.quit();

	}

}
