package advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/menu#");
        driver.manage().window().maximize();

        // List<WebElement> element = driver.findElements(By.xpath("(//div[@class='element-group'])[1])"));
        driver.findElement(By.id("item-4")).click();


        System.out.println("Welcome");
    }
}
