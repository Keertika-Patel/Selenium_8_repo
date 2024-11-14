package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment30ConfirmPopup {

	public static void main(String[] args) throws InterruptedException {
		// Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Go to the URL
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

        // Step 2: Switch to the iframe that contains the "Try it" button
        WebElement iframe = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iframe);

        // Step 3: Click the "Try it" button
        WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryItButton.click();

        // Step 4: Handle the alert popup
        Alert alert = driver.switchTo().alert();

        // Print the alert message
        String alertMessage = alert.getText();
        System.out.println("Alert message: " + alertMessage);
        
        Thread.sleep(2000);
        
     // Step 5: Click the OK button on the alert
        alert.accept();

        // Step 6: Switch back to the default content
        driver.switchTo().defaultContent();

	}

}
