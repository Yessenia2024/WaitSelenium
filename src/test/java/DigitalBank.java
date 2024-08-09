import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DigitalBank {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new EdgeDriver();
        driver.get("http://dbankdemo.com/bank/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }

}
