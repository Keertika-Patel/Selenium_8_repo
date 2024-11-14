package D41_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage_RegisterLink {
	//declaration
@FindBy(linkText = "Register")
private WebElement registerLink;

//initialization
public WelcomePage_RegisterLink(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//getters
public WebElement getRegisterLink() {
	return registerLink;
}

   }
