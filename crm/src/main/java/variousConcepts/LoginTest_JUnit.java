package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JUnit {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");

	}

	@AfterClass
	public static void afterclass() {
		System.out.println("After Class");
	}

	@After

	public void tearDown() {
		System.out.println("After Class");
		driver.close();
		driver.quit();

	}

	@Before

	public void launchBrowser() {
		System.out.println("Before");
		// user.dir
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\munae\\Selenium\\Selenium_First\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");(for
		// mac)
		driver = new ChromeDriver();

		// clear cashe
		driver.manage().deleteAllCookies();
		// go to webside
		driver.get("https://techfios.com/billing/?=admin/");
		//implicitly wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// maximize
		driver.manage().window().maximize();

	}

	@Test

	public void loginTest() {
		System.out.println("Login Test");

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login1")).click();
	}

	// Scanner scanner =new Scanner(System.in);
	@Test

	public void negLoginTest() {
		System.out.println("Neg Login Test");

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();

	}
}
