package Day18;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class fluentWaitDemo {

    public static void main(String[] args) {
        // its another type of explicit wait

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.RETURN);

        By elelocator = By.xpath("//h3[text()='Selenium']");
        waitForElementWithFluentWait(driver,elelocator).click();

    }

    public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30,TimeUnit.SECONDS)   // cut off time
                .pollingEvery(5,TimeUnit.SECONDS)// every five second it will check since here 30 second it the limit it will go and check 6 times since 6*5=30
                .ignoring(java.util.NoSuchElementException.class); // to handele exception withour try..catch method

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }


}
