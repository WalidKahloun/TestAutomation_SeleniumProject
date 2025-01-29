// Import WebDriverManager for automatic WebDriver setup
import io.github.bonigarcia.wdm.WebDriverManager;

// Import WebDriver interface from Selenium
import org.openqa.selenium.WebDriver;

// Import ChromeDriver class for working with Google Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

// Define a public class named 'getPageTitle_Source'
public class getPageTitle_Source {

    // Main method where execution starts
    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver using WebDriverManager
        // (This automatically downloads and configures the correct ChromeDriver version)
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver to launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window to fit the screen
        driver.manage().window().maximize();

        // Open Google homepage
        driver.get("https://google.com");

        // Get the title of the Google homepage
        String googleTitle = driver.getTitle();

        // Print the Google page title to the console
        System.out.println("Google title is: " + googleTitle);

        // Get the entire HTML source code of the Google homepage
        String googleSource = driver.getPageSource();

        // Print the Google page source (HTML content)
        System.out.println(googleSource);

        // Navigate to a specific GitHub profile
        driver.navigate().to("https://github.com/WalidKahloun");

        // Get the title of the GitHub profile page
        String githubTitle = driver.getTitle();

        // Print the GitHub page title to the console
        System.out.println("GitHub title is: " + githubTitle);

        // Get the entire HTML source code of the GitHub profile page
        String githubSource = driver.getPageSource();

        // Print the GitHub page source (HTML content)
        System.out.println(githubSource);

        // Close the browser and terminate the WebDriver session
        driver.quit();
    }
}

