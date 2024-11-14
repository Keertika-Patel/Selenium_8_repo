package assignmentminiproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Computers extends BaseClass {
	@Test
	public void clickOnComputers() {
		String expectedTittle = workbook.getSheet("Computers").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		Assert.assertEquals(expectedTittle, "demo Web shop ","Computers page is not displayed");
		Reporter.log("Computers page is not displayed",true);
		
	  }
}
