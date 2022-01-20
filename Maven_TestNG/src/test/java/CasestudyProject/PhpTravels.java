package CasestudyProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PhpTravels {
	
	WebDriver driver;
	
	
	@Test(enabled=false)
	public void readAllElements() {
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		List<WebElement> elements=driver.findElements(By.xpath("//*"));
		System.out.println(Integer.toString(elements.size()));
		
		for(WebElement el:elements) {
			System.out.println(el.getTagName() + ":" + el.getText());
		}
	}

	@Test(enabled=false)
	public void registration() throws Throwable{
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		String w1=driver.getTitle();

		//click on login Button
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		
		//move to the Tabbed window
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
		
		
		//click on register page
		driver.findElement(By.linkText("Register")).click();		
		
		//Enter registration page details
		driver.findElement(By.id("inputFirstName")).sendKeys("Asha");
		driver.findElement(By.id("inputLastName")).sendKeys("khedkar");
		driver.findElement(By.id("inputEmail")).sendKeys("khedkarasha18@gmail.com");
		driver.findElement(By.id("inputPhone")).sendKeys("9561601992");
		driver.findElement(By.id("inputCompanyName")).sendKeys("HCL");
		driver.findElement(By.id("inputAddress1")).sendKeys("Magarpatta sez Entrance");
		driver.findElement(By.id("inputAddress2")).sendKeys("Magarpatta City");
		driver.findElement(By.id("inputCity")).sendKeys("Pune");
		driver.findElement(By.id("stateinput")).sendKeys("Maharashtra");
		driver.findElement(By.id("inputPostcode")).sendKeys("411028");
		driver.findElement(By.id("inputCountry")).sendKeys("India");
		driver.findElement(By.id("customfield2")).sendKeys("93091364");
		driver.findElement(By.id("inputNewPassword1")).sendKeys("Asha@123");
		driver.findElement(By.id("inputNewPassword2")).sendKeys("Asha@123");
		
		//driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

		driver.findElement(By.xpath("//span[@class=\"switch__container\"]")).click();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,700)");
		//click on I am not Robot manually
        Thread.sleep(10000);

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
	}
	
	@Test
	public void login() throws Throwable{
		
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		//String w1=driver.getTitle();

		//click on login Button
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		
		
		//move to the Tabbed login window
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> iter=windows.iterator();
		String window1=iter.next();
		String window2=iter.next();
        driver.switchTo().window(window2);
		String w2=driver.getTitle();
        driver.findElement(By.id("inputEmail")).sendKeys("khedkarasha18@gmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Asha@123");
	
        driver.findElement(By.xpath("//ins[@class=\"iCheck-helper\"]")).click();
        Thread.sleep(20000);        
        
        driver.findElement(By.id("login")).click();
        
	}
}
