Feature: Teste adiciona produto ao carrinho

  @T0002
  Scenario: Adiciona produto ao carrinho
    Given abre o browser
    And user clica em LogIn
    When user preenche campo de username e password
    And user clica em logar
    When user clica em um produto
    And user clica em um add to cart
    Then valida pop up de produto no carrinho
