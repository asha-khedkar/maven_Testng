package testNG_concepts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class AlertPopupHandling {

	WebDriver driver;

	@Test
	public void alert() {

		System.setProperty("Webdriver.chrome.driver", "E:\\Selenium 21\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");

		FluentWait fluent = new FluentWait(driver);
		fluent.withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.alertIsPresent());
		driver.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();
		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[@onclick=\"confirmPrompt()\"]")).click();
		driver.switchTo().alert().sendKeys("This is Alert");
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@onclick=\"lineBreaks()\"]")).click();
		String msg1 = driver.switchTo().alert().getText();
		System.out.println(msg1);
		driver.switchTo().alert().accept();
		driver.close();

	}

}
