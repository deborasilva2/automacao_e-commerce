package steps;

import org.junit.After;

import elements.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class funcionalidadeLoginTeste {


	Metodos metodos = new Metodos();
	Elements elements = new Elements ();
	
	
	
	
	@After
	public void finalizarTeste() {
	Executa.fecharNavegador();
	}
	
	@Given("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {
	    Executa.abrirNavegador();
		}


	@When("quando insiro as credenciais de login")
	public void quando_insiro_as_credenciais_de_login() {
		metodos.inserirDados(elements.getUsername(), "standard_user");
		metodos.inserirDados(elements.getPassword(), "secret_sauce");
		metodos.clicar(elements.getBtnLogin());
	}

	@Then("então login será realizado com sucesso")
	public void então_login_será_realizado_com_sucesso() {
		metodos.validarTexto(elements.getTituloProd(),"Products");
		
		
	}
//Cenario 2
	
	
	@When("preencher o usuário")
	public void preencher_o_usuário() {
		metodos.inserirDados(elements.getUsername(), "standard_user");
	}

	@When("não preenche a senha")
	public void não_preenche_a_senha() {
		metodos.inserirDados(elements.getPassword(), "");
	}

	@When("clicar no botão login")
	public void clicar_no_botão_login() {
		metodos.clicar(elements.getBtnLogin());
	}

	@Then("o usuário receberá uma mensagem de erro")
	public void o_usuário_receberá_uma_mensagem_de_erro() {
		metodos.validaMsgErroSenha(elements.getMsgErroSenha(), "Epic sadface: Password is required");
		
	}
	
// Cenario 3
	
	@When("preencher a senha")
	public void preencher_a_senha() {
		metodos.inserirDados(elements.getPassword(), "secret_sauce");
	}

	@When("não preenche o usuário")
	public void não_preenche_o_usuário() {
	metodos.inserirDados(elements.getUsername(), "");
	
	}
	
	@Then("o usuário recebe uma mensagem de erro")
	public void o_usuário_recebe_uma_mensagem_de_erro() {
	metodos.validaMsgErroSenha(elements.getMsgErroSenha(), "Epic sadface: Password is required");
	}
	
 //Cenario 4
	
	@When("realizo o login com sucesso e identifico o produto desejado")
	public void realizo_o_login_com_sucesso_e_identifico_o_produto_desejado() {
		metodos.inserirDados(elements.getUsername(), "standard_user");
		metodos.inserirDados(elements.getPassword(), "secret_sauce");
		metodos.clicar(elements.getBtnLogin());
	}

	@When("clico no botão Add To Cart")
	public void clico_no_botão_add_to_cart() {
	    metodos.clicar(elements.getAddCart());
	}

	@When("clico no carrinho")
	public void clico_no_carrinho() {
	   metodos.clicar(elements.getCarrinho());
	}

	@Then("visualizo os produtos no carrinho")
	public void visualizo_os_produtos_no_carrinho() {
	  
	}

	//cenario 5
	@When("informar o usuário {string}")
	public void informar_o_usuário(String usuário) {    
		metodos.inserirDados(elements.getUsername(), "standard_user");
	}

	@When("informar a senha {string}")
	public void informar_a_senha(String senha) {
		metodos.inserirDados(elements.getPassword(), "secret_sauce");
		metodos.clicar(elements.getBtnLogin());
	}

	@Then("validar a mensagem {string}")
	public void validar_a_mensagem(String mensagem) {
		metodos.validaMsg(mensagem);
	}



	
}


