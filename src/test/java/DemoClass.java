import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoClass {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new EdgeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[onclick=\"byCat('notebook')\"]")).click();

    }
}
