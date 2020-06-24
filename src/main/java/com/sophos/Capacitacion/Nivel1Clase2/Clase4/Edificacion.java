package com.sophos.Capacitacion.Nivel1Clase2.Clase4;

public class Edificacion {
	
	private String color;
	private int areaConstruida;
	
	//Atributo públicos
	public int numeroDePisos;
	
	//Atributos protected
	protected int numeroDePuertas;
	
	
	
	protected int getNumeroDePuertas() {
		return numeroDePuertas;
	}


	public void setNumeroDePuertas(int numeroDePuertas) {
		if(numeroDePuertas>10) {
			System.out.println("[ALERTA] No es posible crear un edificio con mas de 10 puertas");
		}else {
			this.numeroDePuertas = numeroDePuertas;
		}		
	}


	public Edificacion() {
		color = null;
		areaConstruida = 0;
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(int areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	

}
