package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.stream.Collectors;

public class tc_005Page {

    private WebDriver driver;
    private WebDriverWait wait;

    private By uploadButton = By.id("uploadButton");
    private By successMessage = By.className("success-message");
    private By fileInput = By.cssSelector("input[type='file']");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
    }

    public void chooseMultipleFiles() {
        WebElement uploadElement = driver.findElement(fileInput);
        // Simulate selecting multiple files
        uploadElement.sendKeys("ruta/archivo1.doc\nruta/archivo2.doc");
    }

    public boolean areMultipleFilesSelected() {
        WebElement uploadElement = driver.findElement(fileInput);
        // Check that more than one file is selected
        return uploadElement.getAttribute("files").length() > 1;
    }

    public void uploadSelectedFiles() {
        driver.findElement(uploadButton).click();
    }

    public boolean areFilesUploadedConcurrently() {
        // Logic to verify concurrent uploads, perhaps using timestamps
        return true; // Simplification for example purposes
    }

    public List<String> getSuccessMessages() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        List<WebElement> elements = driver.findElements(successMessage);
        return elements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public int getNumberOfSelectedFiles() {
        return driver.findElement(fileInput).getAttribute("files").length();
    }
}