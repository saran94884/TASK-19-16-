import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAutomation {
    public static void main(String[] args) {
        
   	WebDriverManager.FirefoxDriver().setup();

      
        WebDriver driver = new FirefoxDriver();


        driver.manage().window().maximize();


        driver.get("http://google.com");


        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

       
        driver.navigate().refresh();

  
        Thread.sleep(5000);
       
      
        driver.quit();
    }
}
