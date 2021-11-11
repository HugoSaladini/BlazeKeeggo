//package login;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class CadastrarUsuario {
//	
//	WebDriver driver = null;
//	
//	@Given("abre o browser")
//	public void abre_o_browser() {
//		System.out.println("Passo - abre pagina do site");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is :" + projectPath);
//
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.demoblaze.com/index.html");
//		
//	}
//
//	@Given("user clica em Sign up")
//	public void user_clica_em_Sign_up() throws InterruptedException {
//	    
//		System.out.println("Passo - user clica no botão de criar conta");
//		
//		driver.findElement(By.id("signin2")).click();
//		
//		Thread.sleep(2000);
//		
//	}
//
//	@When("user preenche campo de username e password")
//	public void user_preenche_campo_de_username_e_password() {
//	    
//		System.out.println("Passo - user preenche campo de username e password");
//		
//		driver.findElement(By.id("sign-username")).sendKeys("saladini");
//		driver.findElement(By.id("sign-password")).sendKeys("0123");
//		
//	}
//
//	@When("user clica em Cadastrar")
//	public void user_clica_em_Cadastrar() throws InterruptedException {
//	    
//		System.out.println("Passo - user clica em Cadastrar");
//		
//		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
//		
//		Thread.sleep(2000);
//
//	}
//
//	@Then("Valido pop up de Sign up successful")
//	public void valido_pop_up_de_Sign_up_successful() {
//
//		System.out.println("Passo - user valida o pop up de conta criada");
//		
//		driver.getPageSource().contains("Sign up successful.");
//		
//		driver.close();
//		driver.quit();
//	}
//
//}
