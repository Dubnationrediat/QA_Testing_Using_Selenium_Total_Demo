package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandelingCheckBox {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\Craft education\\QA\\For QA resources\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();

//        select a specific checkbox
        driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
        // to select all at once
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

//        to know the size we can use size method

//                 System.out.println(checkboxes.size()); // will return 7

//                    for (int i = 0; i < checkboxes.size() ; i++) {
//                        checkboxes.get(i).click();
//                    }

        // by using inhanced loop

//                        for(WebElement ele : checkboxes){
//                            ele.click();
//                        }
// select multiple check boxes by choice

//           for(WebElement ele : checkboxes){
//               String value = ele.getAttribute("id");
//               if(value.equals("mondat")||value.equals("sunday")){
//                   ele.click();

//               }
//           }
// if we want the last two or three boxes
        // Starting index will be 	count of elements-2. i.e.
        //if there are 7 check  boxes, you need to go (7-2)=5th index
//                    for (int i = checkboxes.size()-2 ; i < checkboxes.size() ; i++) {
//                        checkboxes.get(i).click();
//                    }

// if we want to select the first two checkboxes
//                for (int i = 0; i <checkboxes.size() ; i++) {
//                    if (i<2){
//                        checkboxes.get(i).click();
//                    }
//
//                }
   // clearing check boxes
//                       for(WebElement ele : checkboxes){
//                           ele.click();
//                       }
//                        for(WebElement ele : checkboxes){
//                            ele.click();
//                        }
    }
}
