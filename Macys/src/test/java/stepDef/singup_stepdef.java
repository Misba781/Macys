package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.signup_page;

public class singup_stepdef extends Config {
    signup_page rr = new signup_page(driver);
    @Given("i am at macys Homepage")
    public void iAmAtMacysHomepage() {



    }

    @And("i click on clickSearch")
    public void iClickOnClickSearch() {
     rr.clickSearch();

    }


}
