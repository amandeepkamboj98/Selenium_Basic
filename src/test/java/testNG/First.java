package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class First {

    public WebDriver driver;

    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("Execute Before Suite");
    }

    @AfterSuite
    public void aftersuite()
    {
        System.out.println("Execute After Suite");
    }

    @BeforeTest
    public void befortest()
    {
        System.out.println("Execute Before Test/project");

    }

    @AfterTest
    public void aftertest(){
        System.out.println("Execute After Test/project");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("Execute Before First Class");
    }

    @AfterClass
    public void afterclass()
    {
        System.out.println("Execute After First Class");
    }


    @Test()
    public void secondtestcase()
    {
        System.out.println("Second test case of TestNGmaven ");
    }

    @Test()
    public void thirdtestcase()
    {
        System.out.println("Third test case of TestNGmaven ");

    }

    @Test()
    public void firsttestcase()
    {
        System.out.println("First test case of TestNGmaven ");
    }
}