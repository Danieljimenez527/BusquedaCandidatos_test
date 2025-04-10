Feature: Editar información del candidato

  Scenario: Editar la cédula del candidato Daniel Peña
    Given que el usuario ingresa a la página principal
    When hace clic en el botón "Candidatos"
    And selecciona el botón "Editar" del candidato "Daniel Peña"
    And cambia un número de la cédula por "1035863299"
    And presiona el botón "Guardar"
