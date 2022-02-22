package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalCommands {
    public static void main(String[] args) {
        /*
        conditional commands
        --------------
        isDisplayed()
        isEnabled()
        isSelected()
         */
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
        WebElement searchBare = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        // IS ENABLED and IS SELECTED
                System.out.println("display status "+ searchBare.isDisplayed());
                System.out.println("Enabled status "+ searchBare.isEnabled());  //መጻፍ ማስቻል እና አለማስቻልን ነው ሚያሳየው ይሄ
        // is selected is used for CHECK BOX AND RADIO BUTTON
                 WebElement mailradiobutton = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
                 WebElement femailradiobutton = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
                System.out.println(mailradiobutton.isSelected());
                System.out.println(femailradiobutton.isSelected());



    }
}
