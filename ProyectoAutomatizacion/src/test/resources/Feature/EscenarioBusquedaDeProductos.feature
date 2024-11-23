Feature: Feature: Búsqueda de productos en la tienda online
 
 @Unico
 Scenario: Buscar Juegos de Mesa
    Given el usuario selecciona la categoría para búsqueda "Juegos de Mesa"
    When el usuario escribe "Juegos de Mesa" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Juegos de Mesa"

  Scenario: Buscar Figuras
    Given el usuario selecciona la categoría para búsqueda "Figuras"
    When el usuario escribe "Figuras" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Figuras"

  Scenario: Buscar Puzzles
    Given el usuario selecciona la categoría para búsqueda "Puzzles"
    When el usuario escribe "Puzzles" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Puzzles"
    
    Scenario: Buscar Todos
    Given el usuario selecciona la categoría para búsqueda "Todos"
    When el usuario escribe "Todos" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Todos"

@Unico
  Scenario: Buscar Eventos
    Given el usuario selecciona la categoría para búsqueda "Eventos"
    When el usuario escribe "Eventos" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Eventos"

@Unico
  Scenario: Buscar Accesorios
    Given el usuario selecciona la categoría para búsqueda "Accesorio"
    When el usuario escribe "Accesorio" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "GG"

  Scenario: Buscar Cartas
    Given el usuario selecciona la categoría para búsqueda "Cartas"
    When el usuario escribe "Cartas" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Cartas"

  Scenario: Buscar Preventa
    Given el usuario selecciona la categoría para búsqueda "Preventa"
    When el usuario escribe "Preventa" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Preventa"

  @Unico
  Scenario: Buscar Juguetería
    Given el usuario selecciona la categoría para búsqueda "Jugueteria"
    When el usuario escribe "Jugueteria" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Puzzle"