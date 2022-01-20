package testNG_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumBasicCommands {
	
	
	WebDriver driver;

	@Test(priority=1)
	public void basicCommands(){
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");

	    String table_value =driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[4]")).getText();	
		System.out.println(table_value);
	
		System.out.println("Title of the page: " + driver.getTitle());
		System.out.println("Current Url is:  "+driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("http://www.leafground.com/");
		
        driver.manage().window().maximize();
        Dimension dim=new Dimension(500,600);
        driver.manage().window().setSize(dim);
		driver.close();

	}
	
	@Test(priority=2)	
	public void actionsOperations(){
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
				
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Edit")).click();
		Actions act1= new Actions(driver);
		
		WebElement element1=driver.findElement(By.id("email"));
		act1.sendKeys(element1,"Abc@gmail.com").doubleClick().contextClick().build().perform();
		
		driver.close();
		
		
	}
	
		

}
