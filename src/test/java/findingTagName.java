// Import WebDriverManager for automatic WebDriver setup
import io.github.bonigarcia.wdm.WebDriverManager;

// Import By class for locating elements on the web page
import org.openqa.selenium.By;

// Import WebDriver interface from Selenium
import org.openqa.selenium.WebDriver;

// Import WebElement class for interacting with elements on a web page
import org.openqa.selenium.WebElement;

// Import ChromeDriver class for working with Google Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

// Import List to work with lists of elements (in this case, table rows)
import java.util.List;

public class findingTagName {

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

        // Find the link with the text "Sortable Data Tables" and click it
        driver.findElement(By.linkText("Sortable Data Tables")).click();

        // Find the table element with the id "table1"
        WebElement table = driver.findElement(By.id("table1"));

        // Find all rows of the table using the tag name "tr" (table rows)
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));

        // Print the total number of rows in the table
        System.out.println(tableRows.size());

        // Print the text content of the first 5 rows of the table
        System.out.println(tableRows.get(0).getText());
        System.out.println(tableRows.get(1).getText());
        System.out.println(tableRows.get(2).getText());
        System.out.println(tableRows.get(3).getText());
        System.out.println(tableRows.get(4).getText());
    }
}

