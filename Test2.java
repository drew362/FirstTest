package AutotestSakuraweb.ru;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    @Test
    public void Progon() {
        System.setProperty("webdriver.chrome.driver", "/Users/drew/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://sakuraweb.ru/wp-login.php");

        WebElement loginField = driver.findElement(By.id("user_login"));
        loginField.sendKeys("drew362");
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        passwordField.sendKeys("041989Aa");
        WebElement loginButton = driver.findElement(By.id("wp-submit"));
        loginButton.click();


        WebElement menuUser = driver.findElement(By.cssSelector(".login-button__menu-icon"));
        menuUser.click();
        WebElement logoutButton = driver.findElement(By.id("login__logout"));
        logoutButton.click();
        driver.quit();
    }
}