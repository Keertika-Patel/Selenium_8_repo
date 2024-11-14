package Assignment40_FacebookTestNGAndPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage_Facebook {
@FindBy(xpath = "//a[text()='Create new account']")
private WebElement createAccountButton;

public WelcomePage_Facebook(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public WebElement getCreateAccountButton() {
	return createAccountButton;
}


}
