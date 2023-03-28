package pages;

import org.openqa.selenium.By;

public class HomePage {
	
	public String urlCorreios = "https://www.correios.com.br";
	public String resultBuscaCep = "https://buscacepinter.correios.com.br/app/endereco/index.php?t";
	public String cep = "18052445";
	
	public By carol = By.id("carol-fecha");
	public By campoCep = By.id("relaxation");
	public By btnPesquisar = By.xpath("//div[@class='card card-mais-acessados ordem'][2]//button");
	

}
