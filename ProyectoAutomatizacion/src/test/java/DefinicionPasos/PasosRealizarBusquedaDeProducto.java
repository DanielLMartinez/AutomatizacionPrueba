package DefinicionPasos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasosRealizarBusquedaDeProducto {

	static WebDriver  driver;
	static String pathDriver="./src/test/resources/chrome/chromedriver.exe";
	static String tipoDriver="webdriver.chrome.driver";

	@Before
	public void setUp() throws Exception {
	System.setProperty(tipoDriver, pathDriver);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}


	@After
	public void tearDown() throws Exception {
	if (driver != null)
	driver.quit();
	}
	
	
	@When("hago clic en la posición X {int} y Y {int}")
	public void hago_clic_en_la_posición_x_y_y(Integer x, Integer y) {
		driver.manage().window().setSize(new Dimension(1024, 768));
	    Actions actions = new Actions(driver);
	    Actions actions2 = new Actions(driver);
	       try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    System.out.println("Moviendo el mouse a la posición...");
	    actions.moveByOffset(x, y).click().perform();
	    System.out.println("Clic realizado en la posición: X=" + x + ", Y=" + y);
	       try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	       actions.sendKeys("Newton").sendKeys(Keys.RETURN).perform();
	}
	
	
	@Given("Se ingresa nombre de producto al buscador {string}")
	public void se_ingresa_nombre_de_producto_al_buscador(String nombreProducto) {
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}


	
	@Given("Se realiza la busqueda")
	public void se_realiza_la_busqueda() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(3000);
		System.out.println("Se ingreso el intro");
	}

	@Then("Se puede ver el producto buscado")
	public void se_puede_ver_el_producto_buscado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
