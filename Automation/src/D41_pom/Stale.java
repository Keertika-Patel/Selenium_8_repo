package D41_pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		//WebElement searchTF = driver.findElement(By.id("navbar-search-input"));
		SkillRaryPage sp = new SkillRaryPage(driver);
		sp.getSearchTF().sendKeys("selenium",Keys.ENTER);
		sp.getSearchTF().sendKeys("testing",Keys.ENTER);
		sp.getSearchTF().sendKeys("Mobile");
	}

}
