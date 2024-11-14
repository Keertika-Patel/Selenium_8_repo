package Assignment50;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass1 {
@Test
public void clickOnSales() {
	String expectedUrl = workbook.getSheet("Sales").getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.linkText("Sales")).click();
	if(driver.getTitle().equals("expectedUrl")) {
		Reporter.log("Sales page is displayed successfully");
	}else {
		Reporter.log("Sales page is not dispalyed ");
	}
}
}
