package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScript_Exe {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();

       driver.get("https://demo.opencart.com/");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;  //casting driver converting webDriver object into javaScript Executor interface
        // js.executeScript("window.location='http://google.com'");// through javaScript we can open url of site
           // js.executeAsyncScript() // another javaScript method
        //Thread.sleep(10000);
       // js.executeScript("window.scrollTo(0,300)"); // scrollbar go from top to middle
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //scrollbar go from top to down
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");// scrollbar go from bottom to up

    }
}
