package actionsClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentDoubleClick {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		
		WebElement doubleClickLink = driver.findElement(By.xpath("//a[text()='Double Click']"));
		doubleClickLink.click();
		
		WebElement yesOptionDoubleClick = driver.findElement(By.id("btn20"));
		Actions act = new Actions(driver);
		act.doubleClick(yesOptionDoubleClick).perform();
		act.doubleClick(yesOptionDoubleClick).perform();
		
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/doubleClick.png");
		FileHandler.copy(temp, dest);

		
		

	}

}
