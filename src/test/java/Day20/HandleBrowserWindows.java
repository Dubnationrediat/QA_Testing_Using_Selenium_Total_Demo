package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {

    // አንድ ዊንዶ ከፍተን በዛው አልፈን ሌላ ዊንዶ ከከፈትን በሁዋላ ሁለቱም ላይ ስራ ለመስራት ስዊች እያረጉ ማለት ነው ይቻላልይ። ያ ሚቻለው ደግሞ
    // የዊንዶውን አይዲ ካወቅን ነው።
    // ያንን አይዲ ለማግኘት ደግሞ እነዚን እንጠቀማለን

            //driver.getWindowHandle() --> returns the window ID of current window
            //driver.getWindowHandles() --> returns teh window ID's of multiple browser windows
    // ከዛ በመቀጥል ስዊችን በመጠቀም ከአዱ ወደ አንዱ ስዊች ማረግ ይቻላል።
           // driver.switchTo().window() .. ከዛ ውስጡ ኢይዲ እንከታለን ማለት ነው።
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //---------------------------------------------------------------
//               String windowID = driver.getWindowHandle();
//                System.out.println(windowID); // ኢይዲ ደግሞ ዳይናሚክ ነው በየራን ታይም ይቀያየራል
//        ይሄ ያው አንድ ወይም ሲንግል ፔጅ ሲሆን አይዲ ለማግኘት ነው ነገር ግን ብዙም ጥቅም የለውም ስለዚ የመልቲፕል ዊንዶ እንይ
        //-------------------------------------------------------------------
            driver.findElement(By.linkText("OrangeHRM, Inc")).click();
            Set<String> windowsID = driver.getWindowHandles();   // ሴት ኮሌክሽን ነው ምንጠቀመው ሊስት አይሆንም ለምን ቢብላ ኢይዲ ዮኒክ ስለሆነ እና ሴት ኮማንድ ደግሞ ድግግሞሽ አይፈቅድም
        //-------------
        // Approach1

            // widowsID ሁሉንም አይዲ ይዞ መቶዋል
           // set ውስጥ ደግም get ስለማይሰራ እያንዳንዱን ለማግኘት ከፈለግን ወደ ሊስት ታይፕ መቀየር አለብን
                  List<String> windowIDsList = new ArrayList(windowsID);
                  windowIDsList.get(0);   // this will give us the parent window
                  windowIDsList.get(1);   // this wil give us the child window
        // to see them in console
                  String ParentWindowId =  windowIDsList.get(0);
                  String childWindowId =  windowIDsList.get(1);
                            System.out.println(ParentWindowId);
                            System.out.println(childWindowId);
                            // to switch to windows we use the follwong method
        driver.switchTo().window(childWindowId);
        System.out.println("thitle of the parent page :"+ driver.getTitle());

        driver.switchTo().window(childWindowId);
        System.out.println("thitle of the parent page :"+ driver.getTitle());
//Aproach2 - using looping statement
          for(String winid :windowIDsList ){
              System.out.println(winid);
              System.out.println(driver.switchTo().window(winid).getTitle());
          }

// to close the windows besd on your choice
         // remeber that to close single window we use a close() method and for multiple we use quit()
        // but to close a specific window

        for(String winid :windowIDsList ){
            String title = driver.switchTo().window(winid).getTitle();
            if (title.equals("OrangeHRM")){
                driver.close();
            }
        }

    }
}
