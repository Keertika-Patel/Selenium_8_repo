package Assignment;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment52 {
@Test
public void userLogin() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://automationexercise.com");
	Assert.assertEquals(driver.getTitle(), "Automation Exercise","Home is displayed");
	Reporter.log("Home page is displayed");
	
	driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed(),"Login to your account is displayed" );
	Reporter.log("Login to your account is displayed");
	
	driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("keertikapatel77@gmail.com");
	driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("keerti2203");
	driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	Assert.assertTrue(driver.findElement(By.linkText(" Logged in as ")).isDisplayed()," Logged in as keertika is displayed" );
	Reporter.log("Logged in  as keertika  is displayed");
	
	driver.findElement(By.linkText(" Delete Account")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed(),"Account Deleted is displayed");
	}
}
