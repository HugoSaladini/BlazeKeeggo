//package br.com.keeggo.test.carrinho;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class CarrinhoSteps {
//
//	WebDriver driver = null;
//	
////	LoginPage login;
//	CarrinhoPage carrinho;
//
//	@Given("abre o browser")
//	public void abre_o_browser() {
//
//		System.out.println("=== | Teste Efetua colcoar produto no carrinho | ===");
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
////		System.out.println("Passo - user clica em LogIn");
////		driver.findElement(By.id("login2")).click();
////		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
//		carrinho = new CarrinhoPage(driver);
//		
//		System.out.println("Passo - user preenche campo de username e password");
//		carrinho.enterUsername(username);
//		carrinho.enterPassword(password);
//		Thread.sleep(2000);
//		
////	public void user_preenche_campo_de_username_e_password() {
////
////		System.out.println("Passo - user preenche campo de username e password");
////
////		driver.findElement(By.id("loginusername")).sendKeys("saladini");
////		driver.findElement(By.id("loginpassword")).sendKeys("0123");
////
//		// driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
//		// driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
//		// Thread.sleep(5000);
//
//	}
//
//	@And("user clica em logar")
//	public void user_clica_em_logar() throws InterruptedException {
//
//		System.out.println("Passo - user clica em logar");
//		carrinho.clickLogin();
//		Thread.sleep(2000);
//
//	}
//
//	@When("user clica em um produto")
//	public void user_clica_em_um_produto() throws InterruptedException {
//
//		System.out.println("Passo - user clica em um produto disponivel");
//
//		//driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
//		
//		carrinho.selecionaProduto();
//		
//		Thread.sleep(2000);
//		
//	}
//
//	@And("user clica em um add to cart")
//	public void user_clica_em_um_add_to_cart() throws InterruptedException {
//
//		System.out.println("Passo - user clica em adicionar produto ao carrinho");
//
//		//driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
//		
//		carrinho.adicionaProduto();
//		Thread.sleep(2000);
//
//	}
//
//	@Then("valida pop up de produto no carrinho")
//	public void valida_pop_up_de_produto_no_carrinho() {
//
//		System.out.println("Passo - user valida o campo com produto no carrinho");
//
//		//driver.getPageSource().contains("Product added.");
//		carrinho.validarPopup();
//		driver.close();
//		driver.quit();
//
//	}
//
//}
