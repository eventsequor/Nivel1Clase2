package com.sophos.Capacitacion.Nivel1Clase2;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
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
