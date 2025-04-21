package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import pages.tc_008Page;
import static org.junit.Assert.assertTrue;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("El usuario inicia la carga de un documento válido")
    public void el_usuario_inicia_la_carga_de_un_documento_válido() {
        page.iniciarCargaDocumento();
        assertTrue(page.isOpcionCancelarVisible());
    }

    @When("El usuario selecciona 'Cancelar carga'")
    public void el_usuario_selecciona_cancelar_carga() {
        page.cancelarCargaDocumento();
    }

    @Then("La carga del documento se detiene inmediatamente")
    public void la_carga_del_documento_se_detiene_inmediatamente() {
        assertTrue(page.isCargaCancelada());
    }

    @Then("No se guarda ningún registro o archivo incompleto en el sistema")
    public void no_se_guarda_ningún_registro_o_archivo_incompleto_en_el_sistema() {
        assertTrue(page.isDocumentoInexistente());
    }
}