package cucumberJava;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PageCreate_message extends Base{



    public void click_to_create_message()
    {
        driver.findElement(By.cssSelector(".make_message")).click();
    }


    public void send_letter()
    {
        driver.findElement(By.cssSelector(".make_message")).click();
        driver.findElement(By.cssSelector("#to")).sendKeys("Vasiliy_Ali_Babaev@i.ua");
        driver.findElement(By.cssSelector("[name=\"subject\"]")).sendKeys("Test12");
        driver.findElement(By.cssSelector("#text")).sendKeys("Test12");
        driver.findElement(By.cssSelector("#text")).click();
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
    }


    public void see_succesful_message() throws InterruptedException
    {
        Thread.sleep(3000);
        Assert.assertEquals("Письмо успешно отправлено адресатам",driver.findElement(By.cssSelector(".content")).getText());
    }

}
