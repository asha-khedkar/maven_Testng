package testNG_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
	
	
	WebDriver driver;

	@Test
	public void dragDrop(){
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		WebElement element1 =driver.findElement(By.id("draggable"));

		Actions act1=new Actions(driver);
		act1.dragAndDropBy(element1,150,150).build().perform();
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		Actions act2=new Actions(driver);

		WebElement element2 =driver.findElement(By.id("draggable"));
		WebElement element3 =driver.findElement(By.id("droppable"));

		act2.dragAndDrop(element2,element3).build().perform();


	}

}
