package assignmentminiproject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
//step1:declaration
@FindBy(linkText = "Log in")
private WebElement loginLink;

//initialization
public WelcomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//getter
public WebElement getLoginLink() {
	return loginLink;
}


}
