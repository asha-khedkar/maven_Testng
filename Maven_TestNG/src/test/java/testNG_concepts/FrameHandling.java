package testNG_concepts;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FrameHandling {
	WebDriver driver;

	@Test
	public void singleFrame() throws InterruptedException{
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

		driver.findElement(By.linkText("SwitchTo")).click();		
		driver.findElement(By.linkText("Frames")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("SingleFrame")));
		WebElement element=driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(element);          
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HCL Technologies");
		driver.switchTo().defaultContent();
        driver.close();
	}
	
	@Test
	public void iFrame() throws Throwable {
	
	System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
	driver=new ChromeDriver();

	driver.get("http://demo.automationtesting.in/Frames.html");
    driver.manage().window().maximize();

	
	driver.findElement(By.linkText("SwitchTo")).click();		
	driver.findElement(By.linkText("Frames")).click();
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	//Thread.sleep(5000);
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("//*[@id=\"Multiple\"]/iframe")));
	
	WebElement element=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	driver.switchTo().frame(element);          

	WebElement element1=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
	driver.switchTo().frame(element1);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HCL Technologies");
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	driver.close();
		
	}
	
	
}
