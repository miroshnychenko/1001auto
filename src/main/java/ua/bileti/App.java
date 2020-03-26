package ua.bileti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class App 
{
    public static void main( String[] args )
    {
        String expectedTitle = "Киев Афиша концертов 2020: билеты на концерт с доставкой и е-билеты";
        WebDriver driver = new ChromeDriver();
        driver.get("http://1001bilet.devsrv.pw/");
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        driver.quit();
    }
}
