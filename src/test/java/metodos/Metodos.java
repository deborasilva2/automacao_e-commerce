package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.Driver;

public class Metodos extends Driver {

	String tituloEsperado = "Products";
	String msgErroSenha = "Epic sadface: Password is required";
	String msgErroUser = "Epic sadface: Username is required";
	
	public void inserirDados(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void validarTexto(By elemento, String tituloEsperado) {
		assertEquals(tituloEsperado,driver.findElement(elemento).getText());
		
	}

	public void validaMsgErroSenha(By elemento, String msgErroSenha) {
		assertEquals(msgErroSenha,driver.findElement(elemento).getText());
		
	}
	
	public void validaMsg (String MsgEsperada) {
		
		if (MsgEsperada.equals(tituloEsperado)) {
			
		}else if (MsgEsperada.equals(msgErroSenha)) {
			
		}else {
			assertEquals(MsgEsperada, msgErroUser);
		}
			
		
	}
	
	
	}
	

