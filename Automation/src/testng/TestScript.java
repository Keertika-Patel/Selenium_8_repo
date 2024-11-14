package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
@Test
public void clickOnBooks() {
	String expectedTittle = workbook.getSheet("Books").getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.partialLinkText("BOOKS")).click();
	if(driver.getTitle().equals(expectedTittle)) {
		Reporter.log("Books page is displayed",true);
	}else {
		Reporter.log("Books page is not displayed,",true);
	}
	
  }

}
