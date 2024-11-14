package mockquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCaptureToolTip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		 // Find the search text field element
        WebElement searchField = driver.findElement(By.name("q"));

        // Get/capture the tooltip text using the "title" attribute
        String tooltipText = searchField.getAttribute("tittle");

        // Print the tooltip text
        System.out.println("Tooltip text of the search field: " + tooltipText);
	}

}
