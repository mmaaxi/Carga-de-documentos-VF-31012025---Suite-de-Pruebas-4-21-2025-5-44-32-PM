package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("el usuario ha iniciado sesión y está en la página de carga de documentos")
    public void elUsuarioHaIniciadoSesion() {
        page.login();
        page.navigateToUploadPage();
    }

    @When("carga un documento válido que ya ha sido cargado anteriormente")
    public void cargaDocumentoValidoYaCargado() {
        page.uploadDocument("existing_document.pdf");
    }

    @Then("el sistema detecta la duplicidad mediante comprobación de metadatos o checksum")
    public void sistemaDetectaDuplicidad() {
        Assert.assertTrue(page.isDuplicateDetected());
    }

    @When("intenta cargar el mismo documento nuevamente")
    public void intentaCargarDocumentoNuevamente() {
        page.uploadDocument("existing_document.pdf");
    }

    @Then("el sistema muestra un mensaje de error o advertencia indicando la duplicidad")
    public void sistemaMuestraMensajeError() {
        Assert.assertTrue(page.isDuplicateErrorDisplayed());
    }

    @Then("el sistema no almacena archivos duplicados")
    public void sistemaNoAlmacenaDuplicados() {
        Assert.assertFalse(page.isDuplicateSaved());
    }
}