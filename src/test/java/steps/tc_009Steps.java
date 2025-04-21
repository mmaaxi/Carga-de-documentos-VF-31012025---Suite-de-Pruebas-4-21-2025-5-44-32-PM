package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;
import org.junit.Assert;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("el usuario carga un documento válido")
    public void cargarDocumento() {
        page.subirDocumento();
    }

    @When("se calcula el checksum del documento cargado")
    public void calcularChecksum() {
        page.calcularChecksum();
    }

    @Then("el checksum del documento cargado debe coincidir con el checksum del documento original")
    public void verificarChecksum() {
        boolean integridadVerificada = page.verificarIntegridad();
        Assert.assertTrue("El checksum del documento no coincide con el original", integridadVerificada);
    }
  
    @Then("el registro de verificación debe ser guardado en el sistema")
    public void registrarVerificacion() {
        boolean registroExitoso = page.registrarValidacion();
        Assert.assertTrue("El registro del proceso de validación no se guardó correctamente", registroExitoso);
    }
}