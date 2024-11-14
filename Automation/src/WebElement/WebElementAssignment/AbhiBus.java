package WebElement.WebElementAssignment;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args, WebDriver[] bigBusWebElements1) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		
		//select hyderabad tp bangalore 
		driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
		Thread.sleep(5000);
		
		//click on Bus partner dropdown
		driver.findElement(By.xpath("//div[]text()='Bus Partner']")).click();
		Thread.sleep(5000);
		
		//click on Big Bus checkbox
		driver.findElement(By.xpath("//label[text()='Big Bus']/..//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		
		List<WebElement> bigBusWebElements = driver.findElements(By.xpath("//div[@id='travel-distance-container']/../../../../..//strong[contains(@class,'fare')]\"))"));
		
		System.out.println("count of Big Buses"+bigBusWebElements.size());
		TreeSet<Integer> priceSet = new TreeSet<Integer>();
		
		
		for(WebDriver bigBusRecord : bigBusWebElements1) {
			priceSet.add(Integer.parseInt(((WebElement) bigBusRecord).getText().replace(",","")));
		}
		
		System.out.println(priceSet);
		if(priceSet.iterator().hasNext()) {
			System.out.println("lowest price is"+priceSet.iterator().next());
		}
	

	}
}


