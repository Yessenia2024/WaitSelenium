import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProtoCommerce {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Yessenia");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Yesseniafiorela@gmail.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        WebElement selectElement = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("10/12/1985");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();




       // driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
       // driver.findElement(By.xpath("//button[@type='Submit']")).click();
    }
}
