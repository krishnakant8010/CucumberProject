package cucumber_project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import Page_Factory.HomePage_PF;
import Page_Factory.Login_Page_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
public class Login_Step_PF {

//	WebDriver driver=null;
//	Login_Page_PF login;
//	HomePage_PF home;
//	SoftAssert softAssert=new SoftAssert();
//	@SuppressWarnings("deprecation")
//	@Given("I open Chrome Browser")
//	
//	public void i_open_chrome_browser() {
//		
//		System.out.println("=== i am inside Login_Step_PF class ==== ");
//		System.out.println("I open Chrome Browser");
//		
//		String projectPath=System.getProperty("user.dir");
//		System.out.println("project path is " + projectPath);
//		 WebDriverManager.chromedriver().setup();
//
//		    ChromeOptions options = new ChromeOptions();
//		System.setProperty("webdriver.chrome.driver" ,projectPath+"\\src\\test\\resources\\Driver\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
//		
//	}
//
//	@Given("I enter the URL in the address bar")
//	public void i_enter_the_url_in_the_address_bar() {
//		System.out.println("I enter the URL in the address bar");
//		driver.navigate().to("https://stage.indyfin.com/#/");
//		
//	}
//
//	
//	@Then("Open the Login page")
//	public void open_the_login_page() throws InterruptedException {
//		Thread.sleep(2000);
//		System.out.println("Open the Login page");
//		
//		String ExpectedTitle = "Indyfin Advisor Platform";
//		String getActualTitle= driver.getTitle();
//		softAssert.assertEquals(getActualTitle, ExpectedTitle);
//		softAssert.assertAll(); 		
//	}
//	@Then("^I enter the (.*) and (.*)$")
//	public void i_enter_the_agami_krishna_gmail_com_and_super_super(String username, String password) throws InterruptedException {
//		
//		login =new Login_Page_PF(driver);
//		System.out.println(username);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
////		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(username);
////		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//		Thread.sleep(2000);
//	}
//	
//	@Then("Users click on the Login button")
//	public void users_click_on_the_login_button() {
//		
//		login.clickOnLogin();
//		//driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]")).click();
//	}
//	
//	@Then("User is navaite to the Dashabord")
//	public void user_is_navaite_to_the_dashabord() throws InterruptedException {
//		
//		home =new HomePage_PF(driver);
//		home.Home_check_afterLogin_txtDispayed();
//		
//		//driver.findElement(By.xpath("//span[contains(text(),'Getting started with Indyfin')]")).isDisplayed();
//		Thread.sleep(2000);
//		
//		driver.close();
//		driver.quit();
//	}

	
}
