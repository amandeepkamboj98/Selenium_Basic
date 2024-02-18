package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class CheckBoxProperty {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
       //driver.findElement(By.linkText("Checkboxes")).click();

        List<WebElement> list1=driver.findElements(By.linkText("Checkboxes")); // findElements are used to find group of similar kind of element
        list1.get(0).click();
        System.out.println(list1.size());

       //driver.findElement(By.xpath("//input[@type='checkbox']")).click();//we use findElements than, we unable to use click method

        List<WebElement> list= driver.findElements(By.xpath("//input[@type='checkbox']")); //we have more same properties, than it looks like a list
        list.get(0).click();          // and fins findElements return a List<WebElement> now all elements store in a list variable
        System.out.println(list.size());
    }

}
