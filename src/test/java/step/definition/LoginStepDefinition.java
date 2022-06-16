package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LoginPageC;

public class LoginStepDefinition extends Base {
	LoginPageC loginPageC =new LoginPageC();
	
	  
	@Given("User is on retail website")
	public void user_is_on_retail_website() {
		loginPageC.clickMyAccount();
		logger.info("user clicked on my Account");
	}
	@And("User click on MyAccount")
	public void user_click_on_account() {
	 loginPageC.clickMyAccount();
	 logger.info("user cliked on MyAccount");
	}
	
	
	@When("User click on Login")
	public void user_click_on_login() {
		loginPageC.clickLogin();
		logger.info("user clicked on my Login");
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
	   loginPageC.enterEmailInput(email);
	   logger.info("user entered username"+email);
	   loginPageC.enterpasswordInput(password);
	  logger.info("user entered password"+ password);
	   
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
	  loginPageC.clickloginButton();
	  logger.info("user_clicked_on_login_button");
	  
	  
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	   Assert.assertTrue(loginPageC.myAccountTextIsPresent());
	   logger.info("user should be in  his account page");
	  
	}

}
