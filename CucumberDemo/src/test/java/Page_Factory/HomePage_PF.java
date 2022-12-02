package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	@FindBy(xpath="//span[contains(text(),'Getting started with Indyfin')]")
	WebElement Match_AfterLogin_txt;
	 WebDriver driver=null;
	
	public HomePage_PF(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, Login_Page_PF.class);
		
	}
	
	public void Home_check_afterLogin_txtDispayed() {
		Match_AfterLogin_txt.isDisplayed();
	}
}
