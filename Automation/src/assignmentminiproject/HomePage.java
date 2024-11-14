package assignmentminiproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
 @FindBy(linkText = "Log out")
 private WebElement logoutLink;
 
 @FindBy(linkText = "BOOKS")
 private WebElement booksLink;
 
 @FindBy(linkText = "ELECTRONICS")
 private WebElement electronicsLink;
 
 @FindBy(linkText = "COMPUTERS")
 private WebElement computersLink;
 
 @FindBy(linkText = "GIFT CARDS")
 private WebElement giftCardsLink;

 //initialization
 public HomePage(WebElement driver ) {
	PageFactory.initElements(driver, this);
}

 //getters
public WebElement getLogoutLink() {
	return logoutLink;
}

public WebElement getBooksLink() {
	return booksLink;
}

public WebElement getElectronicsLink() {
	return electronicsLink;
}

public WebElement getComputersLink() {
	return computersLink;
}

public WebElement getGiftCardsLink() {
	return giftCardsLink;
}
 
 
}
