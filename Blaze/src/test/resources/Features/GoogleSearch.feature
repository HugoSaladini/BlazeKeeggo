Feature: Feature de teste de pesquisa no Google
	
	@T0000
  Scenario: Valida se Google search esta em operacao
    Given browser abre pagina do google
    And user esta na pagina do google
    When user coloca texto na na caixa de pesquisa
    And preciona enter
    Then user navega pela pagina
