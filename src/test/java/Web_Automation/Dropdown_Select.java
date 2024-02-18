// work with dropdown then we create object of select class

package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
       // driver.navigate().to("https://the-internet.herokuapp.com/"); // also used navigate method to launch the url
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dropdown")).click();

        Select sel=new Select( driver.findElement(By.id("dropdown"))); // under the select class
       // sel.selectByVisibleText("Option 1"); //select frontend value from the html code
        // sel.selectByValue("2"); //select value from the html code
        sel.selectByIndex(2); //select value base on index position
    }
}