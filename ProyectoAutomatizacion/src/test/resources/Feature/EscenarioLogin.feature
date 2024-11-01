Feature: Inicio de Sesion

Scenario: Login con datos correctos desde página principal
Given: Se ingresa al sitio https://www.aldeajuegos.cl/
When: Se hace clic en el enlace de login.
And: Se ingresa el correo fca.ramirez.alvarez@gmail.com en el campo de email.
And: Se ingresa la contraseña Paratesting158. en el campo de contraseña.
Then: Se redirige a https://www.aldeajuegos.cl/mi-cuenta.

