package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class GoogleSteps {


    GooglePage google =  new GooglePage();

    @Given("^I am on the google search page$")
    public void navegateToGoogle() {
        google.navegateToGoogle();
    }

    @When("^I enter search criteria$")
    public void enterSearchCriteria() {

    }

    @And("^click on the search button$")
    public void clickSearchButton() {

    }

    @Then("^the results match criteria$")
    public void validateResults() {


    }

}


