#Author: debora31silva@gmail.com

Feature: Realizar Login
	Como usuário do site Sauce Demo
	Quero informar os dados de acesso
	Para acessar a área logada
	
Background: Acessar tela login
	Given que eu esteja na tela de login
	

  Scenario Outline: Login utilizando Schema
    When informar o usuário <usuário>
    And informar a senha <senha>
    Then validar a mensagem <mensagem>
 
    Examples: 
      | usuário  | senha | mensagem  																			|
      |"standard_user"|"secret_sauce"|"products"													|
     	|"standard_user"|			""			 |"Epic sadface: Password is required"|
			|			""			  |"secret_sauce"|"Epic sadface: Username is required"|
