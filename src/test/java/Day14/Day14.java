package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14 {
    //    selenium have three components
//               selenium webdriver
//               selenium IDE
//               selenium Grid


//  selinium webdriver is one of the component in selinium
//   WEBDRIVER is a java interface (interface contains final and static variables , interface contains
//   abstract,default and static method, interface is implimented by some other classes.

// interface WEBDRIVER {
//    VARIABLE
//    ABSTARACT METHODS
//}
// fireFox browser -----> Firefox driver  እነዚ ድራይቨሮች ኢንተርፌሱ ኢምፕሊመንት የተደረገባቸው ክላሶች ናቸው።
//።   chrome browser ------> chromeDriver
//    edge browser ------>edge driver

// WEBDRIVER IS AN API ALSO!! API (APPLICATION PROGRAMMING INTERFACE)
//
    /*
    Srchitecture of webdrivers

    selinium language binding----w3c-->browser driver ----w3c-----> browser       in selinium 4.x
    selinium language binding----json-->browser driver ----w3c-----> browser       in selinium 3.x
    */
public static void main(String[] args) throws InterruptedException {
    /*
    Test case
---------
1) Open Web Browser(Chrome/firefox/Edge).
2) Open URL  https://opensource-demo.orangehrmlive.com/
3) Enter username  (Admin).
4) Enter password  (admin123).
5) Click on Login.
6) Capture title of the home page.(Actual title)
7) Verify title of the page: OrangeHRM    (Expected)
8) close browser

     */
//    SOLUTION
    //STEP 1 - OPEN WEB BROSER
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dubnation\\Desktop\\For QA resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
      //  WebDriver driver = new ChromeDriver();  // this is also correct since webdriver is interface.
   // STEP 2 - open url in the broser
           driver.get("https://opensource-demo.orangehrmlive.com/");
  // STEP 3 - ENTER USER NAME
           WebElement usernametext=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
           Thread.sleep(2000);
           usernametext.sendKeys("Admin");
           Thread.sleep(2000);
   //STEP 4 - ENTER PASSWORD
    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
    Thread.sleep(2000);
   //STEP 5 - CLICK ON LOGIN
    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
    // STEP 6 - CAPTURE TITILE OF THE HOME PAGE
    String title = driver.getTitle();
    // STEP 7 - VERIFICATION OF TITLE
    if(title.equals("OrangeHRM")){
        System.out.println("the title is correct");
    }else{
        System.out.println("the title is wrong");
    }
    // STEP 8- CLOSE THE PAGE
       driver.close();
}
}
