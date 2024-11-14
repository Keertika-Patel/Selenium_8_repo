package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
@Test
public void login() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Welcome page  is displayed ");
	Reporter.log("Welcome page is displayed");
	
	driver.findElement(By.linkText("Log in")).click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","Login page is displayed");
	Reporter.log("Login page is displayed");
	
	driver.findElement(By.id("Email")).sendKeys("keertikapatel5155@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("keerti1234");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is displayed");
	Reporter.log("Home page is displayed");
	
	driver.quit();
}

}
