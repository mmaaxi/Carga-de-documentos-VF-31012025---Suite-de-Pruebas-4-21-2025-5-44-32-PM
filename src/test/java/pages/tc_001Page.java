package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {
    private WebDriver driver;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "fileDialog")
    private WebElement fileDialog;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void clickUploadButton() {
        uploadButton.click();
    }

    public boolean isFileDialogDisplayed() {
        return fileDialog.isDisplayed();
    }

    public void selectValidPdfDocument() {
        // Simulate the file selection action with a valid PDF
        // This functionality may require a different approach depending on the driver and framework configuration
    }

    public boolean isDocumentRecognized() {
        // Logic to check if document is recognized successfully
        return true; // placeholder for actual implementation
    }

    public void confirmUpload() {
        confirmButton.click();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}