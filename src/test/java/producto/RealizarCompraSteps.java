package producto;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.paginas.inicio.PaginaCompra;
import org.example.paginas.producto.PaginaRegistrarCompra;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class RealizarCompraSteps {

    @net.thucydides.core.annotations.Managed
    WebDriver driver;
    PaginaCompra paginaCompra;
    PaginaRegistrarCompra paginaRegistrarCompra;


    @Before
    public void configuracionInicial() {
        paginaCompra = new PaginaCompra(driver);
        paginaRegistrarCompra = new PaginaRegistrarCompra(driver);

    }

    @After
    public void liberarRecursos() {
        driver.quit();
    }

    @Given("que el usuario navega a la pagina de Demoblaze")
    public void queElUsuarioNavegaALaPaginaDeDemoblaze() {
        paginaCompra.cargarPaginaCompra();

    }

    @When("agrega los productos al carrito")
    public void agregaLosProductosYAlCarrito() {
        paginaRegistrarCompra.registrar();
    }

    @And("visualiza el carrito de compras")
    public void visualizaElCarritoDeCompras() {
        paginaRegistrarCompra.visualizar();
    }

    @And("completa el formulario de compra con los datos requeridos {string},{string},{string},{string},{string},{string}")
    public void completaElFormularioDeCompraConLosDatosRequeridosNameCountryCityCardMonthYear(String name,String country,String city, String card,String month, String year) {
        paginaRegistrarCompra.completar(name,country,city,card,month,year);
    }

    @Then("deberia ver el mensaje de confirmación {string}")
    public void deberiaVerElMensajeDeConfirmación(String mensajeEsperado) {
        assertEquals(mensajeEsperado, paginaRegistrarCompra.getMensajeObtenidoCompra());
    }


}
