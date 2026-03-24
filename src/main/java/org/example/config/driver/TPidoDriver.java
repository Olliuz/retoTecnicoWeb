package org.example.config.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TPidoDriver {
    public enum NavegadorWeb {CHROME, FIREFOX}

    public static WebDriver getInstancia(NavegadorWeb navegador) {
        if (navegador == NavegadorWeb.FIREFOX) {
            return getFirefoxDriver();
        }
        return getChromeDriver();
    }

    private static WebDriver getChromeDriver() {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        return aplicarConfiguracionEnComun(new ChromeDriver());
    }

    private static WebDriver getFirefoxDriver() {
        // TODO Auto-generated method stub
        WebDriverManager.firefoxdriver().setup();
        //WebDriver driver = new FirefoxDriver();
        return aplicarConfiguracionEnComun(new FirefoxDriver());
    }

    private static WebDriver aplicarConfiguracionEnComun(WebDriver driver) {
        driver.manage().window().maximize();
        return driver;
    }
}
