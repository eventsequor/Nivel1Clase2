package com.sophos.Capacitacion.Nivel1Clase2.Clase4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class EntradasSalidas {
	
	
	public String lecturaConsola(String mensaje) {
		String salida;
		Scanner lector = new Scanner(System.in);
		System.out.println(mensaje);
		salida = lector.nextLine();
//		lector.close();
		return salida;
	}
	
	public String lectorArchivoPlano() {
		File file = new File("C:\\Users\\usuario\\eclipse-workspace2020\\Nivel1Clase2\\ArchivoPlano.txt");
		try {
			FileReader fileR = new FileReader(file);
			BufferedReader bf = new BufferedReader(fileR);
			return bf.readLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "";
	}

}
