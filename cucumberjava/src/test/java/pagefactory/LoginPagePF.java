//package pagefactory;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginPagePF {
//	WebDriver driver;
//	public LoginPagePF(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver,this);
//	}
//	@FindBy(id="name")
//	@CacheLookup//for a basic websites
//WebElement Txt_Username;
//	@FindBy(id="password")
//	WebElement Txt_Password;
//	@FindBy(id="login")
//	WebElement btn_Login;
//	@FindBy(partialLinkText="Dipanjan")
//	List<WebElement> myLinks;
//	public void enterUsername(String username) {
//		Txt_Username.sendKeys(username);
//	}
//	public void enterPassword(String password) {
//		Txt_Password.sendKeys(password);
//	}
//	public void clickLogin() {
//		btn_Login.click();
//	}
//}
