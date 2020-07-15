package com.sophos.Capacitacion.Nivel1Clase2.Factory;

public class Vaca implements Animales{

	@Override
	public String NombreAnimal() {
		return "YO soy una vaca";
	}

	@Override
	public String tipoAlimentacion() {
		return "YO como pasto";
	}

}
