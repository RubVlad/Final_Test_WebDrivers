package cucumberJava;

import org.openqa.selenium.WebDriver;

public class Base {

    SingltonDriver dr = new SingltonDriver();
    //Page_login pl=new Page_login();

    WebDriver driver = dr.createDriver(); //= null;
}