package carrinho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoverProduto {
	
	WebDriver driver = null;
	
	@Given("abre o browser")
	public void abre_o_browser() {

		System.out.println("Passo - abre pagina do site");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is :" + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
	}

	@And("user clica em LogIn")
	public void user_clica_em_LogIn() {
	    
		System.out.println("Passo - user clica em LogIn");
		
		driver.findElement(By.id("login2")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

	@When("user preenche campo de username e password")
	public void user_preenche_campo_de_username_e_password() {
	    
		System.out.println("Passo - user preenche campo de username e password");
		
		driver.findElement(By.id("loginusername")).sendKeys("saladini");
		driver.findElement(By.id("loginpassword")).sendKeys("0123");
		
		//driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		
	}

	@And("user clica em logar")
	public void user_clica_em_logar() throws InterruptedException {
	    
		System.out.println("Passo - user clica em logar");
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	}

	@When("user clica em Cart")
	public void user_clica_em_Cart() {
		
		System.out.println("Passo - user clica no cart");
		
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		
	}

	@Then("user clica em Delete")
	public void user_clica_em_Delete() {
		
		System.out.println("Passo - user clica no cart");
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a")).click();
		
		driver.close();
		driver.quit();
		
	}

}
