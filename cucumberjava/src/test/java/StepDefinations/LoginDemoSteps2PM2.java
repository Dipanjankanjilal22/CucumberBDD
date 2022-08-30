//package StepDefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pagefactory.LoginPagePF;
//import pages.LoginPage;
//
//public class LoginDemoSteps2PM2 {
//	WebDriver driver=null;
//	LoginPagePF pf=new LoginPagePF(driver);
//	@Given("Browser is open")
//	public void browser_is_open() {
//		 System.out.println("Inside step-Browser is open");
//	   WebDriverManager.chromedriver().setup();
//		   driver=new ChromeDriver();
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	   driver.manage().window().maximize();// Write code here that turns the phrase above into concrete actions
//	   driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//	
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters the (.*) and (.*)$")
//	public void user_enters_the_username_and_password(String username,String password) throws InterruptedException {
//		LoginPage log=new LoginPage(driver);
//		log.enterUsername(username);
//		Thread.sleep(1000);
//		log.enterPassword(password);
//		log.clicklogin();
//
//		
////		driver.findElement(By.id("name")).sendKeys(username); 
////		   Thread.sleep(2000);// Write code here that turns the phrase above into concrete actions
////		    driver.findElement(By.id("password")).sendKeys(password);
////		    Thread.sleep(2000);
////	   driver.findElement(By.id("login")).click(); // Write code here that turns the phrase above into concrete actions
////	    
//	}

//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//	   driver.findElement(By.id("logout")).isDisplayed();
//	   Thread.sleep(2000);// Write code here that turns the phrase above into concrete actions
//	    driver.close();
//	    driver.quit();
//	    
//	}
//}
