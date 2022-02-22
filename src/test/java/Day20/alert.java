package Day20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click(); // open the alert
        Thread.sleep(3000);
        driver.switchTo().alert();  // will return alert object
        Alert myalert = driver.switchTo().alert();
        Thread.sleep(2000);
        myalert.sendKeys("this is alert box");
        Thread.sleep(2000);
        System.out.println(myalert.getText());   // will return the text on the checkbox
        myalert.accept();   // close the alert window by using OK button(positive button)
       // myalert.dismiss();  // close the alert window by using CANCEL button (negetive button)

    }
}
