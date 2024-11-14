package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
		String rating = "Very bad";
		//WebElement goodCheckbox = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		WebElement goodCheckbox = driver.findElement(By.xpath("//label[text()='"+rating+"')/..//input[@type='radio']"));
		Thread.sleep(2000);
		System.out.println("=====before clicking=====");
		System.out.println(goodCheckbox.isSelected());
		Thread.sleep(2000);

		goodCheckbox.click();
		System.out.println("=====after clicking=====");
		System.out.println(goodCheckbox.isSelected());

		driver.manage().window().minimize();
		driver.quit();
	}

}
