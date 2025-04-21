package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;
import static org.junit.Assert.assertTrue;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page page;

    @Given("^El usuario abre la página de carga de documentos$")
    public void elUsuarioAbreLaPaginaDeCargaDeDocumentos() {
        page = new tc_007Page(driver);
        page.navegarAPaginaDeCargaDeDocumentos();
    }

    @When("^Verifica la alineación y visibilidad de los componentes$")
    public void verificaLaAlineacionYVisibilidadDeLosComponentes() {
        assertTrue(page.estaBienAlineadoYVisible());
    }

    @Then("^Los elementos UI están correctamente alineados y son responsivos$")
    public void losElementosUIEstanCorrectamenteAlineadosYSonResponsivos() {
        assertTrue(page.esResponsivo());
    }

    @When("^Interactúa con cada elemento de la UI$")
    public void interactuaConCadaElementoDeLaUI() {
        page.interactuarConElementos();
    }

    @Then("^Cada componente responde de manera adecuada a la interacción$")
    public void cadaComponenteRespondeDeManeraAdecuadaALaInteraccion() {
        assertTrue(page.componenetesRespondenCorrectamente());
    }
}