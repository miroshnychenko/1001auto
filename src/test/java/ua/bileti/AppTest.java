package ua.bileti;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AppTest {
    WebDriver driver;
    String expectedTitle = "Киев Афиша концертов 2020: билеты на концерт с доставкой и е-билеты";

    @Test
    public void openSite() {
        driver = new ChromeDriver();
        driver.get("http://1001bilet.devsrv.pw/");
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        driver.quit();
    }
}
