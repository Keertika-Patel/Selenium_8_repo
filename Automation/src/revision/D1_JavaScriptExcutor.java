package revision;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class D1_JavaScriptExcutor {
public static void main(String[]args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	 WebElement twitterLink = driver.findElement(By.linkText("Twitter"));
	 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,500)");//scroll from position of the scroll bar
	//Thread.sleep(2000);
	//js.executeScript("window.scrollBy(0,300)");	
	//Thread.sleep(3000);
	//js.executeScript("window.scrollTo(0,500)");//scroll from starting position of the scroll bar 
	//Thread.sleep(2000);
	//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scrollupto bottom othe webpage 
	//js.executeScript("history.go");
	js.executeScript("arguments[0].scrollIntoView(true)", twitterLink);
	twitterLink.click();
	
	Set<String> allWindowId = driver.getWindowHandles();
	for(String allIds:allWindowId) {
		driver.switchTo().window(allIds);
		Reporter.log(allIds,true);
		String tittle = driver.getTitle();
		Reporter.log(tittle,true);
		}
    }
}