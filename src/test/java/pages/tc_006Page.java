package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

    WebDriver driver;

    By inputFileSelector = By.id("inputFile");
    By uploadButton = By.id("uploadBtn");
    By errorMessage = By.id("errorMsg");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFileWithMaliciousMetadata() {
        WebElement fileInput = driver.findElement(inputFileSelector);
        fileInput.sendKeys("/path/to/maliciousFile.docx");
    }

    public void tryUploadDocument() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click();
    }

    public void verifyMetadataAnalysis() {
        // Implementation to ensure system analyzed metadata (e.g., observe logs, backend checks)
    }

    public void verifyInjectionDetectionAndRejection() {
        // Implementation to ensure detection of malicious content and upload rejection
    }

    public void verifyErrorMessageDisplayed() {
        WebElement errorMsg = driver.findElement(errorMessage);
        assert errorMsg.isDisplayed() : "Error message not displayed";
        assert errorMsg.getText().contains("contenido malicioso") : "Error message does not mention malicious content";
    }
}