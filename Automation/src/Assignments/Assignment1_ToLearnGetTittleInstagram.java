package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_ToLearnGetTittleInstagram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.instagram.com/");
		 
		String welcomePage = driver.getTitle();
		 System.out.println("Welcome page Tittle: "+welcomePage);
		 
		 if(welcomePage.equals("Instagram")) {
			 System.out.println("welcome page is displayed");
		 }else {
			 System.out.println("welcome is not displayed");
		 }
			 
		 
		
	}

}
