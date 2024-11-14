package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Amazon")) {
			System.out.println("Welcome page is displayed");
		}
		else {
			System.out.println("Welcome page is not displayed");
		}
	}

}
