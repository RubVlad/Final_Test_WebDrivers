package cucumberJava;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.junit.Assert;

import static io.restassured.RestAssured.given;


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

    //api
    @When("^Send Get request to i.ua$")
    public void sendGetRequestToIUa() {
        io.restassured.response.Response resp = RestAssured.get("https://www.i.ua/");
        int code = resp.getStatusCode();
        Assert.assertEquals(code,200);
        System.out.println("Time of responce  = "+resp.getTime());
    }


    @When("^Check data from i.ua$")
    public void checkDataFromIUa()  {
        Response resp=RestAssured.get("https://www.i.ua/");
        String data =resp.asString();
        System.out.println("Data is "+data);
        System.out.println("Time of responce  = "+resp.getTime());
    }


    @When("^I check correct log in on i.ui$")
    public void iCheckCorrectLogInOnIUi() throws Throwable {
        RestAssured.baseURI = "https://www.i.ua/";
        given().auth().preemptive()
                .basic("Vasiliy_Ali_Babaev@i.ua", "123test123")
                .when()
                .get("")
                .then().statusCode(200);
    }


    @When("^I send post request to i.ui$")
    public void iSendPostRequestToIUi()
    {

        Response resp = given().body("   {\"login\": \"Vasiliy_Ali_Babaev@i.ua\"," +
                ""+" \"pass\": \"123test123\"")

                .when().contentType(ContentType.JSON)
                .post("https://www.i.ua/");

        System.out.println(resp.asString());


    }

}
