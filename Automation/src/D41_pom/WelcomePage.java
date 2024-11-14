package D41_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//Step1:declaration
	@FindBy(linkText = "Log in")
	//@FindBy(xpath = "a[text()='Log in']")//if we want to do any modification we directly do changes in pom itself intead of doing changes in testscript
	private WebElement loginLink;
	
	//initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//getters
	public WebElement getLoginLink() {
		return loginLink;
}
}