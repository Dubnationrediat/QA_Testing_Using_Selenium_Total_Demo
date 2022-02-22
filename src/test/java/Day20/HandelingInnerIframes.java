package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingInnerIframes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
        WebElement framee = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
        driver.switchTo().frame(framee); //another way of swicthing to iframe

        WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(innerframe);  // እዚ ጋር ኢነር ፍሬም ስለሆነ ወደ ሆም ፔጅ መመለስ አይጠበቅብንም
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("welcome");



    }
}
