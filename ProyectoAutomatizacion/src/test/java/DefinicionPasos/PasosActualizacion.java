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

public class PasosActualizacion {

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

    @Given("Se ingresa al sitio {string}")
    public void se_ingresa_al_sitio(String url) {
        driver.get("https://www.aldeajuegos.cl/datos-personales");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @When("El campo de nombre contiene el valor {string}")
    public void el_campo_de_nombre_contiene_el_valor(String valorEsperado) {
        WebElement nombreField = driver.findElement(By.id("field-firstname"));
        String valorActual = nombreField.getAttribute("value");
        assertEquals(valorEsperado, valorActual);
    }

    @When("Se cambia el valor del campo de nombre a {string}")
    public void se_cambia_el_valor_del_campo_de_nombre_a(String nuevoValor) {
        WebElement nombreField = driver.findElement(By.id("field-firstname"));
        nombreField.clear();
        nombreField.sendKeys(nuevoValor);
    }

    @When("Se ingresa la contraseña {string} en el campo correspondiente")
    public void se_ingresa_la_contraseña_en_el_campo_correspondiente(String contrasena) {
        WebElement passwordField = driver.findElement(By.id("field-password"));
        passwordField.sendKeys(contrasena);
    }

    @When("Se selecciona la opción para guardar los cambios")
    public void se_selecciona_la_opcion_para_guardar_los_cambios() {
        WebElement saveButton = driver.findElement(By.xpath("//*[@id='customer-form']/footer/button"));
        saveButton.click();
    }

    @Then("Aparece el mensaje {string}")
    public void aparece_el_mensaje(String mensajeEsperado) {
        WebElement mensajeElemento = driver.findElement(By.id("mensaje"));
        String mensajeActual = mensajeElemento.getText();
        assertEquals(mensajeEsperado, mensajeActual);
    }

    @Then("El campo de nombre muestra {string}")
    public void el_campo_de_nombre_muestra(String nombreEsperado) {
        WebElement nombreField = driver.findElement(By.id("field-firstname"));
        String valorActual = nombreField.getAttribute("value");
        assertEquals(nombreEsperado, valorActual);
    }
}
