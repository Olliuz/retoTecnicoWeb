package org.example.paginas.producto;

import org.example.helper.TPidoWebHelper;
import org.example.paginas.base.PaginaBaseCompra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaRegistrarCompra extends PaginaBaseCompra {
    private By lblProducto1 = By.linkText("Samsung galaxy s6");
    private By lblProducto2 = By.linkText("Nokia lumia 1520");
    private By btnAgregar = By.xpath("//a[contains(text(),'Add to cart')]");
    private By btnComprar = By.xpath("//button[contains(text(),'Purchase')]");
    private By lblHome = By.xpath("//a[contains(text(),'Home ')]");
    private By txtNombre =By.id("name");
    private By txtCountry =By.id("country");
    private By txtCity =By.id("city");
    private By txtCard =By.id("card");
    private By txtMes =By.id("month");
    private By txtYear =By.id("year");
    private By lblMensaje = By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");
    private By lblcarrito = By.id("cartur");
    private By btnPagar = By.xpath("//button[contains(text(),'Place Order')]");
    private String mensajeObtenido;


    public PaginaRegistrarCompra(WebDriver driver) {
        super(driver);
    }

    public void registrar() {

        driver.findElement(lblProducto1).click();
        TPidoWebHelper.pausar();

        driver.findElement(btnAgregar).click();
        TPidoWebHelper.pausar();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent()).accept();

        driver.findElement(lblHome).click();
        TPidoWebHelper.pausar();

        driver.findElement(lblProducto2).click();
        TPidoWebHelper.pausar();

        driver.findElement(btnAgregar).click();
        TPidoWebHelper.pausar();

        wait.until(ExpectedConditions.alertIsPresent()).accept();

    }

    public void visualizar() {

        driver.findElement(lblcarrito).click();
        TPidoWebHelper.pausar();

        driver.findElement(btnPagar).click();
        TPidoWebHelper.pausar();
    }

    public void completar(String Nombre,String Pais,String Ciudad,String Tarjeta,String Mes ,String Aio){

        driver.findElement(txtNombre).sendKeys(Nombre);
        TPidoWebHelper.pausar();

        driver.findElement(txtCountry).sendKeys(Pais);
        TPidoWebHelper.pausar();

        driver.findElement(txtCity).sendKeys(Ciudad);
        TPidoWebHelper.pausar();

        driver.findElement(txtCard).sendKeys(Tarjeta);
        TPidoWebHelper.pausar();

        driver.findElement(txtMes).sendKeys(Mes);
        TPidoWebHelper.pausar();

        driver.findElement(txtYear).sendKeys(Aio);
        TPidoWebHelper.pausar();

        driver.findElement(btnComprar).click();
        TPidoWebHelper.pausar();

        this.mensajeObtenido = driver.findElement(lblMensaje).getText();
    }

    public String getMensajeObtenidoCompra() {
        return this.mensajeObtenido;
    }
}
