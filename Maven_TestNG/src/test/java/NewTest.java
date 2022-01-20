import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;




public class NewTest {
	
	public WebDriver driver= new ChromeDriver();
	
	
	@BeforeSuite
	  public void beforeSuite() {
		 
			/*
			 * System.setProperty(
			 * "Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe"); driver=new
			 * ChromeDriver();
			 */
	  }
	
	 @BeforeTest
	  public void beforeTest() {
		  driver.manage().window().maximize();
	  }

	 @BeforeClass
	  public void beforeClass() {
		  driver.get("https://www.TestLeaf.com/");
	  }
	 
  @Test(priority=2)
  public void login() {
	  driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();

  }
  @Test
  public void b() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterClass
  public void afterClass() {
  }

 
  @AfterTest
  public void afterTest() {
  }

  

  @AfterSuite
  public void afterSuite() {
  }

}
