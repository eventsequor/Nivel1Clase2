package com.sophos.Capacitacion.Nivel1Clase2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class EjercicioRandom {
	
	
	
	
	protected String nombreVariable;
	protected int atributoInterno;
	
		
	public String getNombreVariable() {
		return nombreVariable;
	}

	public void setNombreVariable(String nombreVariable) {
		this.nombreVariable = nombreVariable;
	}

	public int getAtributoInterno() {
		return atributoInterno;
	}

	public void setAtributoInterno(int atributoInterno) {
		this.atributoInterno = atributoInterno;
	}
	
	public void arregloPrimitivo() {
//		BigInteger numeroGrand = new BigInteger("50000000000000000000000000000000000555555555555");

									// [  0  ]   , [    1    ]
		String [] arregloPalabras = {"Posición 1","Posición 2","Posición 3"};
		int [] arregloNumeros = new int[5]; 
		arregloNumeros[0] = 880;
		arregloNumeros[1] = 20;
		arregloNumeros[2] = 430;
		arregloNumeros[3] = 1240;
		arregloNumeros[4] = 150;
		
		
		int pivo = arregloNumeros[0];
		for (int i = 0;i<arregloNumeros.length;i++) {
			if(pivo<arregloNumeros[i]) {
				pivo = arregloNumeros[i];
			}
		}
		
		System.out.println("El número mayor es: "+ pivo);
		
		List<Integer> lista = new ArrayList<Integer>();		
		lista.add(5);
		lista.add(8);
		lista.add(5550);
		lista.add(30);
		lista.add(20);
		lista.add(80);
		lista.add(55640);
		lista.add(25210);
		
		System.out.println(lista);
		Collections.sort(lista);
		
		System.out.println(lista.size());
		System.out.println(lista.get(7));
		
	}
}
