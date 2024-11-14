package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWebDriverMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  String tittle = driver.getTitle();
		  String url = driver.getCurrentUrl();
		  String sourceCode = driver.getPageSource();
		  
		  System.out.println(sourceCode);
		  System.out.println(tittle);
		  System.out.println(url);
		  
		  driver.close();
	}

}
