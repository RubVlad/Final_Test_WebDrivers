package cucumberJava;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

//API
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class cucumberJava extends Base{


    @Given("^I have open the browser$")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DEVELOPER\\source\\repos\\All_Widgets1111\\packages\\Selenium.WebDriver.ChromeDriver.2.38.0.1\\driver\\win32\\chromedriver.exe");
        driver = SingltonDriver.createDriver();//new ChromeDriver();
    }

   @When("^I open i.ua website$")
    public void goTo_i_ua() {
        driver.get("http://www.i.ua/");
    }


    @After
    public void tearDown() {
        SingltonDriver.destroyDriver();
    }

    //API
    @Then("^I check statuscode$")
    public static void getresponse_from_server() throws IOException, InterruptedException {

        URL url = new URL("http://www.i.ua/");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.connect();
        Thread.sleep(1000);
        int code = connection.getResponseCode();

        Assert.assertEquals(200, code);
    }

    @Then ("^I make loginapi$")
    public static void make_login() throws IOException {
        URL url = new URL("http://www.i.ua/");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("login111", "Vasiliy_Ali_Babaev@i.ua");
        parameters.put("pass11", "123test123");
        int code = connection.getResponseCode();

        Assert.assertEquals(302, code);
    }

    @Then ("^I make loginmistakeapi$")
    public static void make_login_mistake() throws IOException {
        URL url = new URL("http://www.i.ua/");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("login", "Vasiliy_Ali_Babaev@i.ua");
        parameters.put("pass", "123test123");
        int code = connection.getResponseCode();

        Assert.assertEquals(302, code);
    }
}




  /*  @Then("^I field login field$")
    public void field_login()
    {
        driver.findElement(By.cssSelector("[name=\"login\"]")).sendKeys("Vasiliy_Ali_Babaev@i.ua");
    }

    @Then("^I field password field$")
    public void field_password()
    {
        driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys("123test123");
    }

    @Then("^I click to login$")
    public void click_to_login_button()
    {
        driver.findElement(By.cssSelector("[name=\"lform\"] [type=\"submit\"]")).click();
    }*/


     /* @Then("^I write email to write$")
    public void write_email_send_to()
    {
        driver.findElement(By.cssSelector("#to")).sendKeys("Vasiliy_Ali_Babaev@i.ua");
    }

    @Then("^I write theme of letter$")
    public void write_theme_of_the_letter()
    {
        driver.findElement(By.cssSelector("[name=\"subject\"]")).sendKeys("Test12");
    }

    @Then("^I write text of the letter$")
    public void write_text_of_the_letter()
    {
        driver.findElement(By.cssSelector("#text")).sendKeys("Test12");
    }

    @Then("^I click send message buton$")
    public void click_button_send_message()
    {
        driver.findElement(By.cssSelector("#text")).click();
    }
*/