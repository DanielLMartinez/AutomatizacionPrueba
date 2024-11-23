Feature: Filtrar productos

  Scenario: Filtrar por Juegos de Mesa
    Given el usuario selecciona la categoría para búsqueda "Juegos de Mesa"
    When el usuario hace clic en el filtro "JUEGOS DE MESA"
    Then se muestra una página con el título que contiene "Juegos de Mesa"

  Scenario: Filtrar por Preventas
    Given el usuario selecciona la categoría para búsqueda "Preventa"
    When el usuario hace clic en el filtro "PREVENTA"
    Then se muestra una página con el título que contiene "Preventa"

  Scenario: Filtrar por Accesorios Juegos
    Given el usuario selecciona la categoría para búsqueda "Accesorios Juegos"
    When el usuario hace clic en el filtro "ACCESORIOS JUEGOS"
    Then se muestra una página con el título que contiene "Accesorios Juegos"

  Scenario: Filtrar por Cartas Coleccionables
    Given el usuario selecciona la categoría para búsqueda "Cartas Coleccionables"
    When el usuario hace clic en el filtro "CARTAS COLECCIONABLES (TCG)"
    Then se muestra una página con el título que contiene "Cartas Coleccionables"

  Scenario: Filtrar por Todos
    Given el usuario selecciona la categoría para búsqueda "Todos"
    When el usuario hace clic en el filtro "TODOS"
    Then se muestra una página con el título que contiene "La"

  Scenario: Filtrar por Puzzles
    Given el usuario selecciona la categoría para búsqueda "Puzzles"
    When el usuario hace clic en el filtro "PUZZLES"
    Then se muestra una página con el título que contiene "Puzzles"

  Scenario: Filtrar por Eventos
    Given el usuario selecciona la categoría para búsqueda "Eventos"
    When el usuario hace clic en el filtro "EVENTOS"
    Then se muestra una página con el título que contiene "Eventos"

  Scenario: Filtrar por Juguetería
    Given el usuario selecciona la categoría para búsqueda "Juguetería"
    When el usuario hace clic en el filtro "JUGUETERÍA"
    Then se muestra una página con el título que contiene "Juguetería"
    
    
