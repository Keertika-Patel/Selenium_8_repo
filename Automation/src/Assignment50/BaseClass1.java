package Assignment50;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	WebDriver driver;
	Properties prop ;
	Workbook workbook;
@BeforeTest
public void objectCreation() throws IOException {
	//property file
	FileInputStream pfis = new FileInputStream("./testdata/commondata.properties");
	 prop = new Properties();
	 prop.load(pfis);
	 
	 //excel file 
	FileInputStream efis = new FileInputStream("./testdata/TestScriptDatas.xlsx");
	workbook  = WorkbookFactory.create(efis);
	 }
	@BeforeClass
public void launchBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	String url1 = prop.getProperty("url1");
	driver.get(url1);
}
@BeforeMethod
public void login() throws InterruptedException {
driver.findElement(By.linkText("LOGIN")).click();
driver.findElement(By.id("email")).sendKeys(prop.getProperty("email1"));
driver.findElement(By.id("password")).sendKeys(prop.getProperty("password1"));
driver.findElement(By.id("last")).click();
	Thread.sleep(2000);
}
@AfterClass
public void logout() {
driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();

driver.findElement(By.xpath("//a[text()='Sign out']")).click();
}
@AfterMethod
public void closeBrowser() {
	driver.quit();
}
}
