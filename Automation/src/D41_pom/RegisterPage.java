package D41_pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
//declaration 
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id = "LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	//initialization
	public RegisterPage(WebDriver driver) {
      PageFactory.initElements(driver,this );
	}

	//getters
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	
	public WebElement getRegisterButton() {
		return registerButton;
	}

	
	
	
}
