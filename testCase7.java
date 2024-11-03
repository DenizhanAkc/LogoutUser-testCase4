package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class testCase7 {
    public static void main(String[] args) {
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement visibleCheckHomePage = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        Assert.assertTrue(visibleCheckHomePage.isDisplayed());

        //4. Click on 'Test Cases' button
        WebElement testCasesKutusu = driver.findElement(By.xpath("//a[text()=' Test Cases']"));
        testCasesKutusu.click();

        //5. Verify user is navigated to test cases page successfully
        WebElement visibleCheckTestCasePage = driver.findElement(By.xpath("//u[text()='Test Case 1: Register User']"));
        Assert.assertTrue(visibleCheckTestCasePage.isDisplayed());

        driver.close();

    }
}