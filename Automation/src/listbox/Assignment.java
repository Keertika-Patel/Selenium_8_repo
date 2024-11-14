package listbox;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		 WebElement registerNowLink = driver.findElement(By.id("reg_new_btn"));
		 registerNowLink.click();
		 
		 WebElement currentCityDropdown = driver.findElement(By.id("currentCity"));
		 Select currentCitySelect = new Select(currentCityDropdown);
		 currentCitySelect.selectByVisibleText(" Bangalore ");
		 
		 WebElement highestQualificationDetailsDropdown = driver.findElement(By.id("course"));
		  Select highestQualificationDetailsSelect = new Select(highestQualificationDetailsDropdown);
		 highestQualificationDetailsSelect.selectByVisibleText("BE/B.Tech");
		 
		 
		//After filling current city and highest qualification capturing screenshot of webpage
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./screenshots/freshersworldRegisterWebpage.png");
		 	FileHandler.copy(temp, dest);
	}

	
}
