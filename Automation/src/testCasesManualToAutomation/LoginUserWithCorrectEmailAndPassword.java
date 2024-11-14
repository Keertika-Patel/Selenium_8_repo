package testCasesManualToAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUserWithCorrectEmailAndPassword {

	public static void main(String[] args) {
   //Step1:Launch Browser 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	//Step2:navigate to url 
	driver.get("https://automationexercise.com/");
	
	//Step3:verify that homepage is visible successfully
           String homePageTittle = driver.getTitle();
          System.out.println(homePageTittle);
			
		//	if (homePageTittle.equals("Automation Exercise")) {
			//	System.out.println("home page is displayed successfully");
			//}
		//	else {
			//	System.out.println("home page is not displayed ");
			//}
	//Step4:click on 'Sign/Login' button.
	driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	
	//Step5:Verify 'login to your account' is visible
boolean loginToYourAccount = driver.findElement(By.xpath(" //h2[text()='Login to your account']")).isDisplayed();
	    System.out.println("Login to your account is displayed: "+loginToYourAccount);
	    
	 //Step6:enter correct email address and password 
	    driver.findElement(By.xpath(" //input[@data-qa='login-email']")).sendKeys("keertikapatel515@gmail.com");
	    driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("keerti2203");
	    
	    //Step7:click'login' button
	    driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	    
	    //Step8:verify that 'logged in as username' is visible
	    driver.findElement(By.xpath("//a[text()=' Logged in as ']")).isDisplayed();
	    
	    //step9:click Delete Account button
	    driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
	    
	    //Step10:verify that account Deleted is visible
	    driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed();
	    
	    driver.close();
	}
	
}
