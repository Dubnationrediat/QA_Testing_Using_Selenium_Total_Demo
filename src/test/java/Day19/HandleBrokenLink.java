package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class HandleBrokenLink {
    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int brokenLink = 0;
        for(WebElement element : allLinks){
            String url = element.getAttribute("href");
            if (url==null || url.isEmpty()){
                System.out.println("url is empity");
            }
            // since the abover url is in a string format , we should use a mehtod called url to chenge teh string to acutal url
            URL link = new URL(url);
            // then send this link for a request using a request method
            try {
                HttpURLConnection httpcoon =(HttpURLConnection)link.openConnection(); // open the connection
                httpcoon.connect();

                if (httpcoon.getResponseCode()>=400){
                    System.out.println( httpcoon.getResponseCode() + "  "+ url +  " its a broken link");
                    brokenLink++;
                }else{
                    System.out.println(httpcoon.getResponseCode() + "  "+ url +  " its a broken link");
                }
            }catch (Exception e){
            }
            System.out.println("Number of broken links :"+ brokenLink);
            driver.quit();
        }

    }
}
