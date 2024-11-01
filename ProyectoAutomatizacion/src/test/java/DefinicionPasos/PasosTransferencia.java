package DefinicionPasos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasosTransferencia {
	
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

	
	
	
	
	@Given("al navegar hasta la url {string}")
	public void al_navegar_hasta_la_url(String url) throws InterruptedException {
	    driver.get(url);
	    Thread.sleep(3000);
	}

	@When("hacemos click en el link {string}")
	public void hacemos_click_en_el_link(String enlace) {
	driver.findElement(By.xpath(enlace)).click();
	  
	}

	@When("coloca en el campo usuario {string} el texto {string}")
	public void coloca_en_el_campo_usuario_el_texto(String usuario, String clave) throws InterruptedException {
	    driver.findElement(By.xpath(usuario)).click();
	    driver.findElement(By.xpath(usuario)).clear();
	    driver.findElement(By.xpath(usuario)).sendKeys(clave);
	    Thread.sleep(3000);
	}

	@When("coloca en el campo password {string} el texto {string}")
	public void coloca_en_el_campo_password_el_texto(String password, String clave) {
	driver.findElement(By.xpath(password)).click();
	    driver.findElement(By.xpath(password)).clear();
	    driver.findElement(By.xpath(password)).sendKeys(clave);    
	}
	
	@When("hacer click sobre el boton Login {string}")
	public void hacer_click_sobre_el_boton_login(String boton) {
	driver.findElement(By.xpath(boton)).click();     
	}

	@When("hacer click en el link Transfer Funds {string}")
	public void hacer_click_en_el_link_transfer_funds(String enlace) {
	driver.findElement(By.xpath(enlace)).click();
	     
	}

	@When("hacer click en el boton Transfer Money {string}")
	public void hacer_click_en_el_boton_transfer_money(String boton) {
	driver.findElement(By.xpath(boton)).click();
	    
	}

	@Then("Presenta el mensaje de alerta {string}")
	public void presenta_el_mensaje_de_alerta(String texto) {
	String mensaje=driver.switchTo().alert().getText();
	if (mensaje.contains(texto))
	System.out.println("Escenario sin selección de cuentas PASA");
	else
	System.out.println("Escenario sin selección de cuentas NO PASA");
	}

	


}
