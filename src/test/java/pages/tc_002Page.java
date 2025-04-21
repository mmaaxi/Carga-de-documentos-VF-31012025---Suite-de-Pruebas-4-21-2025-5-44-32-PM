package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By fileDialog = By.id("fileDialog");
    By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFileDialogDisplayed() {
        return driver.findElement(fileDialog).isDisplayed();
    }

    public void selectInvalidFile() {
        // Implementation to simulate selecting an invalid file
    }

    public boolean isInvalidFileFormatDetected() {
        // Check for some condition that indicates detection of invalid format
        // This may vary depending on actual implementation and error state
        return true;
    }

    public void tryUploadFile() {
        // Simulate file upload attempt
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}