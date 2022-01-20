package testNG_concepts;

import java.io.BufferedWriter
;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookiesHandling {
	WebDriver driver;

	@Test
	public void login() {
		System.setProperty("Webdriver.chrome.driver", "E:\\Selenium 21\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().getCookieNamed("skin");
		//Delete all cookies
	    driver.manage().deleteAllCookies();
				
		File f2 = new File("A:\\cookies.data");
		try {
			f2.createNewFile();
			FileWriter fw = new FileWriter(f2);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Cookie ck : driver.manage().getCookies()) {
				bw.write(ck.getName() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getValue() + ";"
						+ ck.isSecure() + ";" + ck.getExpiry());
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println(e);

		}
		// get single cookie
		System.out.println(driver.manage().getCookieNamed("skin"));
		
		// Add Cookie
		Cookie ck1 = new Cookie("new Cookie", "87843998942");
		driver.manage().addCookie(ck1);
		Cookie ck2 = new Cookie("new Cookie2", "56321346548");
		driver.manage().addCookie(ck2);
	  
		//delete single cookie by name
		driver.manage().deleteCookieNamed("new Cookie2");

		// delete cookie by object
		driver.manage().deleteCookie(ck1);
		
		
	}
}
