package Day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
    // some websites , when opened , directely an alert page is lounched so we follow this steps
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }
}
