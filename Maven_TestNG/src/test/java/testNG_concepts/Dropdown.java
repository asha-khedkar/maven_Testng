package testNG_concepts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	WebDriver driver;

	@Test
	public void dropdown(){
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		Select drop1 = new Select(driver.findElement(By.id("dropdown1")));
		drop1.selectByVisibleText("Appium");
		
		Select drop2 = new Select(driver.findElement(By.name("dropdown2")));
		drop2.selectByValue("2");
		
		Select drop3 = new Select(driver.findElement(By.id("dropdown3")));
		drop3.selectByIndex(4);
		
		Select drop4 = new Select(driver.findElement(By.className("dropdown")));
        boolean msg=drop4.isMultiple();//False Or True
        System.out.println("Multiple is False or True  "+msg);
        
        WebElement element=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		
        Select drop5=new Select(element);
        
        System.out.println("Options From Drop5 Are :");
                 
        List<WebElement> options=drop5.getOptions();
        System.out.println("size="+options.size());
        for(int i=0;i<options.size();i++){
        	System.out.println(options.get(i).getText());            	      	
        }
        
        element.sendKeys("Appium");   
                               
        
        WebElement element1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		
        Select drop6=new Select(element1);
        
        System.out.println("Options From Drop5 Are :");
                 
        List<WebElement> options1=drop6.getOptions();
        System.out.println("size="+options1.size());
        for(int i=0;i<options1.size();i++){
        	System.out.println(options1.get(i).getText());            	      	
        }        
        
        drop6.selectByIndex(1);
        drop6.selectByIndex(3);
        drop6.selectByIndex(4);
        driver.close();
      }
	
	
	
	

}
