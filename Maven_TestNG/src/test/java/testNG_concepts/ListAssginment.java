package testNG_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ListAssginment {
	WebDriver driver;
	@Test
	public void selectableList() throws InterruptedException{
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Selectable.html");
		
		driver.findElement(By.linkText("Serialize")).click();
		
        List<WebElement> element=driver.findElements(By.xpath("//ul[@class=\"SerializeFunc\"]/li"));
        System.out.println(element.size());
        Actions act=new Actions(driver);
        act.keyDown(Keys.CONTROL).click(element.get(1))
        .click(element.get(3)).click(element.get(5)).build().perform();
        driver.close();
	}
	
	@Test
	public void unorderedList() throws InterruptedException{
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://demo.automationtesting.in/AutoComplete.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("searchbox")).sendKeys("I");
        Thread.sleep(5000);
        List<WebElement> element=driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li"));

        for (WebElement el:element) {
        	System.out.println(el.getSize());

        	if(el.getText().equalsIgnoreCase("India")) {
        	el.click();
        	break;
         }
        	
        }
		((JavascriptExecutor)driver).executeScript("scroll(500,0)");
   //  driver.close();
	
	}
	
	
}
