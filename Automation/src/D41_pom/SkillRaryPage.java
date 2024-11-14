package D41_pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryPage {
	//declaration
	@FindBy(id = "navbar-search-input")
	private WebElement searchTF;
	
	//initialization 
	public SkillRaryPage(SearchContext driver) {
		PageFactory.initElements(driver, this);
	}
	//getters
	public WebElement getSearchTF() {
		return searchTF;
	}
	  }
