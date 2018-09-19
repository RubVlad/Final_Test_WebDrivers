//import org.junit.jupiter.api.Test;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

public class Test1 {

   private static WebDriver driver;

    @BeforeClass
    public static void setup() {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\DEVELOPER\\source\\repos\\All_Widgets1111\\packages\\Selenium.WebDriver.ChromeDriver.2.38.0.1\\driver\\win32\\chromedriver.exe");
    driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.i.ua/");
    }

    @Test
    public void SeleniumTest()
    {


        String Exp_Name="Vasya";

        driver.findElement(By.cssSelector("[name=\"login\"]")).sendKeys("Vasyaaaa");
        driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys("VasyaPass123");
        driver.findElement(By.cssSelector("[tabindex=\"5\"]")).click();

        String ResponseName=driver.findElement(By.cssSelector(".user_name")).getText();

        Assert.assertEquals(Exp_Name,ResponseName);


    }

    @Test
    public void Test2()
    {

        String Exp_Name="Погода";
        driver.findElement(By.cssSelector(".more")).click();
        String ResponseName=driver.findElement(By.cssSelector(".filter h1")).getText();
        Assert.assertEquals(Exp_Name,ResponseName);


    }

  @AfterClass
   public static void tearDown() {
      driver.quit();
    }
}