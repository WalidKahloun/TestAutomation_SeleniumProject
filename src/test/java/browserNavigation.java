// Import WebDriverManager for automatic WebDriver setup
import io.github.bonigarcia.wdm.WebDriverManager;

// Import WebDriver interface from Selenium
import org.openqa.selenium.WebDriver;

// Import ChromeDriver class for working with Google Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

// Define a public class named 'browserNavigation'
public class browserNavigation {

    // Main method where the execution starts
    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver using WebDriverManager (automatically downloads the required driver)
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver to launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window (fullscreen mode)
        driver.manage().window().fullscreen();

        // Open Google homepage
        driver.get("https://google.com");

        // Navigate to a specific GitHub profile
        driver.navigate().to("https://github.com/WalidKahloun");

        // Get the current URL (GitHub) and print it
        String githubUrl = driver.getCurrentUrl();
        System.out.println("GitHub is: " + githubUrl);

        // Navigate back to the previous page (Google)
        driver.navigate().back();

        // Get the current URL (Google) and print it
        String googleUrl = driver.getCurrentUrl();
        System.out.println("Google URL is: " + googleUrl);

        // Wait for 2 seconds (2000 milliseconds) before proceeding
        Thread.sleep(2000);

        // Refresh the current page
        driver.navigate().refresh();

        // Navigate forward (back to GitHub)
        driver.navigate().forward();

        // Wait for 1 second before closing the browser
        Thread.sleep(1000);

        // Close the browser and terminate the WebDriver session
        driver.quit();
    }
}
