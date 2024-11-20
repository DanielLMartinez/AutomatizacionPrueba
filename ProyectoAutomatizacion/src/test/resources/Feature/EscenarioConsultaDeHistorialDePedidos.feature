Feature: Consulta de historial de pedidos

Background: Acceso a cuenta
			Given Se inicia sesion para consular historial

#9
Scenario: Consulta de historial con usuario ingresado desde login
			When Se ingresa al historial
			Then Se confirma accede al historial
			
#10
Scenario: Consulta de primer pedido del historial con usuario ingresado
			When Se ingresa al historial
			And Se confirma accede al historial
			Then Se verifica ID de primer pedido

#11 
Scenario: Consulta de historial con usuario ingresado desde menú principal
			When Se ingresa a la pagina principal
			And Se ingresa nuevamente a las opciones de cuenta
			Then Se confirma accede al historial

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
#					
#con esta url ingresa de inmediato al historial driver.get("https://www.aldeajuegos.cl/iniciar-sesion?back=history");