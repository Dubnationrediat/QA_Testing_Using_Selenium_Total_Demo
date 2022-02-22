package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) {
        /*
        browser commands
------------
close() - close one browser window
quit() - close multiple browser windows

         */

        // the diffrence between the two is close will close one browser at a time and quit will close multiple windows at a time

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement linkpage = driver.findElement(By.linkText("OrangeHRM, Inc"));
        linkpage.click();
        driver.close();  // this will close the first window
        driver.quit();   // this will close the whole window
    }
}
