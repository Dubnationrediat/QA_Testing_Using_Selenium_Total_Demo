package Day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autonticationAlert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dubnation\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // አንዳንድ ዌብሳይቶች አውተንቲኬሽን የሚጠይቁ አሉ እና እነሱን ባይፓስ ነው ማረግ ምንችለው ያንን ምናረገው ደግሞ
        // ዮዘር ኔም እና ፓስ ወርድ ተጠቅመን ነው። ኮማንዱም የሚከተለውን ከዮአራኤል በፊት በማስገባት ነው።
        //driver.get("https://username:password@url.com
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
