package listerners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListernerImplementation.class)
public class TestScript extends BaseClass {
	@Test
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("keertikapatel5155@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sdfsdfsd");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is not displayed");
		Reporter.log("Home page is not displayed");
	}

}


