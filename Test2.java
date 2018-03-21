package AutotestSakuraweb.ru;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    @Test
    public void Progon() {
        System.setProperty("webdriver.chrome.driver", "/Users/drew/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://sakuraweb.ru");


    }
}