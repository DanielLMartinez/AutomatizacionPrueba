Feature: Actualización de datos personales

  Scenario: Actualización de nombre con sesión iniciada
    Given Se ingresa al sitio "https://www.aldeajuegos.cl/datos-personales"
    When El campo de nombre contiene el valor "FRANCISCA"
    And Se cambia el valor del campo de nombre a "A"
    And Se ingresa la contraseña "Paratesting158." en el campo correspondiente
    And Se selecciona la opción para guardar los cambios
    Then Aparece el mensaje "Información actualizada correctamente"
    And El campo de nombre muestra "A"
