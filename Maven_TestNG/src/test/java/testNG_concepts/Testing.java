package testNG_concepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing {

	
	WebDriver driver;
	@BeforeSuite
	public void launch() {
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://www.amazon.com/");
				
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();

		driver.findElement(By.id("ap_email")).sendKeys("Abc@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("password@123");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}
	
	
	
	
	
	
}