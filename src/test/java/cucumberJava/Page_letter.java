package cucumberJava;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Page_letter extends Base{


    public void Click_on_letter()
    {
        driver.findElement(By.cssSelector(".new")).click();
    }


    public void Get_1_new_letter()
    {
        Assert.assertEquals("Василий Али-Бабаевич",driver.findElement(By.cssSelector("#mesgList .new .frm")).getText());
    }
}
