package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox_SameProperty_WebElement {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
     //   driver.findElement(By.linkText("Checkboxes")).click(); // perform in both the way
        WebElement web=driver.findElement(By.linkText("Checkboxes")); //findElement() returns WebElement
        web.click();  // store in a variable then click()
    }
}