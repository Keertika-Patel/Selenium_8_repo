package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class AssignmentOnExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		//click operation on 1-inch laptop "add to cart" button 
		 WebElement addToCartButton = driver.findElement(By.xpath("(//input[@value='Add to cart' and @type = 'button'])[2]"));
		 addToCartButton.click();
		 
		 //locate the success message 
		 WebElement successMessage = driver.findElement(By.id("bar-notification"));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement successMessage1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bar-notification")));

		 //capture and print the success message of add to cart 
		String messageText = successMessage1.getText();		 
		System.out.println("Success Message: "+ messageText); 
		 
		//capture the color of add to cart success message 
		String successMessageBackgroundColor = successMessage1.getCssValue("background-color");
		System.out.println("Success message background color: "+successMessageBackgroundColor );
		
		 Boolean isMessageInvisible = wait.until(ExpectedConditions.invisibilityOf(successMessage1));
				 
		 // After the message disappears, click on the "Log in" link
	        if (isMessageInvisible) {
	            WebElement loginLink= driver.findElement(By.linkText("Log in"));
	            loginLink.click();

	}

} 
}