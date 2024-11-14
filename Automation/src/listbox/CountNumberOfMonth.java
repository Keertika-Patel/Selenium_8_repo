package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountNumberOfMonth {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg/");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthSelect =new Select(monthDropdown);
		
		List<WebElement> allMonths = monthSelect.getOptions();
		System.out.println(allMonths.size());
		
		for(WebElement months:allMonths) {
			System.out.println(months.getText());
		}
	}

}
