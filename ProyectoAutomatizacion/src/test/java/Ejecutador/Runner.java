package Ejecutador;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
		
features = {"src/test/resources/Feature"}, 
glue = {"DefinicionPasos"},
tags = "@Unico",
plugin = {"pretty", "html:target/cucumber-reports.html"},
monochrome = true
)
public class Runner {

}
