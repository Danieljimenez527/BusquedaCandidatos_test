Feature: Búsqueda de candidatos

  Scenario: Búsqueda exitosa de un candidato por nombre completo
    Given que existe un candidato registrado con el nombre "Juan Carlos Pérez"
    When el reclutador ingresa "Juan Carlos Pérez" en el campo de búsqueda
    And hace clic en el botón de búsqueda
    Then la interfaz muestra los datos correctos del candidato "Juan Carlos Pérez"

  Scenario: Búsqueda fallida de un candidato inexistente
    Given que no existe un candidato registrado con el nombre "Pedro Gómez"
    When el reclutador ingresa "Pedro Gómez" en el campo de búsqueda
    And hace clic en el botón de búsqueda
    Then la interfaz muestra un mensaje indicando "No se encontraron resultados"

  Scenario: Búsqueda exitosa de candidatos con coincidencia parcial en el nombre
    Given que existen candidatos registrados cuyos nombres contienen "Juan"
    When el reclutador ingresa "Juan" en el campo de búsqueda
    And hace clic en el botón de búsqueda
    Then la interfaz muestra una lista de candidatos cuyos nombres contienen "Juan"

  Scenario: Búsqueda sin resultados debido a la falta de coincidencias
    Given que no existen candidatos registrados cuyos nombres contengan "Xyz"
    When el reclutador ingresa "Xyz" en el campo de búsqueda
    And hace clic en el botón de búsqueda
    Then la interfaz muestra un mensaje indicando "No se encontraron resultados"

  Scenario: Búsqueda exitosa de un candidato por ID válido
    Given que existe un candidato registrado con el ID "1"
    When el reclutador ingresa "1" en el campo de búsqueda por ID
    And hace clic en el botón de búsqueda
    Then la interfaz muestra los datos del candidato con ID "1"

  Scenario: Búsqueda fallida de un candidato con un ID inexistente
    Given que no existe un candidato registrado con el ID "9999"
    When el reclutador ingresa "9999" en el campo de búsqueda por ID
    And hace clic en el botón de búsqueda
    Then la interfaz muestra un mensaje indicando "No se encontraron resultados"