package DefinicionPasos;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class PasosBusquedaDeProductos {
	static WebDriver driver;
    static String pathDriver = "./src/test/resources/chrome/chromedriver.exe";
    static String tipoDriver = "webdriver.chrome.driver";
	
    
    @Before
    public void setup() throws Exception{
        System.setProperty(tipoDriver, pathDriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.aldeajuegos.cl");
    }

    @After
    public void tearDown() throws Exception{
        if (driver != null)
            driver.quit();
    }
    
   

    @When("el usuario inicia sesión con sus credenciales")
    public void el_usuario_inicia_sesión_con_sus_credenciales() {
        WebDriverWait wait = new WebDriverWait(driver, 15); 

        try {
            WebElement iniciarSesionLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[span[text()='Iniciar sesión']]")));
            iniciarSesionLink.click();

            WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-email")));
            emailInput.sendKeys("fca.ramirez.alvarez@gmail.com");

            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-password")));
            passwordInput.sendKeys("Paratesting158.");

            WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            submitBtn.click();
        } catch (Exception e) {
            System.out.println("Error durante el inicio de sesión: " + e.getMessage());
            throw e;
        }
    }



    @When("el usuario inicia sesión con la contraseña {string}")
    public void el_usuario_inicia_sesión_con_la_contraseña(String contraseña) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement iniciarSesionLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[span[text()='Iniciar sesión']]")));
        iniciarSesionLink.click();


        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-email")));
        emailInput.sendKeys("fca.ramirez.alvarez@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("field-password"));
        passwordInput.sendKeys(contraseña);

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();
    }

    
    public void el_usuario_inicia_sesión_con_el_correo(String correo) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement iniciarSesionLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[span[text()='Iniciar sesión']]")));
        iniciarSesionLink.click();
        
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-email")));
        emailInput.sendKeys(correo);

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-password")));
        passwordInput.sendKeys("Paratesting158.");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();

       
    }

    @When("el usuario inicia sesión sin ingresar correo")
    public void el_usuario_inicia_sesión_sin_ingresar_correo() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {
            WebElement iniciarSesionLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[span[text()='Iniciar sesión']]")));
            iniciarSesionLink.click();

            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-password")));
            passwordInput.sendKeys("Paratesting158.");

            WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            submitBtn.click();

            By mensajeErrorSelector = By.xpath("//label[contains(@class, 'error') and contains(text(), 'Completa este campo')]");
            WebElement mensajeError = wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeErrorSelector));
            
            assertTrue("No se muestra el mensaje de error esperado al no ingresar el correo.", mensajeError.isDisplayed());

        } catch (Exception e) {
            System.out.println("Error durante el intento de iniciar sesión: " + e.getMessage());
            throw e;
        }
    }



    @When("el usuario inicia sesión sin ingresar contraseña")
    public void el_usuario_inicia_sesión_sin_ingresar_contraseña() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {
            WebElement iniciarSesionLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[span[text()='Iniciar sesión']]")));
            iniciarSesionLink.click();

            WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-email")));
            emailInput.sendKeys("fca.ramirez.alvarez@gmail.com");

            WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            submitBtn.click();

            WebElement mensajeError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(@class, 'error') or contains(text(), 'Contraseña requerida')]")));
            assertTrue("El mensaje de error no se mostró o no se quedó en la misma página al no ingresar la contraseña.", mensajeError.isDisplayed());
            
        } catch (Exception e) {
            System.out.println("Error: No se pudo completar el intento de iniciar sesión sin ingresar contraseña: " + e.getMessage());
            throw e;
        }
    }



    @When("el usuario hace clic en {string}")
    public void el_usuario_hace_clic_en(String linkText) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement cerrarSesionLink = driver.findElement(By.className("logout"));
        cerrarSesionLink.click();

    }

    @When("el usuario navega a la sección de historial de pedidos")
    public void el_usuario_navega_a_la_sección_de_historial_de_pedidos() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {
            el_usuario_inicia_sesión_con_sus_credenciales();

            WebElement historialPedidosLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("history-link")));
            historialPedidosLink.click();
        } catch (Exception e) {
            System.out.println("Error al navegar a la sección de historial de pedidos: " + e.getMessage());
            throw e;
        }
    }



    @Then("se muestra la página de historial de pedidos")
    public void se_muestra_la_página_de_historial_de_pedidos() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Historial de pedidos')]")));
        WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(text(), 'Historial de pedidos')]"));
        assertTrue("No se pudo encontrar la página de historial de pedidos.", pageTitle.isDisplayed());
    }

    @Then("se muestra un mensaje de error que contiene {string}")
    public void se_muestra_un_mensaje_de_error_que_contiene(String mensajeEsperado) {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {
            By mensajeErrorSelector = By.xpath("//*[contains(@class, 'alert') and contains(text(), '" + mensajeEsperado + "')]");
            wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeErrorSelector));

            WebElement mensajeError = driver.findElement(mensajeErrorSelector);
            String actualText = mensajeError.getText().trim();
            assertTrue("El mensaje de error no contiene el texto esperado. Texto actual: " + actualText, actualText.contains(mensajeEsperado.trim()));
        } catch (Exception e) {
            System.out.println("Error: No se pudo encontrar el mensaje de error esperado.");
            throw e;
        }
    }




    @Then("se muestra al menos un pedido en el historial")
    public void se_muestra_al_menos_un_pedido_en_el_historial() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("order-history")));
        WebElement orderHistory = driver.findElement(By.className("order-history"));
        assertTrue("No se encontraron pedidos en el historial.", orderHistory.findElements(By.tagName("tr")).size() > 0);
    }

    @When("el usuario aplica el filtro {string}")
    public void el_usuario_aplica_el_filtro(String filtro) {
        WebElement filtroElemento = driver.findElement(By.id(filtro));
        filtroElemento.click();
    }

    @Then("se muestra la página con los detalles del pedido seleccionado")
    public void se_muestra_la_página_con_los_detalles_del_pedido_seleccionado() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order-detail-content")));
        WebElement orderDetail = driver.findElement(By.id("order-detail-content"));
        assertTrue("No se pudo encontrar la página con los detalles del pedido.", orderDetail.isDisplayed());
    }

    @When("el usuario intenta ver un pedido con un ID inválido")
    public void el_usuario_intenta_ver_un_pedido_con_un_id_inválido() {
        driver.get("https://www.aldeajuegos.cl/pedido-invalido"); 
    }

    @When("el usuario selecciona la opción para descargar la factura de un pedido")
    public void el_usuario_selecciona_la_opción_para_descargar_la_factura_de_un_pedido() {
        WebElement downloadInvoiceLink = driver.findElement(By.linkText("order-slips-link"));
        downloadInvoiceLink.click();
    }

    @When("el usuario descarga la factura de un pedido desde el historial")
    public void el_usuario_descarga_la_factura_de_un_pedido_desde_el_historial() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {
            el_usuario_navega_a_la_sección_de_historial_de_pedidos();

            WebElement descargarFacturaLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("order-slips-link")));
            descargarFacturaLink.click();
        } catch (Exception e) {
            System.out.println("Error al intentar descargar la factura desde el historial de pedidos: " + e.getMessage());
            throw e;
        }
    }


    @When("el usuario envía la búsqueda")
    public void el_usuario_envía_la_búsqueda() {
        WebElement searchBar = driver.findElement(By.name("s"));
        searchBar.submit();
    }
    
    @Given("el usuario selecciona elemento para búsqueda {string}")
    public void el_usuario_selecciona_elemento_para_búsqueda(String elemento) {
    	System.out.println("Preparando la búsqueda para la categoría: " + elemento);
    }


}
