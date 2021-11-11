//package br.com.keeggo.test.carrinho;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class CarrinhoPage {
//	
//	WebDriver driver;
//	
//	By txt_username = By.id("loginusername");
//	By txt_password = By.id("loginpassword");
//	By btn_login = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
//	
//	By slc_produto = By.xpath("//*[@id=\\\"tbodyid\\\"]/div[1]/div/a/img");
//	By slc_add_produto = By.xpath("//*[@id=\\\"tbodyid\\\"]/div[2]/div/a");
//	
//	
//
//	public CarrinhoPage(WebDriver driver) {
//
//		this.driver = driver;
//	}
//
//	public void enterUsername(String username) {
//
//		driver.findElement(txt_username).sendKeys(username);
//	}
//
//	public void enterPassword(String password) {
//
//		driver.findElement(txt_password).sendKeys(password);
//	}
//
//	public void clickLogin() {
//
//		driver.findElement(btn_login).click();
//	}
//
//	public void validLogin() {
//
//		driver.getPageSource().contains("Welcome saladini");
//	}
//	
//	public void selecionaProduto () {
//		
//		driver.findElement(slc_produto).click();
//		
//	}
//	
//	public void adicionaProduto () {
//		
//		driver.findElement(slc_add_produto).click();
//		
//	}
//	
//	public void validarPopup() {
//		
//		driver.getPageSource().contains("Product added.");
//
//	}
//
//}
