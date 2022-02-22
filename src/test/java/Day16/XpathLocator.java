package Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

    public static void main(String[] args) {
        /*
                xpath
        --------
        XPath is defined as XML path.
        It is a syntax or language for finding any element on the web page using XML path expression.
        XPath is used to find the location of any element on a webpage using HTML DOM structure.
        XPath can be used to navigate through elements and attributes in DOM.  (Dom is an api intrface provided by browser)
        XPath is an address of the element.
         */

/*
        Types of xpath
        -------------

        1) Absolute/Full xpath
            /html/body/div[6]/header/div/div[1]/a/img
            /html/body/section[1]/div/div/div/div/div[2]/div/div/form/fieldset/div[1]/div/input

        2) Relative xpath/Partial xpath
            //*[@id="demo-page"]/body/div[6]/header/div/div[1]/a/img
            //*[@id="Form_submitRequest_FirstName"]
 */
/*
            Diff between Absolute & Relative Xpaths
            ------------------------------------
            1) Absolute xpath starts from root html node  (node is everyting in html any opening and cloasing tag)
               Relative xpath directly jump to element on DOM.

            2) Absolute xpath start WITH /
              Relative xpath STARTS WITH //

            3) in Absolute xpath we use only tags/nodes
               In Relative xpath we use attributes.

               WE USE REALTIVE XPATH AND IT IS PREFERED BECAUSE IT DIRECTLY GO TO THE ELEMENT BUT ABSOUTLE WILL GO THROUGH EVERY NODE
                SO IF SOME CHANGE HAPPEN ON TAGS IT WILL CRUSH.
 */
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath(""));

        /*
        xpath options
-----------------
and
or
contains()
starts-with()
text()
         */
        //or operator(either of the two ከተሙዋላ ይይዝልናል ማለት ነው)
              driver.findElement(By.xpath("//*[@id='user-name'or @name='user-name']"));
        // and operator(ሁለቱም መሙዋላት አለበት)
              driver.findElement(By.xpath("//*[@id='user-name'and @name='user-name']"));
       // contain
        // አንዳዴ ዳይናሚክ የሆነ ነገር ሊያጋጥመን ይችላላ ለምሳሌ በተን አንድ ግዜ ስታርት ክሊክ ካረግነው በሁዋል ደግሞ ስቶፕ ሊያረግ ይችላል ለዛ ምንጠቀመው contain method
            driver.findElement(By.xpath("//*[contains(@id,'ST')"));
            driver.findElement(By.xpath("//*[starts-with(@name,'submit_')"));
        // text
//         አንዳንዴ አንከር ታግ ውስጥ ያለውን ቴክስ ታርጌት አርገን ካፕቸር ማረግ ስንፈልግ ማለት ነው text method ምንጠቀመው
            driver.findElement(By.xpath("//a[text()='catagories'"));
        // chained xpath
//        አንዳንዴ ከፓረንቱ መነሳት ሊኖርብን ይችላል ስለዚ ነው ይሄንን ምንጠቀመው
        driver.findElement(By.xpath("//form[@id='someid'/input[@id='iddd']")); //በዚ መልኰናስገባለን

    }
}
