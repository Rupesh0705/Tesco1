package StepDefinition;

import PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageSteps {

        HomePage homePage = new HomePage();

    @Given("User is on the web page of Argos web site")
    public void user_is_on_the_web_page_of_Argos_web_site() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("user search for any product")
    public void user_search_for_any_product() {

        homePage.SignIn();
    }

    @Then("user should be able to get the result for the search product")
    public void user_should_be_able_to_get_the_result_for_the_search_product() {
        // Write code here that turns the phrase above into concrete actions
    }

} // End of class


