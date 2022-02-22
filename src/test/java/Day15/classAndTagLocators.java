package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class classAndTagLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        List<WebElement> slider = driver.findElements(By.className("homeslider-container")); //ይሄ ላይ በክላስ ስም ነው እየፈለኝ ያለነው ግን ብዙ
        // ኢለመንት ሊኖር ስለሚችል ይሄንን ከተጠቀምን አንድ ኢለመንት ስለሚያመጣ findElemet ሳይሆን findelements  የሚለውን መጠቀም አለብን የሚመልስን ደግሞ ብዙ
        // ስለሆነ ሊስት ክላስ መጠቀም አለብን
        System.out.println(slider.size()); //ስንት እንደሆኑ ማወቅ ከፈለግን ማለት ነው የሊስት ሜትድ የሆነውን ሳይዝ ሜትድ እንጠቀማለን።

        List <WebElement> listofanchor = driver.findElements(By.tagName("a")); // to get all anchor tages or links
        System.out.println(listofanchor.size());   // to know the amount of the links

        // diffrence between findElement and findElements

        /*
            findElement() ---> returns single webelement
            findElements() ---> returns multpple webelements

            findElement(single) ---> return single webelement
            findElement(multiple) --> return the first webelement

            findElements(single) ---> List<WebElement>
            findElements(multiple) ---> List<WebElement>
         */



    }
}
