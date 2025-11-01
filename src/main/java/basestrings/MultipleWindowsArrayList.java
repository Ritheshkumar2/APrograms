package basestrings;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsArrayList {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com"); // Replace with your URL

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
        
     // Get all window handles and convert to ArrayList
       // ArrayList<String> windowsList = new ArrayList<>(driver.getWindowHandles())
        // Switch directly to the 3rd window (index 2)
        //driver.switchTo().window(windowsList.get(2));
        
        // Click a button that opens multiple windows
        wait.until(ExpectedConditions.elementToBeClickable(By.id("openWindowsBtn")));
        driver.findElement(By.id("openWindowsBtn")).click();

        // Store parent window handle
        String parentWindow = driver.getWindowHandle();

        // Get all window handles and convert to ArrayList
        Set<String> windowHandlesSet = driver.getWindowHandles();
        ArrayList<String> windowsList = new ArrayList<>(windowHandlesSet);

        System.out.println("Total windows opened: " + windowsList.size());

        // Loop through all child windows starting from index 1
        for (int i = 1; i < windowsList.size(); i++) { // index 0 is parent
            driver.switchTo().window(windowsList.get(i));
            System.out.println("Switched to window: " + driver.getTitle());

            // Perform actions based on window
            if (driver.getTitle().contains("Form")) {
                driver.findElement(By.id("name")).sendKeys("John Doe");
                driver.findElement(By.id("submit")).click();
            } else if (driver.getTitle().contains("Popup")) {
                System.out.println("Closing popup window: " + driver.getTitle());
            } else {
                System.out.println("Other window: " + driver.getCurrentUrl());
            }

            // Close the child window after actions
            driver.close();
        }

        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to parent window: " + driver.getTitle());

        // Continue actions in parent window
        driver.quit();
    }
}
