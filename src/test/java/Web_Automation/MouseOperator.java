package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperator {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://sellglobal.ebay.in/seller-center/");
        System.out.println("Setup Completed");
        driver.manage().window().maximize();

        Actions act=new Actions(driver); //driver converting webDriver object into Action class
                                    // pass driver because Actions class to get know where operation perform
        act.moveToElement(driver.findElement(By.className("ekit-menu-nav-link"))).build().perform(); //  mouse click on About Us feature by self

        // build().perform() methods are used to move the element and used in to complete the operation. every operation under the Actions class
    System.out.println("Amandeep....");
    }
}
