// Import WebDriverManager for automatic WebDriver setup
import io.github.bonigarcia.wdm.WebDriverManager;

// Import By class for locating elements on the web page
import org.openqa.selenium.By;

// Import WebDriver interface from Selenium
import org.openqa.selenium.WebDriver;

// Import ChromeDriver class for working with Google Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

// Define the class named 'findingPartialLinkText'
public class findingPartialLinkText {

    // Main method where execution starts
    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver using WebDriverManager
        // (This automatically downloads and configures the correct ChromeDriver version)
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver to launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window to fit the screen
        driver.manage().window().maximize();

        // Open the home page of the test website
        driver.get("https://the-internet.herokuapp.com");

        // Locate a link by its partial text and click on it
        // Here, it clicks on a link that contains the word "Auth"
        driver.findElement(By.partialLinkText("Auth")).click();

        // Wait for 30 seconds (30000 milliseconds) to observe the result before proceeding
        Thread.sleep(30000);

        // Close the browser and terminate the WebDriver session
        driver.quit();
    }
}
