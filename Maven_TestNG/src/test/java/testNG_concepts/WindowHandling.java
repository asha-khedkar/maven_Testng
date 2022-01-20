package testNG_concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	
	
		WebDriver driver;

		@Test
		public void tabbedWindow() throws InterruptedException{
			
			System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.get("http://demo.automationtesting.in/Windows.html");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.linkText("SwitchTo")).click();		
			driver.findElement(By.linkText("Windows")).click();
			
			String w1=driver.getTitle();
			driver.findElement(By.xpath("//a[@class=\"analystic\"]")).click();
			driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();

			Set<String> windows=driver.getWindowHandles();
			
			Iterator<String> iter=windows.iterator();
			String window1=iter.next();
			String window2=iter.next();
            driver.switchTo().window(window2);
			String w2=driver.getTitle();

			//Get the Title of window
			System.out.println(w1);
			System.out.println(w2);	        
	     		
			//get the session ID of window
			System.out.println(window1);
			System.out.println(window2);
	        
	        driver.close();
	        	             
	        
		}
		
		@Test
        public void seperateWindow() throws InterruptedException{
			
			System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.get("http://demo.automationtesting.in/Windows.html");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.linkText("SwitchTo")).click();		
			driver.findElement(By.linkText("Windows")).click();
			
			String w1=driver.getTitle();

			driver.findElement(By.linkText("Open New Seperate Windows")).click();
			driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
			
            Set<String> windows=driver.getWindowHandles();
			
			Iterator<String> iter=windows.iterator();
			String window1=iter.next();
			String window2=iter.next();
			
            driver.switchTo().window(window2);
			String w2=driver.getTitle();

			//Get the Title of window
			System.out.println(w1);
			System.out.println(w2);	        
	     		
			//get the session ID of window
			System.out.println(window1);
			System.out.println(window2);
	        
	        driver.close();			
			
 }
		

	
}