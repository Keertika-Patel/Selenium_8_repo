package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ClickOnAddToCartButton {
	public static  void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement addToCartButton = driver.findElement(By.xpath("//input[@value='Add to cart' and @type='button']"));
		Thread.sleep(3000); 
		addToCartButton.click();

		
		
	}

}
