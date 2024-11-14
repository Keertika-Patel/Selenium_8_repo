package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment53_ToLearnDataProvider_Register {
@Test(dataProviderClass = DataStorage.class,dataProvider ="registerData")
public void register(String[] cred) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/login.php?type=register");
	driver.findElement(By.name("firstname")).sendKeys(cred[0]);
	driver.findElement(By.name("lastname")).sendKeys(cred[1]);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(cred[2]);
	driver.findElement(By.xpath("//input[@name='lastname']/../following-sibling::div/input[@type='password']")).sendKeys(cred[3]);
	driver.findElement(By.name("repassword")).sendKeys(cred[4]);
	
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Thank you for Registering.']")).isDisplayed(), "'Thank you  for Registering' message is displayed");
	Reporter.log("'Thank you  for Registering' message is displayed");
}
}
