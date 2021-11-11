//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.loginPage;
//
//public class EfetuaLogin {
//
//	WebDriver driver = null;
//	loginPage login;

//	@Given("abre o browser")
//	public void abre_o_browser() {
//
//		System.out.println("=== | Teste Efetua Login | ===");
//
//		System.out.println("Passo - abre pagina do site");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is :" + projectPath);
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//	
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.demoblaze.com/index.html");
//	}
//
//	@And("user clica em LogIn")
//	public void user_clica_em_LogIn() throws InterruptedException {
//
//		System.out.println("Passo - user clica em LogIn");
//		driver.findElement(By.id("login2")).click();
//		Thread.sleep(2000);
//
//	}
//
//	@When("^user preenche campo de (.*) e (.*)$")
//	public void user_preenche_campo_de_username_e_password(String username, String password)
//			throws InterruptedException {
//
//		login = new loginPage(driver);
//		
//		System.out.println("Passo - user preenche campo de username e password");
//		login.enterUsername(username);
//		login.enterPassword(password);
//		Thread.sleep(2000);
//	}
//
//	@And("user clica em logar")
//	public void user_clica_em_logar() throws InterruptedException {
//
//		System.out.println("Passo - user clica em logar");
//		login.clickLogin();
//		Thread.sleep(2000);
//	}
//
//	@Then("valida campo de Usuario ativo")
//	public void valida_campo_de_Usuario_ativo() {
//		System.out.println("Passo - user preenche campo de username e password");
//
//		login.validLogin();
//		driver.close();
//		driver.quit();	
//	}
//
//}
