import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

    
        WebDriver driver = new ChromeDriver();

      
        driver.manage().window().maximize();

        
        driver.get("https://www.demoblaze.com/");

        
        String pageTitle = driver.getTitle();

         if (pageTitle.equals("STORE")) {
          System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }

        driver.quit();
    }
}
