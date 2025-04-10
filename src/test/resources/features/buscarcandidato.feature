Feature: Buscar candidato por nombre

  Scenario: Buscar un candidato específico por su nombre completo
    Given que el usuario abre la página de candidatos
    When el usuario busca el candidato llamado "Daniel Peña"
    Then debería ver al candidato "Daniel Peña"