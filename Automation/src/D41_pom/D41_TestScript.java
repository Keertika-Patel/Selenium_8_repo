package D41_pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D41_TestScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://demowebshop.tricentis.com/");
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("keertikapatel5155@gmail.com");
		lp.getPasswordTextField().sendKeys("keertika34");
		lp.getLoginButton().click();
		
	}

}
