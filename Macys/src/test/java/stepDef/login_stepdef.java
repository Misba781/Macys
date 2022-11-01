package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.login_page;

public class login_stepdef extends Config {
    login_page lp = new login_page(driver);
    @And("click on signIn button")
    public void clickOnSignInButton() {
        lp.clickSignIn();

    }

    @And("i enter valid email address")
    public void iEnterValidEmailAddress() {
    }

    @And("i enter valid password")
    public void iEnterValidPassword() {
    }

    @When("i click on Sing In button")
    public void iClickOnSingInButton() {
    }

    @Then("i should be able to login")
    public void iShouldBeAbleToLogin() {
    }
}
