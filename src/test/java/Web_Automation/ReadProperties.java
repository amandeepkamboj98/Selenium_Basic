
// read the properties file to get the url and username and other data

package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();

        Properties prop= new Properties(); // object of properties class(inbuilt class of java)
        FileInputStream file= new FileInputStream("C:\\Users\\parde\\Downloads\\untitled\\TestDataProperties"); // file reader and pass location of file
        prop.load(file); // load the file use of load method
       // prop.getProperty("url"); // get the file use of get method
        System.out.println(prop.getProperty("url")); // get url at runtime
        System.out.println(prop.getProperty("username")); // get username at run time
        String Vurl= prop.getProperty("url");
        String Vusername = prop.getProperty("username");
        driver.get( Vurl );

        WebElement ele=driver.findElement(By.name(prop.getProperty("locusername")));
        ele.sendKeys(Vusername);  // for this step maintenance would be easy

        //driver.findElement(By.name("email")).sendKeys(Vusername);

        FileOutputStream out=new FileOutputStream("C:\\Users\\parde\\Downloads\\untitled\\TestDataProperties");
        prop.setProperty("password","abcdef");
        prop.store(out,"comments");

    }
}
