package testNG_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertAssignment {
	
	WebDriver driver;
    @Test
	public void alert(){
    	
	System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	
	//check alert is present or not
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.alertIsPresent());
	String msg=driver.switchTo().alert().getText();
	System.out.println(msg);
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	driver.switchTo().alert().sendKeys("HCL Technologies");
	driver.switchTo().alert().accept();	
		
	}
	

}
