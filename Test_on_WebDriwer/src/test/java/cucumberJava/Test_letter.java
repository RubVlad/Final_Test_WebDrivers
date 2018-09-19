package cucumberJava;

import cucumber.api.java.en.Then;

public class Test_letter {

    Page_letter let=new Page_letter();

    @Then("^I getcheck 1 new letter$")
    public void check_letter()
    {
        let.Get_1_new_letter();
    }

    @Then("^I click on letter$")
    public void clic_on_letter()
    {
        let.Click_on_letter();
    }
}
