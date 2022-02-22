package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.RETURN);
//         // እዚ ጋር ያው ኢንተር ካረግን በሁዋላ የተወሰነ ስለሚቆይ ችግር እንዳይፈጥር ብሬክ እንሰጠዋልን እዚ ጋር
//            Thread.sleep(3000);
        // የትሬድ ችግሩ ምንድነው መልሱ በመጣም ለተባለው ሰከንድ ይጠብቃል ፣ ሌላው ደግሞ ከተቀመጠለት በላይ ቢፈጅ መልሱም እንደዛው ችግር ይፈጥራል
        // ስለዚ አውቶሜሽን ላይ ይሄንን መጠቀም ሪኮማንድ አይደረግም
        // ስለዚ ለምሳሌ ኢምፕሊሲት ዌይት እንጠቀማለን ለዛ ነው ከላይ እንከተዋለን
        // ኢንፕሊስት ዌይት ይጠብቅ እና መልሱ ሲመጣ ያው ያስተናግዳል ከተሰጠው ሰአት ባነስ ግዜ ቢመጣም ማለት ነው ግን ከተሰጠው በላይ ግን አይጠብቅም
        // ለዛ ኤክስፕሊሲት ዌይት እንጠቀማለን
//           የሄንን ለማረግ ዌብ ድራይቨር ካልስ መጥራት አለብን
        WebDriverWait wait = new WebDriverWait(driver,10); //this is cut off time  //  declaration part for explicit wait
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']"))); // this might be true or false true ማለት መቶዋል ወይም ተገኝቶዋል ማለት ነው
        ele.click();
//        or another example
        WebElement elee = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Selenium']")));
         elee.click();
        driver.findElement(By.xpath("//h3[text()='Selenium']")).click();


        //ግን ለሁሉም እንዲ ከምትጽፍ ለሁሉም፣ አንድ ሜትድ እንሰራ እና እሱን መጠቀም እንችላለን
        // ልክ ከታች እንደጻፍነው ማለት ነው ከዛ በዚ መልኩ እናስተካክላለን ማለት ነው
        By eleLocator = By.xpath("//h3[text()='Selenium']");
        waitForElementPresent(driver,eleLocator,10);  // አለቀ ማለት ነው
        waitForElementPresent(driver,eleLocator,10).click(); // እንዲ አርገን አክሽን ሁላ መውሰድ እእንችላላን።
    }

    public  static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout){
        WebDriverWait w = new WebDriverWait(driver, timeout);
        w.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
}
