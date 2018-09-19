package cucumberJava;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingltonDriver {

    static private WebDriver driver;

    public  static synchronized WebDriver createDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void destroyDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }

}
