package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSizePoositionOfWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		driver.manage().window().setSize(new Dimension(1400,800));
		

		Point position = driver.manage().window().getPosition();
		
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.manage().window().setPosition(new Point(500, 500));
		
		Thread.sleep(2000);
		   driver.navigate().back();
		   Thread.sleep(2000);
		   driver.navigate().forward();
		   Thread.sleep(2000);
		   driver.navigate().refresh();
		
		
	}
		
	}


