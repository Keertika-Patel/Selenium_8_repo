package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetDiseaseForecasteAssignment27 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		driver.get("https://petdiseasealerts.org/");
		driver.findElement(By.linkText("Go to maps")).click();
		
	WebElement mapIFrame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));	
		driver.switchTo().frame(mapIFrame);//switching to embebed webpage by using name 
		  driver.findElement(By.id("montana")).click();
		  
		  driver.switchTo().defaultContent();
		  driver.findElement(By.linkText("SIGN UP")).click();
		  
		  driver.findElement(By.xpath("//input[@id = 'user']")).sendKeys("keertika@gmail.com");
		  driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("keertika1234");
		  driver.findElement(By.xpath("//input[@id= 'cpass']")).sendKeys("keertika1234");
		  driver.findElement(By.xpath("//input[@id= 'firstName']")).sendKeys("keertika");
		  driver.findElement(By.xpath("//input[@id= 'lastName']")).sendKeys("patel");
		  driver.findElement(By.xpath("//input[@id= 'phone']")).sendKeys("9131424667");
		  
		WebElement userTypeDropdown = driver.findElement(By.xpath("//select[@id= 'user-type']"));
		  Select userTypeSelect = new Select(userTypeDropdown);
		  userTypeSelect.selectByVisibleText("Academic");
		  
		  driver.findElement(By.xpath("//input[@id='accept-tou']")).click();
		  
		   WebElement signButton = driver.findElement(By.xpath("//button[@type='submit']"));
		   wait.until(ExpectedConditions.elementToBeClickable(signButton ));
		   signButton.click();
		   
		   WebElement successmessage = driver.findElement(By.xpath("//b[text()='Thank you for registering!']"));
		   System.out.println(successmessage.getText());
		  
		  
		  
		  
		 
		
		
	}

}
