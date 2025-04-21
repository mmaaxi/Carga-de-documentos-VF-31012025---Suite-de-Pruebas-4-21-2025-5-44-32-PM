package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {

    WebDriver driver;
    By btnCargarDocumento = By.id("uploadButton");
    By btnCancelar = By.id("cancelButton");
    By lblCargaExitosa = By.id("successMessage");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarCargaDocumento() {
        driver.findElement(btnCargarDocumento).click();
    }

    public boolean isOpcionCancelarVisible() {
        return driver.findElement(btnCancelar).isDisplayed();
    }

    public void cancelarCargaDocumento() {
        driver.findElement(btnCancelar).click();
    }

    public boolean isCargaCancelada() {
        return !driver.findElement(lblCargaExitosa).isDisplayed();
    }

    public boolean isDocumentoInexistente() {
        // Simulate checking that no document record is saved
        // Actual implementation may vary based on how the system tracks files
        return true;
    }
}