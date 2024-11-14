package testCasesManualToAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUser {

	public static void main(String[] args) {
		//step1:launch Browser 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//step 2:navigate to url
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
		
		//Step4:click on "signup/login"button
		driver.findElement(By.xpath(" //a[text()=' Signup / Login']")).click();
		
		//Step5:verify 'new User signup!' is visible 
	boolean newUserSignup = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed();
		System.out.println("New user Signup is displayed: "+newUserSignup);
		
		//Step6:enter name and email address
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Keertika patel");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("keertikapatel07@gmail.com");
		
		//Step7:click on 'signup' button 
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
		//Step8:verify that enter Account information is visble 
		
		
		//Step9:Fill details Tittle,Name,Email,Password,date of birth
		 driver.findElement(By.id("id_gender2")).click();//Gender
		driver.findElement(By.id("password")).sendKeys("keerti2203");//password
		
		WebElement dayDropdown = driver.findElement(By.id("days"));//day or date
		Select daySelect = new Select(dayDropdown);
		daySelect.selectByValue("3");
		
		WebElement monthDropdown = driver.findElement(By.id("months"));//selecting montb
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText("July");
		
		WebElement yearDropdown = driver.findElement(By.id("years"));//selecting montb
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText("1999");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");  // Scrolls down by 500 pixels

		//Step10:Select checkBox 'signup for our newsletter!'
		driver.findElement(By.id("newsletter")).click();
		
		//Step11:Select checkbox 'Receive special offers from our partners!'
		driver.findElement(By.id("optin")).click();
		
		//Step12:fill the details : first name,last name ,Company, address1, address2,country,state,city,zipcode,mobile number
		driver.findElement(By.id("first_name")).sendKeys("Keertika");
		driver.findElement(By.id("last_name")).sendKeys("Patel");
		driver.findElement(By.id("company")).sendKeys("TestYantra");
		driver.findElement(By.id("address1")).sendKeys("s1 pearl of paradise,Roopena agrahara");
		driver.findElement(By.id("address2")).sendKeys("vindhya colony");
		
		WebElement countryDropdown = driver.findElement(By.id("country"));
		Select countrySelect= new Select(countryDropdown);
		countrySelect.selectByVisibleText("India");
		
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("city")).sendKeys("Bengaluru");
		driver.findElement(By.id("zipcode")).sendKeys("560068");
		driver.findElement(By.id("mobile_number")).sendKeys("9131424667");
		
		
		//Step13:Click on 'create Account' button
		js.executeScript("window.scrollBy(0, 300);");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		
		//Step14:verify that account created page is visble  or not 
		String accountCreatedUrl = driver.getCurrentUrl();
		System.out.println(accountCreatedUrl);
		if (accountCreatedUrl.equals("https://automationexercise.com/account_created")) {
			System.out.println("Account created  successfully message displayed.");
		}
		else {
			System.out.println("Account created successfully message didn't got. ");
		}
		
		//step15:click'Continue'button
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		//Step16:verify that 'logged in as username' is visible 
		boolean loggedAsUsername = driver.findElement(By.xpath("//b[text()= 'Keertika patel' ]")).isDisplayed();
		System.out.println("Logged in as Username is diplayed: "+loggedAsUsername);
		
		//Step17:click 'Delete Account' button 
		driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
		
		//Step18:verify that 'Account Deleted' is visible and click on continue
		boolean accountDeleted = driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed();
		System.out.println("Account is deleted: "+accountDeleted);
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		driver.close();
	}
	

}
