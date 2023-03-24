package edu.GiselleDalazen.BootcampDio.javaIntro;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando para "+ volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo para: "+ volume);
	}
	
	public void mudarCanal(int canal) {
		this.canal = canal;
	}
}
