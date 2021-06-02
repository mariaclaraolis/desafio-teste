package br.com.saraiva.automation.core;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Classe que contém todos os métodos e parâmetros que serão utilizados na execução dos testes.
 * 
 */ 
public class Framework {

	private static WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
	
	//Getters
	public static WebDriverWait getWait() {
		return wait;
	}
	

	// MÉTODOS
	
	/**
	 * Escrever em campo
	 * @param by
	 * @param texto
	 */
	public void escreve(By by, String texto) {
		esperaMiliseconds(5);
		DriverFactory.getDriver().findElement(by).click();
		DriverFactory.getDriver().findElement(by).clear();
		esperaMiliseconds(5);
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
		esperaMiliseconds(3);

	}
	public void escrever(String xpath_campo, String texto) {
		escreve(By.xpath(xpath_campo), texto + Keys.ENTER);
		
	}

	/**
	 * Clicar em botão
	 * @param by
	 */
	public void clicaBotao(By by) {
		Framework.getWait().until(ExpectedConditions.presenceOfElementLocated(by));
		DriverFactory.getDriver().findElement(by).click();
	}

	public void clicarBotao(String xpath) {
		clicaBotao(By.xpath(xpath));
	}
	
	/**
	 * Clicar em elemento 
	 * @param elemento
	 */
	public void clicarNoElemento(String elemento) {
		esperaMiliseconds(3);
		Framework.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemento)));
		Assert.assertTrue(DriverFactory.getDriver().findElement(By.xpath(elemento)).isDisplayed());
		DriverFactory.getDriver().findElement(By.xpath(elemento)).click();
		esperaMiliseconds(5);
		
	}
	
	
	/**
	 * Metodos de espera
	 * @param seconds
	 */
	public static void espera(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void esperarSeconds(int seconds) {
		espera(seconds * 1000);
	}
	
	public void esperaMiliseconds(int miliseconds) {
		espera(miliseconds * 100);
	}
	
	public void esperarElementoVisivel(String elemento) {
		Framework.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemento)));
		
	}
	
	/**
	 * Mudar de window
	 */
	public void mudarFocoDeWindow() {
		String originalHandle = DriverFactory.getDriver().getWindowHandle();
		esperaMiliseconds(5);
		Framework.getWait().until(ExpectedConditions.numberOfWindowsToBe(2));
		for (String handle : DriverFactory.getDriver().getWindowHandles()) {
			if (!(handle.equals(originalHandle))) {
				DriverFactory.getDriver().switchTo().window(originalHandle);
				DriverFactory.getDriver().switchTo().window(originalHandle).close();
				DriverFactory.getDriver().switchTo().window(handle);
			}
		}
		
	}
	
	/**
	 * Validar usuario logado
	 */
	public void validarUsarioLogado() {
		//TODO
	}
	
	/**
	 * Métodos com objetivo de retornarem data ou hora. 
	 * @return hora ou data.
	 */
	public static String getDataEHoraAtual() {
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formatador.format(data);
	}
	
	/**
	 * Tela Full Screen
	 */
	public void telaFullscreen() {
		DriverFactory.getDriver().manage().window().fullscreen();
	}

	/**
	 * Selecionar o país durante o cadastro
	 */
	public void selecionarPais(String element, String paisValor) {
		WebElement testDropDown = DriverFactory.getDriver().findElement(By.id(element)); 
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByValue(paisValor);
			
	}
	
	
}
