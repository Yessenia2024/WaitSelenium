package WaitSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class implicit {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        WebElement boton= driver.findElement(By.id("visibleAfter"));
        if (boton.isDisplayed()){
            System.out.println("Click en el boton");
        }else{
            System.out.println("No hay elemento");
        }

       driver.findElement(By.id("enableAfter")).click();
       driver.findElement(By.id("colorChange")).click();
        //driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        //driver.findElement(By.xpath("//button[@type='Submit']")).click();
    }
}
