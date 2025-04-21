package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;
    
    // Elementos en la página
    By uploadButton = By.id("upload-button-id");
    By fileInput = By.id("file-input-id");
    By errorMessage = By.id("error-message-id");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }
    
    public void selectFileExceedingSizeLimit() {
        // Implementar lógica para seleccionar un archivo demasiado grande
        driver.findElement(fileInput).sendKeys("/path/to/large/file");
    }
    
    public void attemptToUploadFile() {
        // Implementación para intentar cargar el archivo
    }

    public void verifyErrorMessageDisplayed() {
        // Verificar que el mensaje de error se muestra
        if (driver.findElement(errorMessage).isDisplayed()) {
            System.out.println("Error message is displayed as expected.");
        }
    }
}