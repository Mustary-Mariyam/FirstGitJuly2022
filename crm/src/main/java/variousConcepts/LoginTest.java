package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		launchBrowser();
		loginTest();
		tearDown();
		
		
		launchBrowser();
		negLoginTest();
		tearDown();

	}
	public static void tearDown() {
		driver.close();
		driver.quit();
		
	}
	
	public static void launchBrowser() {
		//user.dir
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\munae\\Selenium\\Selenium_First\\driver\\chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");(for mac)
				 driver = new ChromeDriver();
				
				//clear cashe
				driver.manage().deleteAllCookies();
				//go to webside
				driver.get("https://techfios.com/billing/?=admin/");
				//maximize
				driver.manage().window().maximize();
				
	}
	
	public static void loginTest() {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
	
	public static void negLoginTest() {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
		
		
		
	}
}
