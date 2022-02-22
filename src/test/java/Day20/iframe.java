package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();
       // driver.switchTo().frame(driver.findElement((By.xpath(""))))  // using string values like id,xpath, name,..etc
       // driver.switchTo().frame(0); // using an index
        // driver.swichtTo().frame("name");  // by passing the name

        //first iframe
//                driver.switchTo().frame("packageListFrame"); // switch to the frame
//                driver.findElement(By.linkText("org.openqa.selenium")).click();

        // second iframe
//            driver.switchTo().frame("packageFrame"); // switch to the frame
//            driver.findElement(By.linkText("AbstractDriverOptions")).click();


     // እንዲ ስናረግ ሁለተኛው ፍሬም nosuchframeexception ያሳየናል ስለዚ በእያንዳንዱ ስዊች በፊት ሜን ፔጅ ላይ መሆን አለበት
       // ለዛም ነው  driver.switchTo().defaultContent(); እንጠቀማለን

        //first iframe
                driver.switchTo().frame("packageListFrame"); // switch to the frame
                driver.findElement(By.linkText("org.openqa.selenium")).click();
                 driver.switchTo().defaultContent();

        // second iframe
            driver.switchTo().frame("packageFrame"); // switch to the frame
            driver.findElement(By.linkText("AbstractDriverOptions")).click();
            driver.switchTo().defaultContent();

    }
}
