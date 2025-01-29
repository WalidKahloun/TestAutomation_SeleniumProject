// Import WebDriverManager for automatic WebDriver setup
import io.github.bonigarcia.wdm.WebDriverManager;

// Import By class for locating elements on the web page
import org.openqa.selenium.By;

// Import WebDriver interface from Selenium
import org.openqa.selenium.WebDriver;

// Import ChromeDriver class for working with Google Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

// Define a public class named 'FindingLinkText'
public class FindingLinkText {

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

        // Locate the link using its visible text and click on it
        // This will navigate to the "Form Authentication" login page
        driver.findElement(By.linkText("Form Authentication")).click();

        // Locate the username input field using its ID and enter the username "tomsmith"
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        // Locate the password input field using its Name attribute and enter the password "SuperSecretPassword!"
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        // Locate the login button using its class name and click on it
        driver.findElement(By.className("radius")).click();

        // Wait for 2 seconds (2000 milliseconds) to observe the result before proceeding
        Thread.sleep(2000);

        // Close the browser and terminate the WebDriver session
        driver.quit();
    }
}
