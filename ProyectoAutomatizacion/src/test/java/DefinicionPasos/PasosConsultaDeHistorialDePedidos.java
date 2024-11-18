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
	
	
	@Given("Se ingresa al sitio principal")
	public void Se_ingresa_al_sitio_principal() {
	    driver.get("https://www.aldeajuegos.cl/");
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	    try {
	        Thread.sleep(6000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	@When("Se ingresa al enlace {string}")
	public void Se_ingresa_al_enlace(String enlace) {
	driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
	  
	}

	@Then("Se redirige al login")
	public void Se_redirige_al_login() {
		
		System.out.println("Prueba ejecutada con exito");
	}
}
