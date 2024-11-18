Feature: Realizar busqueda de producto
  
  Scenario: Realizar busqueda desde pagina principal
    Given Se ingresa al sitio principal
   	When hago clic en la posición X 720 y Y 190
    And Se ingresa nombre de producto al buscador "Newton"
    And Se realiza la busqueda
    Then Se puede ver el producto buscado
    




#712 y 190
#Newton
#Solo buscar sin parametros
#buscar solo con caracteres especiales
#el nombre de lo que quiero buscar con caracteres especiales
#el nombre de lo que quiero buscar con numeros
#el nombre de lo que quiero buscar con caracteres especiales entre el nombre como guion bajo etc

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
