import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class WikipediaSearch {
    public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();

        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       
        driver.get("https://www.wikipedia.org/");      
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("Artificial Intelligence");
        searchBox.sendKeys(Keys.RETURN);
    
   
            Thread.sleep(3000);
        

        WebElement historyLink = driver.findElement(By.linkText("History"));
        historyLink.click();

        
        String sectionTitle = driver.getTitle();
        System.out.println("Title of the 'History' section: " + sectionTitle);
        driver.quit();
    }
}
