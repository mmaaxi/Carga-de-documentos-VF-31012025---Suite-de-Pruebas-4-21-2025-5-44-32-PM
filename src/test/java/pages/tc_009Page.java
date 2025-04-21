package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class tc_009Page {
    
    WebDriver driver;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void subirDocumento() {
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.sendKeys("path_al_documento_valido");
    }

    public void calcularChecksum() {
        WebElement calcularButton = driver.findElement(By.id("calcularChecksum"));
        calcularButton.click();
    }

    public boolean verificarIntegridad() {
        String originalChecksum = "checksum_original";
        WebElement checksumField = driver.findElement(By.id("checksumField"));
        return originalChecksum.equals(checksumField.getText());
    }

    public boolean registrarValidacion() {
        WebElement registrarButton = driver.findElement(By.id("registrarValidacion"));
        registrarButton.click();
        WebElement mensajeExito = driver.findElement(By.id("mensajeExito"));
        return mensajeExito.isDisplayed();
    }
}