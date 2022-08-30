//package StepDefinations;
//
//import java.util.concurrent.TimeUnit;
////
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
////
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
////
//public class GoogleSearchStep {
//	WebDriver driver=null;
//	@Given("browser is open")
//	public void browser_is_open() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("Inside step-Browser is open");
//	   WebDriverManager.chromedriver().setup();
//	   driver=new ChromeDriver();
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	   driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Inside step-user is on google search page");
//	    driver.navigate().to("https://google.com");
//	}
//
//	@When("user enters a text on searchbox")
//	public void user_enters_a_text_on_searchbox() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Inside step-user enters a text on searchbox");
//	    driver.findElement(By.name("q")).sendKeys("Automation step by step");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("Inside step-user hits enter");
//	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to search result")
//	public void user_is_navigated_to_search_result() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Inside step-user is navigated to search result");
//	    driver.getPageSource().contains("Online Courses");
//	    driver.close();
//	    driver.quit();
//	}
//}
