package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page page;

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        // Lógica para abrir la página de carga de documentos
    }

    @When("Selecciona el botón 'Cargar documento'")
    public void seleccionaElBotonCargarDocumento() {
        page.clickUploadButton();
    }

    @Then("Se despliega el diálogo de selección de archivos")
    public void seDespliegaElDialogoDeSeleccionDeArchivos() {
        // Lógica para verificar que el diálogo de selección de archivos se haya desplegado
    }

    @When("Selecciona un documento cuyo tamaño supere el límite permitido")
    public void seleccionaUnDocumentoCuyoTamañoSupereElLimitePermitido() {
        page.selectFileExceedingSizeLimit();
    }

    @Then("El sistema verifica el tamaño del documento")
    public void elSistemaVerificaElTamañoDelDocumento() {
        // Lógica para verificar que el sistema haya comprobado el tamaño del documento
    }

    @When("Intenta cargar el documento")
    public void intentaCargarElDocumento() {
        page.attemptToUploadFile();
    }

    @Then("Se muestra mensaje de error indicando que el tamaño del documento excede lo permitido")
    public void seMuestraMensajeDeErrorIndicandoQueElTamañoDelDocumentoExcedeLoPermitido() {
        page.verifyErrorMessageDisplayed();
    }
}