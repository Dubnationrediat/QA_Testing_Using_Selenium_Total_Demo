package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class linksIdentification {
    public static void main(String[] args) {
        // links
        //----------
        //1 find the link and perform click action
        //2 find total number of links in webpage
        //3 capture all the links print
        //__________________________________________

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
//1) click on the link
                driver.findElement(By.linkText("Today's Deals")).click();
        // or
//        driver.findElement((By.partialLinkText("Deals"))).click();

        //2) how to find number of links
//                List<WebElement> links = driver.findElements(By.tagName("a"));
//                System.out.println(links.size());
        //3)print all the link names
//                for(WebElement e:links){
//                    System.out.println(e.getText());
//                }


    }
}
