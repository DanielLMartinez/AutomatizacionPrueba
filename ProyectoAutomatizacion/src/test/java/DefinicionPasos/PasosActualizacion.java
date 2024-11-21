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


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
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
    

    @Given("Se inicia sesion para actualizar datos")
    public void se_inicia_sesion_para_actualizar_datos() {
        driver.get("https://www.aldeajuegos.cl/iniciar-sesion?back=my-account");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("field-email")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-email")).clear();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-email")).sendKeys("fca.ramirez.alvarez@gmail.com");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.id("field-password")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-password")).clear();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-password")).sendKeys("Paratesting158.");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("submit-login")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    
    @When("Se ingresa a datos personales")
    public void se_ingresa_a_datos_personales() {
        // Write code here that turns the phrase above into concrete actions
    	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    	driver.findElement(By.xpath(" //*[@id='identity-link']/span")).click();
        
        
        
        //driver.findElement(By.xpath("//form[@id='customer-form']/div")).click();
        
        //driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a[2]/span")).click();
        //driver.get("https://www.aldeajuegos.cl/mi-cuenta");
        //driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a[2]/span")).click();
     
    }
    
    @When("Se cambia el nombre {string}")
    public void se_cambia_el_nombre(String nombre) {
    	driver.findElement(By.id("wrapper")).click();
        driver.findElement(By.id("field-firstname")).click();
        driver.findElement(By.xpath("//form[@id='customer-form']/div/div[2]")).click();
        driver.findElement(By.id("field-firstname")).clear();
        driver.findElement(By.id("field-firstname")).sendKeys(nombre);
    }

    @When("Se ingresa contraseña")
    public void se_ingresa_contraseña() {
    	driver.findElement(By.id("field-password")).click();
        driver.findElement(By.id("field-password")).clear();
    	driver.findElement(By.id("field-password")).sendKeys("Paratesting158.");
    }
    
    @When("Se aceptan los terminos")
    public void se_aceptan_los_terminos() {
    	System.out.println("Se Clickea se aceptan los terminos");
    	driver.findElement(By.name("psgdpr")).click();
        
    }

    @When("Se guardan los cambios")
    public void se_guardan_los_cambios() throws InterruptedException {
    	System.out.println("Se Clickea el boton para confirmar cambios");
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
         Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
    }

    @Then("Se verifica el nombre")
    public void se_verifica_el_nombre() throws InterruptedException {
        System.out.println("Se verifica el nombre");
        Thread.sleep(2000);
		String validarCambioDeNombre = driver.findElement(By.xpath("//*[@id='_desktop_user_info']/div/a[2]/span")).getText();
		if(validarCambioDeNombre.contains("FRAN RAMIREZ")) {
			System.out.println("Se valida primer paso");
		} else if(validarCambioDeNombre.contains("FRANCISCA RAMIREZ")) {
			System.out.println("Se valida segundo caso");
			}
		else {System.out.println("Error al validar");}
    }
    

    @When("Se cambia el apellido {string}")
    public void se_cambia_el_apellido(String apellido) {
    	driver.findElement(By.id("field-lastname")).click();
        driver.findElement(By.id("field-lastname")).clear();
        driver.findElement(By.id("field-lastname")).sendKeys(apellido);
    }

    @Then("Se verifica el apellido")
    public void se_verifica_el_apellido() throws InterruptedException {
        System.out.println("Se verifica el nombre");
        Thread.sleep(2000);
		String validarCambioDeApellido = driver.findElement(By.xpath("//*[@id='_desktop_user_info']/div/a[2]/span")).getText();
		if(validarCambioDeApellido.contains("FRANCISCA RAMI")) {
			System.out.println("Se valida cambio apellido primer paso");
		} else if(validarCambioDeApellido.contains("FRANCISCA RAMIREZ")) {
			System.out.println("Se valida cambio apellido segundo caso");
			}
		else {System.out.println("Error al validar el apellido");}
    }
}
