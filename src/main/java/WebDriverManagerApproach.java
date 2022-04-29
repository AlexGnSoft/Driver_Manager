import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerApproach {
    public static void main(String[] args) {

        /**
         * By adding WebDriverManager dependencies :
         * 1) No need to download webdriver and adding it to resources and giving it's path
         * 2) No need add 'System.setProperty()' at all.
         * 'WebDriverManager' will start the latest webdriver by itself.
         */

        WebDriverManager.chromedriver().setup();
//      WebDriverManager.firefoxdriver().setup();  //use it when you run FireFox
//      WebDriverManager.operadriver().setup();    //use it when you run Opera

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.close();
    }
}
