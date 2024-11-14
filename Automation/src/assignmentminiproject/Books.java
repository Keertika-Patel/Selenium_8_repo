package assignmentminiproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Books extends BaseClass {
	@Test
	public void clickOnBooks() {
		String expectedTitle = workbook.getSheet("Books").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Assert.assertEquals(expectedTitle, "Demo Web Shop. Books","Books page is displayed");
		Reporter.log("Books page is displayed",true);
		
		
	  }
}
