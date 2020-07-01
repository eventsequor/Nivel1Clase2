package com.sophos.Capacitacion.Nivel1Clase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Driver {
	WebDriver driver;
	public Driver() {
		
	}
	
	public void navegadorGoogle() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	
	public void navegadorFire() {
		System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.eltiempo.com/");
		driver.close();
	}
	
	public void navegadorInternetExplore() {
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", rutaDriver);
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.ignoreZoomSettings();
		options.introduceFlakinessByIgnoringSecurityDomains();
		options.enablePersistentHovering();
		options.disableNativeEvents();
		WebDriver driver = new InternetExplorerDriver(options);
		driver.get("https://www.google.com/");
		WebElement elemento = driver.findElement(By.name("q"));
		System.out.println("Se ejecuta acá");
		driver.close();
		System.out.println("Por ultimo se ejecuta acá");
	}

}
