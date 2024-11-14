package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://demowebshop.tricentis.com/");
     String searchTagName = driver.findElement(By.xpath("//input[@value = 'Search']")).getTagName();            
     System.out.println(searchTagName);
	}

}
