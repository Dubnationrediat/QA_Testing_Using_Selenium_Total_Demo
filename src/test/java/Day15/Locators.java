package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    // locators
//        * id,name,linktext(partiallinktext),class name, target name.

    // customized locators
//          * css selector (tag and id, tag and class, tag and attribute,tag class and attribute).
//          * xpath (absolute Xpath , Relative Xpath).
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");  // using id
        driver.findElement(By.name("submit_search")).click(); // using name
        driver.findElement(By.linkText("Printed chiffon Dress")).click();   // using anchor tag
        driver.findElement(By.partialLinkText("chiffon Dress")).click();    // using anchor tag but inseting partial text on the link
    }
}
