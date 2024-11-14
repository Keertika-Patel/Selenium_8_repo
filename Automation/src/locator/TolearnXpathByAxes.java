package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnXpathByAxes {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/wakan/Desktop/technoelevate/table.html");
	String imdb = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[2]")).getText();
	
	System.out.println(imdb);
	
	driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable?scenario=1");
	WebElement delete = driver.findElement(By.xpath("//button[text()='Levi's Shirt']/following-sibling::button[5]"));
	((WebElement) driver).click();
	
}
}
