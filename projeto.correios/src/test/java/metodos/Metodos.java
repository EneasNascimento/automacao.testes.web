package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos extends DriversFactory {

	public static void abrirNavegador(String url, String browser, boolean headless) {
		
		/*
		 * O SELENIUM NÃO ESTÁ ABRINDO A CHROME 11
		 * 
		 * FOI ACRESCENTADO MAIS UMA DEPENDÊNCIA DO SELENIUM NO POM.XML
		 * 
		 * -> selenium-http-jdk-client
		 * 
		 * COM ESSA ALTERAÇÃO SÓ ESTÁ SENDO POSSÍVEL USAR O System.setProperty para abrir a página com as alteraçães abaixo
		
		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();

			if (!headless) {
				chromeOptions.addArguments("--headless");
			}

			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();

			if (!headless) {
				firefoxOptions.addArguments("--headless");
			}
			firefoxOptions.addArguments("--start-maximized");
			driver = new FirefoxDriver(firefoxOptions);

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();

			if (!headless) {
				edgeOptions.addArguments("--headless");
			}
			edgeOptions.addArguments("--start-maximized");
			driver = new EdgeDriver(edgeOptions);
			
		} else {
			System.out.println("Opção inválida escolha CHROME, FIREFOX ou EDGE.");
		}

		driver.get(url);
		*/
		
		
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.http.factory", "jdk-http-client");
			ChromeOptions chromeOptions = new ChromeOptions();

			if (!headless) {
				chromeOptions.addArguments("--headless");
			}

			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();

			if (!headless) {
				firefoxOptions.addArguments("--headless");
			}
			firefoxOptions.addArguments("--start-maximized");
			driver = new FirefoxDriver(firefoxOptions);

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();

			if (!headless) {
				edgeOptions.addArguments("--headless");
			}
			edgeOptions.addArguments("--start-maximized");
			driver = new EdgeDriver(edgeOptions);
			
		} else {
			System.out.println("Opção inválida escolha CHROME, FIREFOX ou EDGE.");
		}

		driver.get(url);
	}

	public static void fecharNavegador() {
		driver.quit();
	}
	
	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public static void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	
	

}
