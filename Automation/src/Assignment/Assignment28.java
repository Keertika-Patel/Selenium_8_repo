package Assignment;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment28 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);
		
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(image1, trash).perform();
		act.dragAndDrop(image2, trash).perform();
		
		
		//click on ckeatsheets
		driver.switchTo().defaultContent();
		WebElement cheatsheet = driver.findElement(By.xpath("//a[text()='CheatSheets']"));
		cheatsheet.click();
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds.size()); 
		
		for(String i :allIds) {
			driver.switchTo().window(i);
			String currentURL = driver.getCurrentUrl();
			
			if(currentURL.contains("sql-cheat-sheet")) {
				act.scrollByAmount(0,950).perform();
			}
		}
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/SQLjoinsImage.png");
	FileHandler.copy(temp, dest);
		

	}

}
