Feature: Teste remove produto do carrinho

  @T0002
  Scenario: Remover produto do carrinho
    Given abre o browser
    And user clica em LogIn
    When user preenche campo de username e password
    And user clica em logar
    When user clica em Cart
    Then user clica em Delete
    
    