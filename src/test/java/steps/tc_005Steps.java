package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;
import java.util.List;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("Selecciona el botón 'Cargar documento' y elige múltiples archivos válidos")
    public void selecciona_el_botón_cargar_documento_y_elige_multiples_archivos_válidos() {
        page.chooseMultipleFiles();
    }

    @Then("El sistema permite seleccionar más de un documento a la vez")
    public void el_sistema_permite_seleccionar_mas_de_un_documento_a_la_vez() {
        Assert.assertTrue(page.areMultipleFilesSelected());
    }

    @When("Confirma la carga de todos los documentos seleccionados")
    public void confirma_la_carga_de_todos_los_documentos_seleccionados() {
        page.uploadSelectedFiles();
    }

    @Then("Cada documento se carga de forma concurrente sin afectar la integridad de los demás")
    public void cada_documento_se_carga_de_forma_concurrente() {
        Assert.assertTrue(page.areFilesUploadedConcurrently());
    }

    @And("Se muestran mensajes de confirmación para cada documento cargado")
    public void se_muestran_mensajes_de_confirmacion_para_cada_documento_cargado() {
        List<String> successMessages = page.getSuccessMessages();
        Assert.assertEquals(successMessages.size(), page.getNumberOfSelectedFiles());
    }

    @Then("Deben aparecer mensajes de éxito individuales para cada archivo")
    public void deben_aparecer_mensajes_de_exito_individuales_para_cada_archivo() {
        List<String> messages = page.getSuccessMessages();
        for (String message : messages) {
            Assert.assertTrue(message.contains("cargado con éxito"));
        }
    }
}