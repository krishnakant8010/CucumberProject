package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooksDemoStep {

	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@Before(value ="@Smoke", order=1)
	public void browserSetup() {
		System.out.println("=== i am inside the browserSetup ===");
		String projectPath=System.getProperty("user.dir");
		System.out.println("project path is " + projectPath);
		System.setProperty("webdriver.chrome.driver" ,projectPath+"\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before(order=2)
	public  void beforeSetup2() {
		System.out.println("=== i am inside the beforeSetup2 ===");
	}
	@After
	public void dearDown() throws InterruptedException {
		System.out.println("=== i am inside the dearDown === \n");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public  void beforeStep() {
		System.out.println("=== i am inside the beforeStep ===");
	}
	
	@AfterStep
	public  void AfterStep() {
		System.out.println("=== i am inside the AfterStep ===");
	} 
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("=== user is on login page ===");
	}
	
	@When("user enters the Username and password")
	public void user_enters_the_username_and_password() {
		System.out.println("=== user enters the Username and password ===");
	}
	
	@When("clicks on ok the login button")
	public void clicks_on_ok_the_login_button() {
		System.out.println("=== clicks on ok the login button ===");
	}
	
	@Then("user is navigalted to the home page")
	public void user_is_navigalted_to_the_home_page() {
		System.out.println("=== user is navigalted to the home page ===");
	}	
}
