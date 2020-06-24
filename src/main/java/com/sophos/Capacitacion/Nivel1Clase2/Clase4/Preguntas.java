package com.sophos.Capacitacion.Nivel1Clase2.Clase4;

public class Preguntas {

	// Cúal es la diferencia entre clase, metedo, atributo, funcion

	// Objetos, Tiene Atributos, Metodos

	// Atributos son variables que permiten definir las caracteristica de objeto

//	int numeroDeVuelosDia;
//	int cantidadPilotosQueVolaronAvion;
//	int numeroDeMillasRecorridas;

	int numeroDePartesDelAvion;
	int numeroDePartesFaltantes;
	int presionLlantas;
	private int alturaConRespectoAlPiso;
	String variable;
	
	
	public String getVariable() {
		return variable;
	}

	public int getAlturaConRespectoAlPiso() {
		return alturaConRespectoAlPiso;
	}

	public void setAlturaConRespectoAlPiso(int alturaConRespectoAlPiso) {
		this.alturaConRespectoAlPiso = alturaConRespectoAlPiso;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	int velocidad;
	
	public Preguntas() {
		velocidad = 0;
		variable= "Clase 4";
	}

	public boolean volar(int aumentoVelocidad) {
		System.out.println("El avion coje impulso");
		int tiempo = 15;
		while (tiempo > 0) {
			try {
//				Thread.sleep(300);
//				System.out.println("Velocidad actual del avión: " + velocidad + " con " + tiempo
//						+ " segundos para tomar impulso ");
			} catch (Exception e) {
				// TODO: handle exception
			}
			velocidad += aumentoVelocidad;
			tiempo--;
		}
		
		alturaConRespectoAlPiso =  velocidad;
		if (velocidad > 300) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	

}
