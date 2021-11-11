Feature: Teste remove produto do carrinho

  @T0004
  Scenario: Remover produto do carrinho
    Given abre o browser
    And user clica em Sign up
    When user preenche campo de username e password
    And user clica em Cadastrar
    Then Valido pop up de Sign up successful
