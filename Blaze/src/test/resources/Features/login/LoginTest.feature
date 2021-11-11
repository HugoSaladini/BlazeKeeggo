Feature: Teste login usuario

  @T0001
  Scenario Outline: Realiza login
    Given abre o browser
    And user clica em LogIn
    When user preenche campo de <username> e <password>
    And user clica em logar
    Then valida campo de Usuario ativo

    Examples: 
      | username | password |
      | saladini |     0123 |
