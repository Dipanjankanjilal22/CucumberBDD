//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class LoginPage {
//	WebDriver driver;
//By txt_Username=By.id("name");
//By txt_Password=By.id("password");
//By btn_Login=By.id("login");
//public LoginPage(WebDriver driver) {
//	this.driver=driver;
//	if(!driver.getTitle().equals("TestProject Demo")) {
//		throw new IllegalStateException("This is not Login page. The current page is"
//				+driver.getCurrentUrl());
//	}
//	
//}
//public void enterUsername(String username) {
//	driver.findElement(txt_Username).sendKeys(username);
//}
//public void enterPassword(String password) {
//	driver.findElement(txt_Password).sendKeys(password);
//}
//public void clicklogin() {
//	driver.findElement(btn_Login).click();
//}
//}
