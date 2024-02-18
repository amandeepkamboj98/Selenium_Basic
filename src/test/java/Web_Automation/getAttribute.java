package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
        System.out.println("Setup Completed by Aman");
        driver.findElement(By.name("email")).sendKeys("Amandeep");
        String actualVAlue= driver.findElement(By.name("email")).getAttribute("value"); // fetch the runtime value
        System.out.println(actualVAlue);

        if(actualVAlue.equals("Amandeep")){
            System.out.println("Test case is passed");
        }
        else{
            System.out.println("test case is failed");
        }
    }
}