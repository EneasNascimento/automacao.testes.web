#Author: eneas.nascimento@bibssmash.com.br

@positivo
Feature: Buscar nome da rua pelo CEP
  Como usuario do site dos correios
  Quero digitar o numero do cep
  Para visualizar o nome da rua

  @tag1
  Scenario: Buscar cep valido
    Given esteja na home page
    When informar o cep valido
    And clicar no botao pesquisar
    And visualizo o nome da rua


