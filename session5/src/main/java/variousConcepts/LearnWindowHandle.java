package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
	
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chromedrive.driver", "driver1\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	
	public void testWindowHandle() {
	
	String title1= driver.getTitle();
	System.out.println(title1);
	String handle1= driver.getWindowHandle();
	System.out.println(handle1);
	
	driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("xpath");
	driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
	}
		
	}

