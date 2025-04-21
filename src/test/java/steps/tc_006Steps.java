package steps;

import io.cucumber.java.en.*;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el usuario ha seleccionado un archivo con metadatos modificados con código malicioso")
    public void usuarioHaSeleccionadoArchivo() {
        page.selectFileWithMaliciousMetadata();
    }

    @When("el usuario intenta cargar el documento")
    public void usuarioIntentaCargarDocumento() {
        page.tryUploadDocument();
    }

    @Then("el sistema debe analizar los metadatos del archivo")
    public void sistemaAnalizaMetadatos() {
        page.verifyMetadataAnalysis();
    }

    @Then("el sistema detecta los caracteres sospechosos y rechaza la carga")
    public void sistemaDetectaCaracteresYRechazaCarga() {
        page.verifyInjectionDetectionAndRejection();
    }

    @Then("se muestra un mensaje de error apropiado acerca de contenido malicioso en los metadatos")
    public void mostrarMensajeDeError() {
        page.verifyErrorMessageDisplayed();
    }
}