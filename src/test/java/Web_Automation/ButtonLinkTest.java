package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ButtonLinkTest {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
    }
}