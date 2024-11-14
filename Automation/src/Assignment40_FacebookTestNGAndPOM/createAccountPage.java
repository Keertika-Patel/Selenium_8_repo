package Assignment40_FacebookTestNGAndPOM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createAccountPage {
@FindBy(name = "firstname")
private WebElement firstNameFT;

@FindBy(name = "lastname")
private WebElement lastNameFT;

@FindBy(id = "day")
private WebElement  dayDropdown;

@FindBy(id = "month")
private WebElement monthDropdown;

@FindBy(id = "year")
private WebElement yearDropdown;

@FindBy(xpath = "//input[@value='1']")
private WebElement femaleRadioButton;

@FindBy(name = "reg_email__")
private WebElement emailTF;

@FindBy(name = "reg_passwd__")
private WebElement passwordTF;

@FindBy(name = "websubmit")
private WebElement submitButton;

public createAccountPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getFirstNameFT() {
	return firstNameFT;
}

public WebElement getLastNameFT() {
	return lastNameFT;
}

public WebElement getDayDropdown() {
	return dayDropdown;
}

public WebElement getMonthDropdown() {
	return monthDropdown;
}

public WebElement getYearDropdown() {
	return yearDropdown;
}

public WebElement getFemaleRadioButton() {
	return femaleRadioButton;
}

public WebElement getEmailTF() {
	return emailTF;
}

public WebElement getPasswordTF() {
	return passwordTF;
}

public WebElement getSubmitButton() {
	return submitButton;
}


}
