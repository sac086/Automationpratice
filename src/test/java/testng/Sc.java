package testng;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Sc {
		@Test
		public void TestGoogle() throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("sachin", Keys.ENTER);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
		}
		
		@Test
		public void TestFacebook() throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
				driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
				driver.findElement(By.cssSelector("button[type='submit']")).click();
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
		}
	}

