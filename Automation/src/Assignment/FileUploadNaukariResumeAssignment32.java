package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadNaukariResumeAssignment32 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAjwx4O4BhAnEiwA42SbVEBX4KTFbV4Y9fok68_pwa25OSp8tbzbYOryo0SjAX3ME2EHFgDQAxoCG0MQAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//div[@class='textWrap']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\wakan\\Desktop\\Application Form.pdf");
	}

}
