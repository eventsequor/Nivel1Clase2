package com.sophos.Capacitacion.Nivel1Clase2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.libreria.Libreria.Calculadora;
import com.sophos.Capacitacion.Nivel1Clase2.Clase4.Apartamentos;
import com.sophos.Capacitacion.Nivel1Clase2.Clase4.Constantes;
import com.sophos.Capacitacion.Nivel1Clase2.Clase4.Edificacion;
import com.sophos.Capacitacion.Nivel1Clase2.Clase4.EntradasSalidas;
import com.sophos.Capacitacion.Nivel1Clase2.Clase4.Preguntas;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		EjercicioRandom objEjer = new EjercicioRandom();
		objEjer.arregloPrimitivo();

	}

	public void clase9() {

	}

	public void clase8() {
//		clase6();
		Driver objDriver = new Driver();
		objDriver.lanzarNavegador("google");
		objDriver.navegarA("https://www.google.com");
		WebElement cajaTexto = objDriver.getDriver()
				.findElement(By.xpath("" + "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		cajaTexto.sendKeys("Visual Studio");

		WebElement cajaTexto2 = objDriver.getDriver().findElement(By.name("q"));
//		cajaTexto2.clear();
		cajaTexto2.sendKeys(" Code");

		cajaTexto2.submit();
		try {
			Thread.sleep(2000); // Este tiempo se describe en mili segundos
		} catch (Exception e) {
			// TODO: handle exception
		}
		ArrayList<WebElement> listaElementos = (ArrayList<WebElement>) objDriver.getDriver()
				.findElements(By.className("LC20lb DKV0Md"));

		System.out.println("Se han encontrado " + listaElementos.size() + " elementos");

		try {
			Thread.sleep(5000); // Este tiempo se describe en mili segundos
		} catch (Exception e) {
			// TODO: handle exception
		}

		objDriver.cierreNavegador();
	}

	public static void clase6() {

		EntradasSalidas io = new EntradasSalidas();
		System.out.println(io.lectorArchivoPlano());

		String variable1 = io.lecturaConsola("Por favor digite el valor uno ");
		String variable2 = io.lecturaConsola("Por favor digite el valor dos");
		Calculadora objCalculadora = new Calculadora();

		System.out.println("El resultado de la suma es: "
				+ objCalculadora.suma(Integer.parseInt(variable1), Integer.parseInt(variable2)));

//		WebDriver objWebDriver = new ChromeDriver();
//		

//		System.out.println(objCalculadora.resta(5, 7));
//		System.out.println(objCalculadora.multiplicacion(5, 7));
//		System.out.println(objCalculadora.division(5, 7));
//		System.out.println(objCalculadora.modulo(13, 2));

	}

	public void clase5() {
		Preguntas avion = new Preguntas();
		avion.volar(30);
		System.out.println("La altura actual es: " + avion.getAlturaConRespectoAlPiso());
		System.out.println("S");
//		System.out.println("Resultado es: "+ avion.sumar(5, 6));

//		System.out.println("INTENTO 1");
//		if(avion.volar(25)) {
//			System.out.println("El avión despegó");
//		}else {
//			System.out.println("El avión se estrello");
//		}
//		
//		if(avion.volar(10)) {
//			System.out.println("El avión despegó");
//		}else {
//			System.out.println("El avión se estrello");
//		}
//		

//		Edificacion objEdificacioin = new Edificacion();
//		Edificacion objEdificacioin2 = new Edificacion();
//		
//		objEdificacioin2.setAreaConstruida(75);
//		objEdificacioin2.numeroDePisos = 5;
//		
//		objEdificacioin.setAreaConstruida(70);
//		objEdificacioin.numeroDePisos = 5;
//		objEdificacioin.setNumeroDePuertas(5);
//		
//
//		System.out.println("Numero de pisos objeto 1: " + objEdificacioin.numeroDePisos);
//		System.out.println("Área construida objeto 1: " + objEdificacioin.getAreaConstruida()+"\n");
//		
//		
//		System.out.println("Numero de pisos objeto 2: " + objEdificacioin2.numeroDePisos);
//		System.out.println("Área construida objeto 2: " + objEdificacioin2.getAreaConstruida());
//
//		System.out.println("Area de colombia: " + Constantes.AREA_DE_COLOMBIA);
//		
//		System.out.println("#############################################");
//		
//		
//		Apartamentos objApar = new Apartamentos();
//		
//		objApar.setAreaConstruida(42);
	}

	public void clase3() {
		System.out.println("Hello World!");

		byte variableByte = 65; // A - 10000001 -128 HASTA 127
		short variableShot = 32000; // 0000000 00000110
		int variableInt = 2147000000; // 4 byte
		long variableLong = 555555;
		float variableFloat = (float) -5.5555555555555555555555555;
		boolean variableBoolean = false;
		char variableChar = 'A';

//		int b = 66; // Ascii = B 10000010
//		char caracterB = (char) b;

//		System.out.println(caracterB);
		char[] nombre = { 'l', 'e', 'o', 'n', 'a', 'r', 'd', 'o' };
		int valor;
		for (int i = 0; i < nombre.length; i++) {
			valor = (int) nombre[i] + 2;
			System.out.print((char) valor);
			System.out.print(",");
		}
		System.out.println();
		String variableString = "Clase 3";
		System.out.println(variableString.contains("3"));

		int a = 5;
		int b = 6;
		if (a > b) {
			System.out.println("valor a si es mayor que b");
		} else {
			System.out.println("valor de variable b es mayor que a");
		}
		a = 10;
		if (a > 5 && a < 10) {
			System.out.println("a>5 y a < 10");
		} else if (a > 10 && a < 20) {
			System.out.println("a>10 y a < 20");
		} else {
			System.out.println("El valor no esta dentro de los rangos definidos");
		}

		String opcion = "31";
		switch (opcion) {
		case "1":
			System.out.println("Ingreso al case 1 ");
			break;
		case "2":
			System.out.println("Ingreso al case 2");
			break;
		default:
			System.out.println("La opcion no existe");
			break;
		}
	}
}
