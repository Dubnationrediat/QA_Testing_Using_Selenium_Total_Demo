package Day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCommands {
    public static void main(String[] args) {
        /*
        Selenium webdriver commands
-----------------------------
get commands
conditional commands
browser commands
navigational commands
wait commands

         */

        // GET commands

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println(driver.getTitle()); // title of the web page
        System.out.println(driver.getCurrentUrl());  // to get web page url
        System.out.println(driver.getPageSource());  // to get the whole html
//        getText()--- will give us the text inside the element
//        getAttribute('value') --- we will get the attribute value eg getAttribute("id") or getAttribute("class")
//--------------------------------------------------------------------------------------
    }
}
