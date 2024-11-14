package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationMessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		
		Alert confirmPopUp = driver.switchTo().alert();
		
		System.out.println(confirmPopUp.getText());
		Thread.sleep(2000);
		confirmPopUp.accept();
		
		Thread.sleep(2000);
		System.out.println(confirmPopUp.getText());
		confirmPopUp.accept();
		
	}

}
