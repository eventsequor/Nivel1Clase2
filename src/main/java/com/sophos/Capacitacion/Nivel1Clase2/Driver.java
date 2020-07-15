package com.sophos.Capacitacion.Nivel1Clase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Driver {
	private static WebDriver driver;

	public Driver() {

	}

	public static WebDriver getDriver() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	public static void setDriver(WebDriver driverX) {
		driver = driverX;
	}

	public void lanzarNavegador(String navegador) {
		navegador = navegador.toLowerCase(); // conviertiendo todo a minúscula

		switch (navegador) {
		case "google":
			System.setProperty("webdriver.chrome.driver", "src\\main\\java\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "ie":
			String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", rutaDriver);
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.ignoreZoomSettings();
			options.introduceFlakinessByIgnoringSecurityDomains();
			options.enablePersistentHovering();
			options.disableNativeEvents();
			driver = new InternetExplorerDriver(options);

			break;

		default:
			System.out.println("El navegador seleccionado no esta programado o no existe");
			break;
		}

	}// method lanzarNavegador

	public void navegarA(String url) {
		driver.get(url);
	}

	public void cierreNavegador() {
		driver.close();
	}

}
