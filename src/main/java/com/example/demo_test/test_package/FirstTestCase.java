package com.example.demo_test.test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
    public static void main(String[] args) {
        // 1. Launch Firefox Web Browser
        WebDriver driver = new FirefoxDriver();

        // 2. Open Web page www.google.com
        driver.get("https://www.google.com");

        // 3. Capture Title of Web page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // 4. Capture URL of Web page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // 5. Capture page source
        String pageSource = driver.getPageSource();
        // Printing just the first 150 characters so it doesn't flood your console
        System.out.println("Page Source Snippet: " + pageSource.substring(0, 150) + "..."); 

        // Close the browser to clean up
        driver.quit();
    }
}
