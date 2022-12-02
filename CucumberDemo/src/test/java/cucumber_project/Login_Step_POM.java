package cucumber_project;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import Pages.Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Step_POM {
//	Login_page login;
//	WebDriver driver=null;
//	SoftAssert softAssert=new SoftAssert();
//	@SuppressWarnings("deprecation")
//	@Given("I open Chrome Browser")
//	public void i_open_chrome_browser() {
//		System.out.println("==== I im inside Login_page demo in POM ====");
//		System.out.println("I open Chrome Browser");
//		System.setProperty("webdriver.chrome.silentOutput","true");
//		String projectPath=System.getProperty("user.dir");
//		System.out.println("project path is " + projectPath);
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
//	public void open_the_login_page() {
//		
//		System.out.println("Open the Login page");
//		
//		String ExpectedTitle = "Indyfin Advisor Platform";
//		String getActualTitle= driver.getTitle();
//		softAssert.assertEquals(getActualTitle, ExpectedTitle);
//		softAssert.assertAll(); 		
//	}
//	@Then("^I enters the (.*) and (.*)$")
//	public void i_Enters_and_passwprd(String username, String password) {
//		login=new Login_page(driver);
//		
//		login.enterusername(username);
//		login.enterpassword(password);
////		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(username);
////		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//		
//	} 
//	
//	@Then("Users click on the Login button")
//	public void users_click_on_the_login_button() {
//		login.clickLogin();
//		
//		//driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]")).click();
//	}
//	
//	@Then("User is navaite to the Dashabord")
//	public void user_is_navaite_to_the_dashabord() throws InterruptedException {
//		login.checkafterlogin();
//		//driver.findElement(By.xpath("//span[contains(text(),'Getting started with Indyfin')]")).isDisplayed();
//		//driver.close();
//		Thread.sleep(2000);
//		
//		driver.close();
//		driver.quit();
//	}

	
}
