package cucumberJava;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Page_weather extends Base{


    public void click_on_weather_picture() {
        driver.findElement(By.cssSelector(".weather span")).click();
    }

    public void check_weather() {
        Assert.assertEquals("Погода",driver.findElement(By.cssSelector("._title")).getText());  //.sn_menu_title
    }
}
