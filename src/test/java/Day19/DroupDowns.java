package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DroupDowns {
    public static void main(String[] args) throws InterruptedException {

        //Type of Droupdowns are two
            //1) select droup down which have select tag of html
            // 2) Bootstrap elements
            // 3) Auto suggestion

// droup down manu cna be constructed using select or div

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
//        driver.manage().window().maximize();

        WebElement forDroupDown = driver.findElement(By.xpath("//*[@id=\"input-country\"]"));
        Select drop = new Select(forDroupDown);

        // select opiton form DroupDown
        //select by index
//                             drop.selectByIndex(1);
//                             Thread.sleep(2000);
        //select by value
//                         drop.selectByValue("44");
//                         Thread.sleep(2000);
        //select by visible text
//                        drop.selectByVisibleText("Ethiopia");

     // to find all the number of options we use the following

//                        List<WebElement> alloptions = drop.getOptions();
//                        System.out.println(alloptions.size());

//  to capture all the options
//                        for(WebElement o : alloptions){
//                            System.out.println(o.getText());
//                        }

//using normal loop
//        for (int i = 0; i <alloptions.size() ; i++) {
//            System.out.println(alloptions.get(i).getText());
//        }
  // selecting option without using built in methods like getbyindex , getbyvisibletext etc ....
//              for (WebElement option :alloptions){
//                  if (option.getText().equals("Ethiopia")){
//                      option.click();
//                      break;
//                  }
//              }
//  -------------------------------------------------------------------------------------------------
//        /////////////////// BOOTSTRAP DROUP DOWNS ///////////////


//                System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
//                WebDriver driver = new ChromeDriver();
//                driver.get("https://www.hdfcbank.com/");
//                driver.manage().window().maximize();

        //Select product type
//        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[12]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/a")).click();
//        List<WebElement> lists = driver.findElements(By.xpath("//*[@id=\"main\"]/div[2]/div[12]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/ul/li"));

//        System.out.println(lists.size());

        // select opiton , here since we didnt use input tag , we can use select option

//                for (WebElement ptype : lists){
//                    System.out.println(ptype.getText());  // to see the number of text inside the list or the number of listes
//                    if(ptype.getText().equals("Loans")){
//                        ptype.click();
//                    }
//                }

//
//-----------------------------------------------------------------------------------------------------------------

//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.hdfcbank.com/");
//        driver.manage().window().maximize();

//--------------------------------------------------------------------------------------------------------























    }
}
