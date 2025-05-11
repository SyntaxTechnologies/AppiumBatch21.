package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;

import java.net.MalformedURLException;

public class LoginSteps extends CommonMethods {

    LoginPage loginPage = new LoginPage();

    @Given("user is able to launch app in android devices")
    public void user_is_able_to_launch_app_in_android_devices() throws MalformedURLException {
        launchApplication();
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.usernameField.sendKeys("standard_user");
        loginPage.passwordField.sendKeys("secret_sauce");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();

    }
    @Then("user is able to see products page")
    public void user_is_able_to_see_products_page() {
        System.out.println("test");
    }

}
