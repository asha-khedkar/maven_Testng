package testNG_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Locators {

	WebDriver driver;
	
	@Test(enabled=true, priority=1)
	public void button() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		driver.get("http://www.leafground.com/pages/Button.html");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("position")));
		driver.findElement(By.id("position")).click();
		driver.findElement(By.id("color")).click();
		driver.findElement(By.id("size")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("home")).click();
	
		//driver.close();
	}
	
	@Test(enabled=true, priority=2)
	public void image() {

		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
		//driver.close();

	}
	@Test(enabled=true , priority=3)
	public void link() throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		driver.findElement(By.id("home")).click();		
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		Thread.sleep(2000);
        driver.navigate().back();
        
      //  driver.close();

		
	}
	
	@Test(enabled=true, priority=4)
public void radioButton() throws InterruptedException{
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.findElement(By.id("yes")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("no")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]")).click();
        driver.navigate().to("http://www.leafground.com/home.html");
		Thread.sleep(2000);

	//	driver.close();		
		
	}
	
       @Test (enabled=true, priority=5)
        public void checkBox() throws Exception{
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).click();
		
		//driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://www.leafground.com/home.html");
		Thread.sleep(2000);

		//	driver.close();		
			
}
}


