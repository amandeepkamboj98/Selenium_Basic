package advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroniz {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        //	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
        //driver.findElement(By.id("H-destination")).sendKeys("nyc");
        driver.manage().window().maximize();
        driver.findElement(By.className("clear-btn-input")).sendKeys("Delhi");
        driver.findElement(By.className("clear-btn-input")).sendKeys(Keys.ENTER);

        driver.findElement(By.className("gcw-distinct-locations)2")).sendKeys("Mumbai");
        driver.findElement(By.className("(gcw-distinct-locations)2")).sendKeys(Keys.ENTER);
        WebDriverWait d=new WebDriverWait(driver,20);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
        //Thread.sleep(5000L);

        driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();

    }
}
