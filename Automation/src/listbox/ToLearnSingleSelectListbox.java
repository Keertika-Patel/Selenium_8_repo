package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelectListbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg/");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropdown);
	    //monthSelect.selectByIndex(11);
		//monthSelect.selectByValue("8");
		monthSelect.selectByVisibleText("Aug");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropdown);
		//yearSelect.selectByIndex(1);
		//yearSelect.selectByValue("2022");
		yearSelect.selectByVisibleText("2021");
	}

}
