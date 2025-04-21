package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    private By uploadInput = By.id("uploadInput");
    private By duplicateWarning = By.id("duplicateWarning");
    private By documentList = By.id("documentList");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        // Implementación del login
    }

    public void navigateToUploadPage() {
        // Implementación de la navegación a la página de carga
    }

    public void uploadDocument(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isDuplicateDetected() {
        // Implementar lógica para verificar duplicidad (e.g., verificar mensaje en la interfaz)
        return driver.findElement(duplicateWarning).isDisplayed();
    }

    public boolean isDuplicateErrorDisplayed() {
        // Implementar lógica para verificar que el mensaje de advertencia se muestra
        return driver.findElement(duplicateWarning).isDisplayed();
    }

    public boolean isDuplicateSaved() {
        // Implementar lógica para verificar que el documento no se haya guardado nuevamente
        return driver.findElements(documentList).stream().filter(e -> e.getText().equals("existing_document.pdf")).count() > 1;
    }
}