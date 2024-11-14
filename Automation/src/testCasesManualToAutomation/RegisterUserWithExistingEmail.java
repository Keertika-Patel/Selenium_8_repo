package testCasesManualToAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUserWithExistingEmail {

	public static void main(String[] args) {
		//Step1Launch the Browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//Step2:navigate to url
		driver.get("https://automationexercise.com/");
		
		//Step3:verify that home\page is visible successfully
		String homepageTittle = driver.getTitle();
		System.out.println("Tittle of the page: "+homepageTittle);
		
		if(homepageTittle.equals("Automation Exercise")) {
			System.out.println("Home page is visible successfully");
		}
		else {
			System.out.println("home page is not displayed");
		}
		
		//Step4:click on signup/login button
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		
		//Step5:. Verify 'New User Signup!' is visible
		driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed();
		
		//Step6:Enter name and already registered email address
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Keertika patel ");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("keertikapatel77@gmail.com");
		
		//Step7:. Click 'Signup' button
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		//Step8: Verify error 'Email Address already exist!' is visible
		driver.findElement(By.xpath("//p[text()='Email Address already exist!']")).isDisplayed();
		
	}

}
