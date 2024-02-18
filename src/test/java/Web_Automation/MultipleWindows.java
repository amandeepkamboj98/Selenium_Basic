package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup Completed");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> set = driver.getWindowHandles();

       // Iterator <String> itr=set.iterator(); // read value to set we use iterator
        //while(itr.hasNext()){
        //String childWindow=itr.next();

        for (String childWindow : set) {

            // System.out.println(itr.next());

            if (!parent.equals(childWindow)) {
                driver.switchTo().window(childWindow);// switch parent window to child window, when have multiple window
                System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
                driver.switchTo().window(parent); // switch child window to parent window
            }
        }
    }
}
