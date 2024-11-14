package Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_ToLearnGetTittleMakeMyTrip {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.makemytrip.com/");
	
	String homePageTittle = driver.getTitle();
	System.out.println(homePageTittle);
	if(homePageTittle.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday")) {
		System.out.println("Home Page is dispalyed");
	}else {
		System.out.println("Home page is not displayed");
	}
	driver.quit();
	
	}

}
