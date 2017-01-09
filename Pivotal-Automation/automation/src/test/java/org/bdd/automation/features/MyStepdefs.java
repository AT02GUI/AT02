package org.bdd.automation.features;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fundacion.common.drivers.Driver;
import org.fundacion.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class MyStepdefs {
  WebDriver driver;
  LoginPage login;

  @Given("^I am on Pivital Home Page$")
  public void I_am_on_Pivital_Home_Page() throws IOException {
    driver = Driver.getDriver().openBrowser();
    login = new LoginPage(driver);
  }

  @When("^I put a valid user (.*?)$")
  public void I_put_a_valid_user(String userName) {
    login.setUserName(userName);
    login.clickContinue();
  }

  @And("^I put a valid password (.*?)$")
  public void I_put_a_valid_password(String password) {
    login.setPassword(password);
    login.clickSubmit();
  }

  @Then("^I should see that I Logged on this url (.*?)$")
  public void I_should_see_that_I_Logged_on_this_url(String url) {
    String actualResult = driver.getCurrentUrl();
    assertEquals(actualResult, url);
  }
}
