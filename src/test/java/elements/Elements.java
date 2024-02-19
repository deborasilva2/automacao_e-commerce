package elements;

import org.openqa.selenium.By;

public class Elements {

	private By username = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@id='password']");
	private By btnLogin = By.xpath("//input[@id='login-button']");
	private By tituloProd = By.xpath("//div[@class='product_label']");
	private By msgErroSenha = By.xpath("//h3[@data-test='error']");
	private By addCart = By.xpath("(//button[@class='btn_primary btn_inventory'])[1]");
	private By carrinho = By.xpath("//div[@class='shopping_cart_container']");
	private By msgErroUser = By.xpath("//button[@class='error-button']");
		
	public By getUsername() {
		return username;
	}
	public By getPassword() {
		return password;
	}
	public By getBtnLogin() {
		return btnLogin;
	}
	public By getTituloProd() {
		return tituloProd;
	}
	public By getMsgErroSenha() {
		return msgErroSenha;
	}
	public By getAddCart() {
		return addCart;
	}
	public By getCarrinho() {
		return carrinho;
	}
	public By getMsgErroUser() {
		return msgErroUser;
	}
	
		
}
