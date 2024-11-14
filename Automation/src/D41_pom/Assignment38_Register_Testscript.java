package D41_pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment38_Register_Testscript {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String url1 = prop.getProperty("url1");
		System.out.println(url1);
		
		FileInputStream fis1 = new FileInputStream("./testdata/TestScriptDatas.xlsx");
		Workbook workbook = WorkbookFactory.create(fis1);
		 String firstName = workbook.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
		 String lastName = workbook.getSheet("Register").getRow(1).getCell(1).getStringCellValue();
		 String email = workbook.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
		 String password = workbook.getSheet("Register").getRow(1).getCell(3).getStringCellValue();
		 String confirmPassword = workbook.getSheet("Register").getRow(1).getCell(4).getStringCellValue();
		 
		   
		   System.out.println(firstName);
		   System.out.println(lastName);
		   System.out.println(email);
			System.out.println(password);
			System.out.println(confirmPassword);
			
			
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get(url1);
		 WelcomePage_RegisterLink wp = new WelcomePage_RegisterLink(driver);
		 wp.getRegisterLink().click();
		 
		 RegisterPage rp = new RegisterPage(driver);
		 rp.getMaleRadioButton().click();
		 rp.getFirstNameTextField().sendKeys(firstName);
		 rp.getLastNameTextField().sendKeys(lastName);
		 rp.getEmailTextField().sendKeys(email);
		 rp.getPasswordTextField().sendKeys(password);
		 rp.getConfirmPasswordTextField().sendKeys(confirmPassword);
		 rp.getRegisterButton().click();
		 }

	}


