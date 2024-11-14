package testCasesManualToAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUserWithIncorrectEmailAndPwd {

	public static void main(String[] args) {
		//Step1:Launch browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//Step2:navuigate to url 
		driver.get("https://automationexercise.com/");
		
		//Step3:verify that home page is visible successfully 
				String homePageTittle = driver.getTitle();
				System.out.println(homePageTittle);
				
				if (homePageTittle.equals("Automation Exercise")) {
					System.out.println("home page is displayed successfully");
				}
				else {
					System.out.println("home page is not displayed ");
				}
				
	//Step4:Click  on Signup/Login button 
	driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	
	//Step5:verify 'login to your account'is visible 
	driver.findElement(By.xpath(" //h2[text()='Login to your account']")).isDisplayed();
	
	//Step6:Enter incorrect email address and password 
	driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("keertikapatel66@gmail.com");
	driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("keerti2203");
	
	//Step7:Click 'login'button
     driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
     
    //Step8:verify error 'your email or password is incorrect is visible 
     boolean errorMessage = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).isDisplayed();
     
     
	}

}
