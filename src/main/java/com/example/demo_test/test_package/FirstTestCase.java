package com.example.demo_test.test_package;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


public class FirstTestCase {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {

        Thread.sleep(2000);
        WebElement username = driver.findElement(ByIdOrName.name("username"));
        username.sendKeys("Admin");
        var password  = driver.findElement(ByIdOrName.name("password"));
        password.sendKeys("admin123");

        driver.findElement(ByIdOrName.tagName("button")).click();
    }


}
