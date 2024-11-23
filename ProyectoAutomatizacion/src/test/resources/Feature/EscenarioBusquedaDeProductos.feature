Feature: Feature: Búsqueda de productos en la tienda online
 
 Scenario: Buscar Juegos de Mesa
    Given el usuario selecciona la categoría para búsqueda "Juegos de Mesa"
    When el usuario escribe "Juegos de Mesa" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Mantis"

  Scenario: Buscar Figuras
    Given el usuario selecciona la categoría para búsqueda "Figuras"
    When el usuario escribe "Figuras" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Figuras"

  Scenario: Buscar Puzzles
    Given el usuario selecciona la categoría para búsqueda "Puzzles"
    When el usuario escribe "Puzzles" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Set"
    
    Scenario: Buscar Todos
    Given el usuario selecciona la categoría para búsqueda "Todos"
    When el usuario escribe "Todos" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Todos"

  Scenario: Buscar Eventos
    Given el usuario selecciona la categoría para búsqueda "Eventos"
    When el usuario escribe "Eventos" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Timeline"

  Scenario: Buscar Accesorios
    Given el usuario selecciona la categoría para búsqueda "Accesorio"
    When el usuario escribe "Accesorio" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "GG"

  Scenario: Buscar Cartas
    Given el usuario selecciona la categoría para búsqueda "Cartas"
    When el usuario escribe "Cartas" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Guerra"

  Scenario: Buscar Preventa
    Given el usuario selecciona la categoría para búsqueda "Preventa"
    When el usuario escribe "Preventa" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Preventa"
    
  Scenario: Buscar Jugueteria
    Given el usuario selecciona la categoría para búsqueda "Jugueteria"
    When el usuario escribe "Jugueteria" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Mmm"
    
  Scenario: Buscar elemento con arroba al principio
    Given el usuario selecciona elemento para búsqueda "@Jugueteria"
    When el usuario escribe "@Jugueteria" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Puzzle"
    
   Scenario: Buscar elemento con exclamacion al final
    Given el usuario selecciona elemento para búsqueda "Jugueteria!"
    When el usuario escribe "Jugueteria!" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Puzzle"
    
   Scenario: Buscar elemento con punto al principio
    Given el usuario selecciona elemento para búsqueda ".Jugueteria"
    When el usuario escribe ".Jugueteria" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Puzzle"
    
   Scenario: Buscar elemento con exclamacion al principio
    Given el usuario selecciona elemento para búsqueda "!Jugueteria"
    When el usuario escribe "!Jugueteria" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Puzzle"
   
   Scenario: Buscar elemento con espacio al final
    Given el usuario selecciona elemento para búsqueda "Jugueteria "
    When el usuario escribe "Jugueteria " en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Puzzle"
    
   Scenario: Buscar elemento con espacio al principio
    Given el usuario selecciona elemento para búsqueda " Jugueteria"
    When el usuario escribe " Jugueteria" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Puzzle"
    
   Scenario: Buscar elemento con - al principio
    Given el usuario selecciona elemento para búsqueda "-Eventos"
    When el usuario escribe "-Eventos" en la barra de búsqueda
    And el usuario envía la búsqueda
    Then se muestra una página con el título que contiene "Timeline"