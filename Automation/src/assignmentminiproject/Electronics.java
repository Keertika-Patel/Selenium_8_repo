package assignmentminiproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Electronics extends BaseClass{
	@Test
	public void clickOnElectronic() {
		String expectedTittle = workbook.getSheet("Electronics").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		Assert.assertEquals(expectedTittle, "demo Web shop ","Electronics page is not displayed");
		Reporter.log("Electronic  page is not displayed",true);
	}
	
	
}
