package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest {
    private WebDriver driver;

    @Test
    public void testSearch() {
        driver.get("https://example.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.id("searchButton"));

        searchBox.sendKeys("selenium");
        searchButton.click();

        WebElement searchResult = driver.findElement(By.id("searchResults"));
        Assert.assertTrue(searchResult.getText().contains("selenium"), "Search results should contain 'selenium'");
    }
}
