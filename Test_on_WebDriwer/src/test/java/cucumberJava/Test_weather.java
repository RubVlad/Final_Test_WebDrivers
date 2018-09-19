package cucumberJava;

import cucumber.api.java.en.Then;

public class Test_weather {
    Page_weather pw = new Page_weather();

    @Then("^I click on weather picture$")
    public void click_on_pict()
    {
        pw.click_on_weather_picture();
    }

    @Then("^I see Weather write on the page$")
    public void see_weather_write()
    {
        pw.check_weather();
    }
}
