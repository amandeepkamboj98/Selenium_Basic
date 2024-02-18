package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/"); // also used navigate method to launch the url

        // if we have to perform forward and backward operation on the browser than we used launch the browser by using navigate method

        System.out.println("Setup Complete");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dropdown")).click();
    }
}