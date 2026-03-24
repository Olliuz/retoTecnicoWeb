package org.example.paginas.inicio;

import org.example.paginas.base.PaginaBaseCompra;
import org.openqa.selenium.WebDriver;

public class PaginaCompra extends PaginaBaseCompra {

    public PaginaCompra(WebDriver driver) {
        //this.driver = driver;
        super(driver);
    }
    public void cargarPaginaCompra() {
        driver.get("https://www.demoblaze.com/index.html");
    }

}
