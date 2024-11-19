package DefinicionPasos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class PasosConsultaDeHistorialDePedidos {
	static WebDriver driver;
    static String pathDriver = "./src/test/resources/chrome/chromedriver.exe";
    static String tipoDriver = "webdriver.chrome.driver";

    @Before
    public void setup() {
        System.setProperty(tipoDriver, pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    @Given("Se ingresa al historial")
    public void se_ingresa_al_historial() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Vamos bien ahora se debe buscar con katalon o "
        		+ "a mano donde se debe hacer click para ver el historial de pedidos y seguir con las pruebas");   }
}
