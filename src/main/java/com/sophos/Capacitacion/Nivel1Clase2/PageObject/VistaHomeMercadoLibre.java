package com.sophos.Capacitacion.Nivel1Clase2.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class VistaHomeMercadoLibre {
	private WebDriver driver;
	
	public VistaHomeMercadoLibre(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10) , this);
	}
	
	@FindBy(name = "as_word")
	WebElement cajaTextoBusqueda;
	
	public void setTextAndLookFor(String text) {
		cajaTextoBusqueda.sendKeys(text);
		cajaTextoBusqueda.submit();
	}
}
