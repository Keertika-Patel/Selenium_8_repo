package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com/");
            
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));
            System.out.println(allLinks.size());
	}

}
