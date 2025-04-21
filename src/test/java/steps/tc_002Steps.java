package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver = new ChromeDriver();
    tc_002Page page = new tc_002Page(driver);

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToUploadPage();
    }

    @When("El usuario selecciona el botón 'Cargar documento'")
    public void elUsuarioSeleccionaElBotonCargarDocumento() {
        page.clickUploadButton();
    }

    @Then("Se despliega el diálogo de selección de archivos")
    public void seDespliegaElDialogoDeSeleccionDeArchivos() {
        Assert.assertTrue(page.isFileDialogDisplayed());
    }

    @When("El usuario elige un archivo con formato inválido")
    public void elUsuarioElijeUnArchivoConFormatoInvalido() {
        page.selectInvalidFile();
    }
    
    @Then("El sistema detecta el formato no permitido")
    public void elSistemaDetectaElFormatoNoPermitido() {
        Assert.assertTrue(page.isInvalidFileFormatDetected());
    }

    @When("El usuario intenta cargar el documento")
    public void elUsuarioIntentaCargarElDocumento() {
        page.tryUploadFile();
    }

    @Then("El mensaje de error indica que el formato no es permitido")
    public void elMensajeDeErrorIndicaQueElFormatoNoEsPermitido() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }
}