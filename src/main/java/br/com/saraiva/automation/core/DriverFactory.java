package br.com.saraiva.automation.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	private static WebDriver driver;

	// construtor
	private DriverFactory(){}

	/**
	 * M�todo que retorna o driver existente. Caso n�o exista, � criado.
	 * 
	 * @return driver
	 */
	public static WebDriver getDriver() {
		String url = "https://www.saraiva.com.br/";

		// chrome
		if (driver == null) {
			String chromePath = "C:\\Users\\"+System.getProperty("user.name")+"\\Downloads\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

	/**
	 * Este m�todo tem o objetivo de fechar o browser.
	 */
	public static void fecha() {
		getDriver().close();
	}

	/**
	 * Este m�todo tem o objetivo de finalizar a inst�ncia do browser.
	 */
	public static void finalizaDriver() {
		if (getDriver() != null) {
			getDriver().quit();
			driver = null;
		}
	}


}
