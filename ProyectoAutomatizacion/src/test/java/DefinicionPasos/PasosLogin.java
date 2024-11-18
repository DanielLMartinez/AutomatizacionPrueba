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

public class PasosLogin {

	
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
	
	@Given("Se ingresa a la pagina principal")
	public void se_ingresa_a_la_pagina_principal() {
		driver.get("https://www.aldeajuegos.cl/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}

	@When("Se hace clic en el enlace de login.")
	public void se_hace_clic_en_el_enlace_de_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a/span")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}

	@When("Se ingresa el correo fca.ramirez.alvarez@gmail.com en el campo de email.")
	public void se_ingresa_el_correo_fca_ramirez_alvarez_gmail_com_en_el_campo_de_email() {
		driver.findElement(By.id("field-email")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-email")).clear();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-email")).sendKeys("fca.ramirez.alvarez@gmail.com");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@When("Se ingresa la contraseña Paratesting158. en el campo de contraseña.")
	public void se_ingresa_la_contraseña_paratesting158_en_el_campo_de_contraseña() {
		driver.findElement(By.id("field-password")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-password")).clear();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-password")).sendKeys("Paratesting158.");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("submit-login")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

	}

	@Then("Se redirige a https:\\/\\/www.aldeajuegos.cl\\/mi-cuenta.")
	public void se_redirige_a_https_www_aldeajuegos_cl_mi_cuenta() {
		String pagina = driver.findElement(By.xpath("//*[@id='main']/header/h1")).getText();
		if(pagina.contains("Su cuenta")) {
		System.out.println("paso");
		} else System.out.println("No Paso");

	}
	
	@Given("Se ingresa a la pagina login")
	public void se_ingresa_a_la_pagina_login() {
		driver.get("https://www.aldeajuegos.cl/iniciar-sesion?back=my-account");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}

	@When("se clickea Inicia sesion")
	public void se_clickea_inicia_sesion() {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("submit-login")).click();
	}


	@Then("Se mantiene en login")
	public void se_mantiene_en_login() {
		String mensajeSeMantieneEnLogin = driver.findElement(By.xpath("//*[@id='main']/header/h1")).getText();
		if(mensajeSeMantieneEnLogin.contains("Iniciar sesión con su cuenta")) {
			System.out.println("Se mantiene en login");
		}else {System.out.println("Ocurrio un error");}
	}
	
	@When("Se ingresa contraseña incorrecta {string}")
	public void se_ingresa_contraseña_incorrecta(String contrasena) {
		driver.findElement(By.id("field-password")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-password")).clear();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-password")).sendKeys(contrasena);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@When("Se ingresa contraseña incorrecta desde login {string}")
	public void se_ingresa_contraseña_incorrecta_desde_login(String contrasena) {
		driver.findElement(By.id("field-password")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-password")).clear();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-password")).sendKeys(contrasena);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@When("Se ingresa un correo incorrecto en el campo de email {string}")
	public void se_ingresa_un_correo_incorrecto_en_el_campo_de_email(String mailIncorrecto) {
		driver.findElement(By.id("field-email")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-email")).clear();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("field-email")).sendKeys(mailIncorrecto);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
}
