package mavenProject.Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver;
	@BeforeTest
	public void beforeTestFunction(){
		System.out.println("Before Test ");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void testFunction() throws InterruptedException{
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
	}
	@AfterTest
	public void afterTestFunction(){
		driver.close();//
	}

}
