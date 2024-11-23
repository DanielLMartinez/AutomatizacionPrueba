	package DefinicionPasos;

	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
	import io.cucumber.java.en.Then;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import Utilidades.Utility;

import java.io.IOException;
import java.util.List;
	import java.util.concurrent.TimeUnit;

	import static org.junit.Assert.assertTrue;

	public class PasosFiltradoDeProductos {
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
	    
	    @Given("el usuario selecciona la categoría para búsqueda {string}")
	    public void el_usuario_selecciona_la_categoría_para_búsqueda(String categoria) {
	        System.out.println("Preparando la búsqueda para la categoría: " + categoria);
	    }
	    
	    @When("el usuario hace clic en el filtro {string}")
	    public void el_usuario_hace_clic_en_el_filtro(String filtro) {
	        WebElement filtroElemento = driver.findElement(By.linkText(filtro));
	        filtroElemento.click();
	    }

	    @Then("se muestra una página con el título que contiene {string}")
	    public void se_muestra_una_página_con_el_título_que_contiene(String tituloEsperado) throws IOException {
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        
	        try {
	            By elementoEspecifico = By.xpath("//*[contains(text(), '" + tituloEsperado + "')]");
	            wait.until(ExpectedConditions.presenceOfElementLocated(elementoEspecifico));

	            List<WebElement> elementos = driver.findElements(elementoEspecifico);
	            System.out.println("Número de elementos encontrados: " + elementos.size());

	            boolean encontrado = false;
	            for (WebElement elemento : elementos) {
	                String actualText = elemento.getText().trim();
	                System.out.println("Texto del elemento encontrado: " + actualText);

	                if (actualText.contains(tituloEsperado.trim())) {
	                    encontrado = true;
	                    break;
	                }
	            }

	            assertTrue("No se encontró ningún elemento con el texto esperado.", encontrado);
	        } catch (Exception e) {
	            System.out.println("Error: No se pudo encontrar el elemento esperado en el tiempo de espera.");
	            throw e;
	        }
	        
	        String obj="Se_valida_la_busqueda";
	        Utility.captureScreenShot(driver, "evidencias\\"+obj+" "+Utility.GetTimeStampValue()+".png");
	        
	    }
	    
	    @When("el usuario escribe {string} en la barra de búsqueda")
	    public void el_usuario_escribe_en_la_barra_de_búsqueda(String terminoBusqueda) {
	        WebElement searchBar = driver.findElement(By.name("s"));
	        searchBar.sendKeys(terminoBusqueda);
	    }

}
