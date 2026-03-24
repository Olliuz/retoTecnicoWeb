package org.example.paginas.base;

import org.example.menu.MenuPrincipalCompra;
import org.openqa.selenium.WebDriver;

public class PaginaBaseCompra {
    protected WebDriver driver;
    protected MenuPrincipalCompra menuPrincipalCompra;
    public PaginaBaseCompra(WebDriver 	driver) {
        this.driver=driver;
        this.menuPrincipalCompra=new MenuPrincipalCompra(driver);
    }
}
