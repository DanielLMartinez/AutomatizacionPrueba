package DefinicionPasos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasosConsultaDeHistorialDePedidos {
	static WebDriver driver;
    static String pathDriver = "./src/test/resources/chrome/chromedriver.exe";
    static String tipoDriver = "webdriver.chrome.driver";

    @Before
    public void setup() throws Exception{
        System.setProperty(tipoDriver, pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void tearDown() throws Exception{
        if (driver != null)
            driver.quit();
    }
    
    @Given("Se inicia sesion para consular historial")
    public void se_inicia_sesion_para_consular_historial() {
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
    
    @Given("Se ingresa al historial")
    public void se_ingresa_al_historial() {
    	System.out.println("Ingreso al historial");
    	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id='history-link']/span/i")).click();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Then("Se confirma accede al historial")
    public void se_confirma_accede_al_historial() {
    	String seAccedeCorrectamenteHistorial = driver.findElement(By.xpath("//*[@id='main']/header/h1")).getText();
    	if(seAccedeCorrectamenteHistorial.contains("Historial de pedidos")){
    		System.out.println("Se ingreso correctamente a pedidos");}
    		else {System.out.println("Error al ingresar a pedidos");
    		}
    	}
    
    @Then("Se verifica ID de primer pedido")
    public void se_verifica_id_de_primer_pedido() {
    	String seVerificaIdentidicador = driver.findElement(By.xpath("//section[@id='content']/table/tbody/tr/th")).getText();
    	if(seVerificaIdentidicador.contains("DCDDYHGCN")){
    		System.out.println("Verificacion correcta");}
    		else {System.out.println("Error al verificar pedido");
    		}
    }
    
    @Given("Se inicia sesion para consular historial con atajo en url")
    public void se_inicia_sesion_para_consular_historial_con_atajo_en_url() {
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	driver.findElement(By.id("//*[@id='_desktop_user_info']/div/a[1]")).click();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.aldeajuegos.cl/iniciar-sesion?back=history");
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
    
    @When("Se ingresa nuevamente a las opciones de cuenta")
    public void se_ingresa_nuevamente_a_las_opciones_de_cuenta() {
    	System.out.println("Con esta termino este feature y con este escenario quiero volver a la pagina principal para luego volver a la seccion de pedidos del usuario");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	driver.get("https://www.aldeajuegos.cl/mi-cuenta");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='history-link']/span/i")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    	
    }
}
