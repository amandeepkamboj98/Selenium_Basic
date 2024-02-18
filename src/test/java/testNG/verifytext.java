package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class verifytext {

    public WebDriver driver;

    @BeforeTest
    public void befortest(){
        System.out.println("Execute Before Test/project");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("Execute After Test/project");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("Execute Before Verifytext Class");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("Execute After Verifytext Class");
    }


    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        //System.out.println(System.getProperty("user.dir"));
        driver = (WebDriver) new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        System.out.println("Setup Complete");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
        System.out.println("Teardown Complete");
    }

    @Test
    public void textverify(){
        //System.setProperty("web-driver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");

        String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();

        Assert.assertEquals(val,"Your Store");  //hard Assert

        // SoftAssert as=new SoftAssert(); // soft assert
        //as.assertEquals(val,"Your Store1");
        //String err_val=as.toString();// to catch error
        //System.out.println("Soft Assert is Executed "+err_val);
        System.out.println("VerifyText Test Case Passed");

    }

    @Test
    public void login() {
        //System.setProperty("web-driver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");

        driver.findElement(By.xpath("//span[@class='caret']")).click();
        driver.findElement(By.linkText("Login")).click();
        System.out.println("Login VerifyText Test Case Passes");
    }

    @Test
    public void login_Linkverify() {
        //System.setProperty("web-driver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");

        driver.findElement(By.xpath("//span[@class='caret']")).click();
        boolean isdisplayed= driver.findElement(By.linkText("Login")).isDisplayed();
        Assert.assertTrue(isdisplayed);
        System.out.println("Login Link VerifyText Test Case Passes");
    }
}

