package assignmentminiproject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GiftCards extends BaseClass {
	@Test
	public void clickOnGift() {
		String expectedTittle = workbook.getSheet("Gift Cards").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.partialLinkText("GIFT CARDS")).click();
		Assert.assertEquals(expectedTittle, "Demo Web Shop. Gift Cards","Gift Cards page is displayed");
		Reporter.log("Gift Cards  page is displayed",true);
	}
}
