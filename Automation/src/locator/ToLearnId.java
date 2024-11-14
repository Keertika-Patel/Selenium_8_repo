package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("FirstName")).sendKeys("keertika");//"sendKeys" is a method of WebElement interface
		      //id(String) is used to identify the element by using "id" attribute present in html document
		
	}
}