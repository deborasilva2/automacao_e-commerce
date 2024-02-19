#Author: debora31silva@gmail.com

@Regressivo
Feature: Realizar Login
	Como usuário do site Sauce Demo
	Quero informar os dados de acesso
	Para acessar a área logada
	
Background: Acessar tela login
	Given que eu esteja na tela de login
	
@Positivo	
	Scenario: Login Válido
	When quando insiro as credenciais de login
	Then então login será realizado com sucesso

@Negativo
	Scenario: Login Inválido senha não preenchida
	When preencher o usuário
	And não preenche a senha
	And clicar no botão login
	Then o usuário receberá uma mensagem de erro
	
	Scenario: Login Inválido usuário não preenchido
	When preencher a senha
	And não preenche o usuário
	And clicar no botão de login
	Then o usuário recebe uma mensagem de erro
		
	Scenario: Adicionar produto
	When realizo o login com sucesso e identifico o produto desejado
	And clico no botão Add To Cart
	And clico no carrinho
	Then visualizo os produtos no carrinho 