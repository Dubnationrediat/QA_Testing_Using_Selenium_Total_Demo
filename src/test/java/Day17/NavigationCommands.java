package Day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) {


        /*
        navigational commands
----------------

navigate().to(url)
navigate().back()
navigate.forward()
navigate.refresh()
         */
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.snapdeal.com"); insted we can use driver.navigate().to("https://www.snapdeal.com");
        driver.navigate().to("https://www.snapdeal.com");  // there is no diffrence between get and navigate to url
        // to go back from one page
            driver.get("https://www.snapdeal.com");
            driver.get("http://www.amazon.com");
            driver.navigate().back(); // this will take us to snapdeal
            driver.navigate().forward();  // will take us to amazon
            driver.navigate().refresh();  // will refreshe the page
    }
}
