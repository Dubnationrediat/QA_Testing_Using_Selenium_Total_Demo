package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleAutosuggestDroupDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']"));
        System.out.println(list.size());
        for (WebElement item : list){
            if(item.getText().equals("selenium")){
                item.click();
                break;
            }
        }
    }
}
