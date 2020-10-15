package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.EbayObjects;

public class EbayHomepage extends EbayObjects {

    @Given("I enter https:www.Ebay.com on the address bar")
    public void i_enter_https_www_Ebay_com_on_the_address_bar() {
       setUp();
    }

    @Then("I should be on Ebay Homepage")
    public void i_should_be_on_Ebay_Homepage() {
      getTitle();
    }

}
