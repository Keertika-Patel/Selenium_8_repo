package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D39_40_ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step1:create FileInputStream object
		FileInputStream fis = new FileInputStream("./testdata/TestScriptDatas.xlsx");

		// Step2:create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);

		// Step3:call read method
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println("URL: " + url);
		System.out.println("username: " + username);
		System.out.println("Password: " + password);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		int price = (int) workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);

		//boolean status = workbook.getSheet("sheet1").getRow(1).getCell().getBooleanCellValue();
		//System.out.println(status);

		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(4).getLocalDateTimeCellValue();
		System.out.println(date);

		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());

	}

}
