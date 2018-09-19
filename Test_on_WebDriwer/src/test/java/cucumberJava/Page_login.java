package cucumberJava;

import org.openqa.selenium.By;

public class Page_login extends Base{


    public void login_to_site()
    {
        driver.findElement(By.cssSelector("[name=\"login\"]")).sendKeys("Vasiliy_Ali_Babaev@i.ua");
        driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys("123test123");
        driver.findElement(By.cssSelector("[name=\"lform\"] [type=\"submit\"]")).click();
    }

    //API
    public void login_api()
    {

    }


}
