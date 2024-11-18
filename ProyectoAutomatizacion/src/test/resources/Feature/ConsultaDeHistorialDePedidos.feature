Feature: Consulta de historial de pedidos

Scenario:  Consulta de historial con usuario ingresado desde menú principal
Given Se ingresa al sitio principal
When Se ingresa al enlace "//*[@id='_desktop_user_info']/div/a/span"
#And Se redirige a "https://www.aldeajuegos.cl/mi-cuenta"
#And Se ingresa a "//*[@id='history-link']"
Then Se redirige al login

