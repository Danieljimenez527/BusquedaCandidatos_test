Feature: Postulación de un candidato a una vacante y avance en el proceso de reclutamiento

  Scenario: Postulación exitosa de un candidato
    Given que existe un candidato registrado con el ID "1"
    And el reclutador ha iniciado sesión en la plataforma
    When busca al candidato por ID "1"
    And selecciona una vacante disponible
    And confirma la postulación
    Then la interfaz muestra un mensaje de éxito con un ID de postulación generado

  Scenario: Fallo en la postulación por vacante inexistente
    Given que existe un candidato registrado con el ID "1"
    And el reclutador ha iniciado sesión en la plataforma
    When busca al candidato por ID "1"
    And intenta postularlo a una vacante inexistente
    Then la interfaz muestra un mensaje de error indicando "La vacante seleccionada no está disponible"

  Scenario: Avance exitoso de un candidato a la siguiente fase
    Given que el candidato está en un proceso activo
    And el reclutador ha iniciado sesión en la plataforma
    When busca al candidato por ID
    And selecciona la nueva fase "Entrevista"
    And confirma la actualización
    Then la interfaz muestra la fase actualizada a "Entrevista"

  Scenario: Fallo al avanzar a una fase no válida
    Given que el candidato está en un proceso activo
    And el reclutador ha iniciado sesión en la plataforma
    When busca al candidato por ID
    And intenta actualizar a una fase inexistente "Cierre Directo"
    Then la interfaz muestra un mensaje de error indicando "Fase no válida para este proceso"