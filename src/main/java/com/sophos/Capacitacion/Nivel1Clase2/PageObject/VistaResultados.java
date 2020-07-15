package com.sophos.Capacitacion.Nivel1Clase2.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class VistaResultados {
	private WebDriver driver;

	public VistaResultados(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	@FindBy(tagName = "li")
	List<WebElement> listaRespuestas;
	
	
	public void imprimaTextosEnLista() {
		System.out.println("Cantidad de respuestas: ");
		System.out.println(listaRespuestas.size());
		for(WebElement elemento: listaRespuestas) {
			System.out.println(elemento.getText());
		}
	}
	
	public void seleccionePrimerElemento() {
		WebElement auxiliar;
		System.out.println("Cantidad de respuestas: ");
		System.out.println(listaRespuestas.size());
		for(WebElement elemento: listaRespuestas) {
			if(elemento.getText().contains("$") && elemento.isDisplayed()) {
				auxiliar = elemento.findElement(By.tagName("h2"));
				System.out.println("El texto que contiene es:\n"+auxiliar.getText());
				auxiliar.click();
				break;
			}
		}
	}
	


}
