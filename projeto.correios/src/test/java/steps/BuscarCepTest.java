package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.HomePage;

public class BuscarCepTest {
	
	HomePage home = new HomePage();


	@Given("esteja na home page")
	public void estejaNaHomePage() {
		Metodos.abrirNavegador(home.urlCorreios, "chrome", true);
	    
	}
	@When("informar o cep valido")
	public void informarOCepValido() {
		Metodos.clicar(home.carol);
		Metodos.escrever(home.campoCep, home.cep);
	    
	}
	@When("clicar no botao pesquisar")
	public void clicarNoBotaoPesquisar() {
		Metodos.clicar(home.btnPesquisar);
	    
	}
	@When("visualizo o nome da rua")
	public void visualizoONomeDaRua() {
	   
	}

}
