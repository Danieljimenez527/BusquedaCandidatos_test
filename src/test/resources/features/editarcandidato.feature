Feature: Editar información del candidato

  Scenario: Editar nombre y apellido del candidato "Juan Martinez"
    Given que el usuario ingresa a la página principal
    When hace clic en el botón "Candidatos"
    And selecciona el botón "Editar" del candidato "Juan Martinez"
    And cambia el nombre por "Lionel"
    And cambia el apellido por "Messi"
    And presiona el botón "Guardar"
