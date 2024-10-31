package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest {
    private WebDriver driver;

    @Test
    public void testNavigation() {
        driver.get("https://example.com");

        WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
        aboutUsLink.click();

        WebElement aboutUsHeader = driver.findElement(By.tagName("h1"));
        Assert.assertEquals(aboutUsHeader.getText(), "About Us", "Page header should be 'About Us'");
    }
}
