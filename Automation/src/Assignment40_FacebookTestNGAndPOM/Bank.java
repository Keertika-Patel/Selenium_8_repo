package Assignment40_FacebookTestNGAndPOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bank {
@Test
public void createAccount() throws IOException  {
	FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
	
	Properties prop = new Properties();
	prop.load(fis);
	String url2 = prop.getProperty("url2");
	Reporter.log(url2, true);
	
	FileInputStream fis1 = new FileInputStream("./testdata/TestScriptDatas.xlsx");
	Workbook workbook = WorkbookFactory.create(fis1);
	String firstName = workbook.getSheet("Facebook_CreateAccount").getRow(1).getCell(0).getStringCellValue();
	String lastName = workbook.getSheet("Facebook_CreateAccount").getRow(1).getCell(1).getStringCellValue();
	String email = workbook.getSheet("Facebook_CreateAccount").getRow(1).getCell(2).getStringCellValue();
	String password = workbook.getSheet("Facebook_CreateAccount").getRow(1).getCell(3).getStringCellValue();

    Reporter.log(firstName, true);
	Reporter.log(lastName, true);
	Reporter.log(email, true);
	Reporter.log(password, true);
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(url2);
	WelcomePage_Facebook wcF = new WelcomePage_Facebook(driver);
	wcF.getCreateAccountButton().click();
	
	createAccountPage caPage = new createAccountPage(driver);
	caPage.getFirstNameFT().sendKeys(firstName);
	caPage.getLastNameFT().sendKeys(lastName);
	
	Select daySelect = new Select(caPage.getDayDropdown());
	daySelect.selectByVisibleText("7");
	
	Select monthSelect = new Select(caPage.getMonthDropdown());
	monthSelect.selectByVisibleText("May");
	
	Select yearSelect = new Select(caPage.getYearDropdown());
	yearSelect.selectByVisibleText("2000");
	
	caPage.getFemaleRadioButton().click();
	caPage.getEmailTF().sendKeys(email);
	caPage.getPasswordTF().sendKeys(password);
	caPage.getSubmitButton().click();
	
	
	
}
}
