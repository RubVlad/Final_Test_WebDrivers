package cucumberJava;

import cucumber.api.java.en.Then;

public class TestsCreate_message {

    PageCreate_message sm = new PageCreate_message();

    @Then("^I click button Create message$")
    public void click_for_create()
    {
       sm.click_to_create_message();
    }

    @Then ("^I send letter$")
    public void send_email()
    {
        sm.send_letter();
    }

    @Then("^I see succesfull message$")
    public void succesful_message() throws InterruptedException {
        sm.see_succesful_message();
    }
}
