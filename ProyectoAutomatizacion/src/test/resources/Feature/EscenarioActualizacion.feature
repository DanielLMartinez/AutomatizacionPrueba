Feature: Actualización de datos personales

  Background: Inicio de sesion para actualizar datos
    Given Se inicia sesion para actualizar datos

	Scenario Outline: Actualización de nombre con sesión iniciada
		When Se ingresa a datos personales
		And Se cambia el nombre <nombre>
		And Se ingresa contraseña
		And Se aceptan los terminos
		And Se guardan los cambios
		Then Se verifica el nombre
		
						Examples:
      |nombre|
      |"FRAN"|
      |"FRANCISCA"|
      
   Scenario Outline: Actualización de apellido con sesión iniciada
   	When Se ingresa a datos personales
   	And Se cambia el apellido <apellido>
   	And Se ingresa contraseña
   	And Se aceptan los terminos
		And Se guardan los cambios
		Then Se verifica el apellido
		
		
		Examples:
   	  |apellido|
      |"RAMI"|
      |"RAMIREZ"|