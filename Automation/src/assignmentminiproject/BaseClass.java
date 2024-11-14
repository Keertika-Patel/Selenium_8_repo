package assignmentminiproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClass {
	public static WebDriver sDriver;
	WebDriver driver;
	Properties prop;
	FileInputStream pFis;
	FileInputStream eFis;	
	WelcomePage wp;
	LoginPage lp;
	HomePage hp;
	Workbook workbook;

	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) throws IOException {
		//property file
				pFis = new FileInputStream("./testdata/commondata.properties");
				prop = new Properties();
				prop.load(pFis);
				
				eFis = new FileInputStream("./testdata/TestScriptDatas.xlsx");
				workbook = WorkbookFactory.create(eFis);
				
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		sDriver = driver;
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void login() {
		wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("abhis1234@gmail.com");
		lp.getPasswordTextField().sendKeys("abhis@1234");
		//lp.getEmailTextField().sendKeys(workbook.getSheet("demowebshop").getRow(1).getCell(1).getStringCellValue());
		//lp.getPasswordTextField().sendKeys(workbook.getSheet("demowebshop").getRow(1).getCell(2).getStringCellValue());
		lp.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() {		
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void closeBrowser() {		
		driver.quit();
	}
	
	
	
}
