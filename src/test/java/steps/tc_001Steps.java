package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

public class tc_001Steps {
    private WebDriver driver;
    private tc_001Page page;

    public tc_001Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("El usuario selecciona el botón 'Cargar documento'")
    public void el_usuario_selecciona_el_boton_cargar_documento() {
        page.clickUploadButton();
    }

    @Then("Se despliega el diálogo de selección de archivos")
    public void se_despliega_el_dialogo_de_seleccion_de_archivos() {
        Assert.assertTrue(page.isFileDialogDisplayed());
    }

    @When("El usuario elige un documento PDF con tamaño permitido")
    public void el_usuario_elige_un_documento_pdf_con_tamano_permitido() {
        page.selectValidPdfDocument();
    }

    @Then("El sistema reconoce el formato y tamaño del documento")
    public void el_sistema_reconoce_el_formato_y_tamano_del_documento() {
        Assert.assertTrue(page.isDocumentRecognized());
    }

    @When("El usuario confirma la carga del documento")
    public void el_usuario_confirma_la_carga_del_documento() {
        page.confirmUpload();
    }

    @Then("El documento se carga exitosamente y se muestra un mensaje de confirmación")
    public void el_documento_se_carga_exitosamente_y_se_muestra_un_mensaje_de_confirmacion() {
        Assert.assertTrue(page.isUploadSuccessMessageDisplayed());
    }
}