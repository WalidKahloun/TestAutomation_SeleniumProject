import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.navigate().to("https://github.com/WalidKahloun");
        String githubUrl = driver.getCurrentUrl();
        System.out.println(" github is:" + githubUrl);
        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        System.out.println(" Google url is" + googleUrl);

        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.quit();
    }
}
