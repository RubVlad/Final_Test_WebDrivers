package cucumberJava;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.junit.Assert;


public class Tests_login extends Base {

    public Page_login pl=new Page_login();

    @Then("^Login button should exits$")
    public void check()
    {
        Assert.assertEquals(true,driver.findElement(By.cssSelector(".weather span")).isEnabled());
    }

    @Then("^I make login$")
    public void make_login()
    {
        pl.login_to_site();
    }

    @Then("^I see my personal profile page$")
    public void check_profile()
    {
        Assert.assertEquals("Василий",driver.findElement(By.cssSelector(".user_name")).getText());
    }

}
