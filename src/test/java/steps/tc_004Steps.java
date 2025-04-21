package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("el usuario ha iniciado sesión en la aplicación")
    public void usuario_ha_iniciado_sesion() {
        page.login();
    }

    @When("inicia el proceso de carga de un documento válido")
    public void inicia_proceso_carga_documento() {
        page.startDocumentUpload();
    }

    @Then("el proceso de carga comienza normalmente")
    public void proceso_carga_comienza_normalmente() {
        page.verifyUploadStart();
    }

    @When("ocurre una interrupción en la conexión de red")
    public void interrupcion_conexion_red() {
        page.simulateNetworkInterruption();
    }

    @Then("el sistema detecta la pérdida de conexión y pausa la operación")
    public void sistema_detecta_perdida_conexion() {
        page.verifyUploadPaused();
    }

    @When("se restablece la conexión y se reintenta la carga")
    public void restablece_conexion_reintenta_carga() {
        page.restoreConnectionAndRetryUpload();
    }

    @Then("el sistema retoma o reinicia el proceso de carga o ofrece opción de reintentar")
    public void sistema_reanuda_o_reinicia_proceso_carga() {
        page.verifyUploadResumeOrOptionToRetry();
    }
}