package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {

    @Test
	public void Takealot_reg() throws InterruptedException {

        // Test code here
        String name = "Luckson M";
        String lastname = "Test";
        String email = "lucksonm@qotsolutions.co.za";
        String password = "Takealot@20";
        String newNumber = "780090002";
        String countryCode = "ZW (+263)";

        // Setting up Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luckson\\Documents\\chromedriver.exe");
        WebDriver driver = (WebDriver) new ChromeDriver();

        // Open takealot site
        driver.get("https://www.takealot.com/");
        // Maximize current window
        driver.manage().window().maximize();
        // Check if the "Got It" pop-up is present


        try {
            WebElement popupElement = driver.findElement(By.xpath("//button[normalize-space()='Got it']"));

            // Click the "Got It" button if it's present
            if (popupElement.isDisplayed()) {
                popupElement.click();
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Handle the case when the pop-up is not present
            System.out.println("No pop-up found. Continuing execution.");
        }

        // Check if the "Promotional" pop-up is present
        try {
            WebElement popupElement1 = driver.findElement(By.xpath("//button[normalize-space()='NOT NOW']"));
            // Click the "Promotional" button if it's present
            if (popupElement1.isDisplayed()) {
                popupElement1.click();
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Handle the case when the pop-up is not present
            System.out.println("No pop-up1 found. Continuing execution.");
        }


        // Click on register button
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        Thread.sleep(5000);
        // Fill in registration form
        driver.findElement(By.xpath("//input[@id='register_customer_first_name']"))
                .sendKeys(name);
        driver.findElement(By.xpath("//input[@id='register_customer_last_name']"))
                .sendKeys(lastname);
        driver.findElement(By.xpath("//input[@id='register_customer_email']"))
                .sendKeys(email);
        driver.findElement(By.xpath("//input[@id='register_customer_new_password']"))
                .sendKeys(password);
        // Scroll down the pop up window
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");

        // Check if the "Promotional" pop-up is present
        try {
            WebElement popupElement1 = driver.findElement(By.xpath("//button[normalize-space()='NOT NOW']"));
            // Click the "Promotional" button if it's present
            if (popupElement1.isDisplayed()) {
                popupElement1.click();
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Handle the case when the pop-up is not present
            System.out.println("No pop-up1 found. Continuing execution.");
        }


        driver.findElement(By.xpath("//select[@id='register_customer_mobile_country_code']"))
                .click();
        Thread.sleep(3000);
        // Locate the drop down element by its XPath
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='register_customer_mobile_country_code']"));
        // Create a Select object from the drop down element
        Select dropdown = new Select(dropdownElement);

        // Select the option by visible text
        dropdown.selectByVisibleText(countryCode);

        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='register_customer_mobile_national_number']"))
                .sendKeys(newNumber);
        driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
        //closing the OTP pop up
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='modal-module_close-button_asjao']"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Exit']")).click();
    }

    @Test
	public static void main(String[] args) throws InterruptedException {
        // This is your main method
        // You can call the Takealot_reg() method from here if needed
        //Takealot takealot = new Takealot();
        //takealot.Takealot_reg();
    }
}

