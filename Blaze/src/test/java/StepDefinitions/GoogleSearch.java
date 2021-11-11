//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GoogleSearch {
//
//	WebDriver driver = null;
//
//	@Given("browser abre pagina do google")
//	public void browser_abre_pagina_do_google() {
//
//		System.out.println("Inside Step - User abre a pagina do Google");
//
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is :" + projectPath);
//
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//		// driver.manage().window().maximize();
//
//	}
//
//	@And("user esta na pagina do google")
//	public void user_esta_na_pagina_do_google() {
//		System.out.println("Inside Step - User esta na pagina do Google");
//
//		driver.navigate().to("https://google.com");
//	}
//
//	@When("user coloca texto na na caixa de pesquisa")
//	public void user_coloca_texto_na_na_caixa_de_pesquisa() throws InterruptedException {
//		System.out.println("Inside Step - User colcoa o texto na caixa de pesquisa");
//
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//
//		Thread.sleep(2000);
//
//	}
//
//	@And("preciona enter")
//	public void preciona_enter() throws InterruptedException {
//		System.out.println("Inside Step - User presciona enter");
//
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//		Thread.sleep(2000);
//	}
//
//	@Then("user navega pela pagina")
//	public void user_navega_pela_pagina() {
//		System.out.println("Inside Step - User navega pelo resultado");
//
//		driver.getPageSource().contains("Online Courses");
//
//		driver.close();
//		driver.quit();
//	}
//
//}
