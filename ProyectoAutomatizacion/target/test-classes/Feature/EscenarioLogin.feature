Feature: Inicio de Sesion

Background: Accesos a la pagina
Given Se ingresa a la pagina principal

#1
Scenario: Login con datos correctos desde página principal
		When Se hace clic en el enlace de login.
		And Se ingresa el correo fca.ramirez.alvarez@gmail.com en el campo de email.
		And Se ingresa la contraseña Paratesting158. en el campo de contraseña.
		Then Se redirige a https://www.aldeajuegos.cl/mi-cuenta.

#2
Scenario: Login con datos correctos desde la pagina login
		Given Se ingresa a la pagina login
		When Se ingresa el correo fca.ramirez.alvarez@gmail.com en el campo de email.
		And Se ingresa la contraseña Paratesting158. en el campo de contraseña.
		Then Se redirige a https://www.aldeajuegos.cl/mi-cuenta.
	
#3	
Scenario: Login con datos vacios desde pagina principal
		When Se hace clic en el enlace de login.
		And se clickea Inicia sesion
		Then Se mantiene en login

#4
Scenario: Login con datos vacios desde pagina login
		Given Se ingresa a la pagina login
		And se clickea Inicia sesion
		Then Se mantiene en login

#5		
Scenario: Login con correo correcto y contraseña sin completar desde pagina principal
		When Se hace clic en el enlace de login.
		And Se ingresa el correo fca.ramirez.alvarez@gmail.com en el campo de email.
		And se clickea Inicia sesion
		Then Se mantiene en login
		
#6 y 7
Scenario Outline: Login con correo correcto y contraseña incorrecto desde pagina principal
		When Se hace clic en el enlace de login.
		And Se ingresa el correo fca.ramirez.alvarez@gmail.com en el campo de email.
		And Se ingresa contraseña incorrecta <contrasena>
		And se clickea Inicia sesion
		Then Se mantiene en login
				
				Examples:
      |contrasena|
      |"ParaTesting158s"|
      |"ParaTesting158"|
      
#8 y 9
Scenario Outline: Login con correo correcto y contraseña incorrecto desde pagina login
		Given Se ingresa a la pagina login
		When Se ingresa el correo fca.ramirez.alvarez@gmail.com en el campo de email.
		And Se ingresa contraseña incorrecta desde login <contrasena>
		And se clickea Inicia sesion
		Then Se mantiene en login
		
				Examples:
      |contrasena|
      |"ParaTesting15"|
      |"ParaTesting158.."|

#10 y 11
Scenario Outline: Login con usuario incorrecto y contraseña correcta desde pagina principal
		When Se hace clic en el enlace de login.
		And Se ingresa un correo incorrecto en el campo de email <mailIncorrecto>
		And Se ingresa la contraseña Paratesting158. en el campo de contraseña.
		And se clickea Inicia sesion
		Then Se mantiene en login
		
				Examples:
      |mailIncorrecto|
      |"Hola1234@gmail.com"|
      |"fca.ramirez.alvarez@gmail.con"|
      
#12 y 13
Scenario Outline: Login con usuario incorrecto y contraseña correcta desde pagina login
		Given Se ingresa a la pagina login
		When Se ingresa un correo incorrecto en el campo de email desde login <mailIncorrecto>
		And Se ingresa la contraseña Paratesting158. en el campo de contraseña.
		And se clickea Inicia sesion
		Then Se mantiene en login
		
				Examples:
      |mailIncorrecto|
      |"Hola12345@gmail.com"|
      |"fca.ramirez.alvarez@gmail.cons"|
      
#14 y 15
Scenario Outline: Login con correo incorrecto y contraseña incorrecto desde pagina principal
		When Se hace clic en el enlace de login.
		When Se ingresa un correo incorrecto en el campo de email desde login <mailIncorrecto>
		And Se ingresa contraseña incorrecta <contrasena>
		And se clickea Inicia sesion
		Then Se mantiene en login
		
						Examples:
      |mailIncorrecto|contrasena|
      |"Hola12345@gmail.com"|"ParaTest@gmail.com"|
      |"fca.ramirez.alvarez@gmail.cons"|"Contrasena"|
      
#16 y 17
Scenario Outline: Login con correo incorrecto y contraseña incorrecto desde pagina login
		Given Se ingresa a la pagina login
		When Se ingresa un correo incorrecto en el campo de email desde login <mailIncorrecto>
		And Se ingresa contraseña incorrecta <contrasena>
		And se clickea Inicia sesion
		Then Se mantiene en login
		
						Examples:
      |mailIncorrecto|contrasena|
      |"Hola12345@gmail.com"|"ParaTest@gmail.com"|
      |"fca.ramirez.alvarez@gmail.cons"|"Contrasena"|
      
#18 
Scenario Outline: Login con correo correcto sin arroba y contraseña correcta desde pagina principal
		When Se hace clic en el enlace de login.
		And Se ingresa un correo correcto en el campo de email desde login <mailCorrecto>
		And Se ingresa la contraseña Paratesting158. en el campo de contraseña.
		And se clickea Inicia sesion
		Then Se mantiene en login
		
								Examples:
      |mailCorrecto|
      |"fca.ramirez.alvarezgmail.com"|

		
#19
Scenario Outline: Login con correo correcto sin arroba y contraseña correcta desde pagina login
		Given Se ingresa a la pagina login
		And Se ingresa un correo correcto en el campo de email desde login <mailCorrecto>
		And Se ingresa la contraseña Paratesting158. en el campo de contraseña.
		And se clickea Inicia sesion
		Then Se mantiene en login
		
								Examples:
      |mailCorrecto|
      |"fca.ramirez.alvarezgmail.com"|