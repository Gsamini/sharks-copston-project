package page.objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageC extends Base {
	
	public LoginPageC() {
		PageFactory.initElements(driver, this);
//page factory is a class provided by selenium webdriver to support Page object design pattern
//The initElement method is used to initialize web element.
	}
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	private WebElement myAccountElement;
	
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private WebElement loginElement;
	
	@FindBy(id = "input-email")
	private WebElement emailInput;
	
	@FindBy(id = "input-password")
	private WebElement passwordInput;
	
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	
	public void clickMyAccount() {
		myAccountElement.click();
	}
	public void clickLogin() {
		loginElement.click();
	}
	
	public void enterEmailInput(String EmailValue) {
		emailInput.sendKeys(EmailValue); 
	}
public void enterpasswordInput(String PasswordValue) {
	passwordInput.sendKeys(PasswordValue);
}
public void clickloginButton() {
	loginButton.click();
}
public boolean myAccountTextIsPresent() {
	if(myAccountText.isDisplayed())
		return true;
else 
		return false;
	}

}	

