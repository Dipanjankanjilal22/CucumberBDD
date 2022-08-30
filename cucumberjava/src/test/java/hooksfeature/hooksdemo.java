//package hooksfeature;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class hooksdemo {
//	WebDriver driver=null;
//	@Before(value="@smoke",order=1)//it is a hook
//	public void browserSetup() {
//		System.out.println("I am inside browser setup");
//		  WebDriverManager.chromedriver().setup();
//		   driver=new ChromeDriver();
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	   driver.manage().window().maximize();
//	}
//	@After(order=0)
//	public void teardown() {
//		System.out.println("I am inside browser setup");
//		driver.close();
//		driver.quit();
//	}
//	@Before
//	public static void beforesteps() {
//		System.out.println("I am inside before steps");
//	}
//	@After(order=1)
//	public static void aftersteps() {
//		System.out.println("I am inside before step");
//	}
//	@Given("user is in login page")
//	public void user_is_in_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//	}
//
//	@When("user enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
////   driver.findElement(By.id("logout")).isDisplayed();
////	   Thread.sleep(2000);// Write code here that turns the phrase above into concrete actions
////    driver.close();
////	    driver.quit();    
//	}
//}
