Feature: Consulta de historial de pedidos

Background: Acceso a cuenta
		Given Se ingresa a la pagina principal
		When Se hace clic en el enlace de login.
		And Se ingresa el correo fca.ramirez.alvarez@gmail.com en el campo de email.
		And Se ingresa la contraseña Paratesting158. en el campo de contraseña.
		Then Se redirige a https://www.aldeajuegos.cl/mi-cuenta.

Scenario: Consulta de historial con usuario ingresado desde menú principal
			And Se ingresa al historial
			
#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
#