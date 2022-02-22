package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
/*
Synchronization problem ይሄንን ኦቨርካም ለማረግ ነው ዌይት እንጠቀመው። ይሄ ሚፈጠረው ኤክስኪውት የምናረገው ኮድ ከሪስፖንሱ ሲቀንድም ነው
   script excution > application responce ----> synchronization problem will occure

types of waits
------------

thread.sleep() ይሄ ከጃቫ እራሱ የሚመጣ ዌይት አይነት እንጂ የሴሊኒየም አይደለም

ሴሊኒየም ውስጥ ያሉት እነዚ ሶስቱ ብቻ ናቸው

implicit wait
explicit wait
fluent wait
 */
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // implicit wait

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.RETURN);

        driver.findElement(By.xpath("//h3[text()='Selenium']")).click();



    }
}
