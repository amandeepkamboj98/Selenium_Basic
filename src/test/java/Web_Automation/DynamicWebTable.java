package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class DynamicWebTable {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("E:\\WbTable.html");
        // driver.get("C:\\Users\\parde\\OneDrive\\Desktop\\Table.html");// another table
        System.out.println("Setup Complete");
        driver.manage().window().maximize();

        List<WebElement> lst = driver.findElements(By.xpath("/html/body/table/tbody/tr")); // for row
        List<WebElement> lst1 = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/th")); //for table

        int row = lst.size();  // size of row
        int column = lst1.size();// size of column

        System.out.println(row); //print size of row
        System.out.println(column); //print size of column

        for (int i = 3; i <= row; i++) {
            for (int j = 1; j <= column; j++) {  // we store the value of row and column in i and j for dynamic value
                System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[" + j + "]")).getText());
            }
        }
    }
}