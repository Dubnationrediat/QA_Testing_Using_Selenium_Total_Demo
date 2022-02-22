package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
//        CSS selecotrs are costomizable selectrors
                    /*
                    tag and Id or #id
                    tag and class or .class
                    tag and attribute or [attribute=value]
                    tag,class and attribute
                     */
//                     but tag is optional we can skip it

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        // using tag and id
        driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmial.com");// using tag of input and id of email
        driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmial.com");// input tag is optional thats why we did this

        // suing tag and class
        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmial.com");// using both tag and class
        driver.findElement(By.cssSelector(".email")).sendKeys("abc@gmial.com"); // since tag is optional

        //tag and attribute
           // attibute we can use any attribute with key and value
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc@gmial.com");//using both input and attribute
        driver.findElement(By.cssSelector("[name=email]")).sendKeys("abc@gmial.com"); // using attribute only
        // tag class and attributeC
          // in some cases tag and class for elements may be the same so to diffrenciate this we use all tag class and attribute
        driver.findElement(By.cssSelector("input.inputtext[name=emil]")).sendKeys("abc@gmial.com");
//              input is tag , inputtext is class and the one in [] is the attribute with value





    }
}
