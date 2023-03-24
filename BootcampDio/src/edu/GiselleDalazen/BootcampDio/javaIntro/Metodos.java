package edu.GiselleDalazen.BootcampDio.javaIntro;

public class Metodos {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Tv ligada? " + smartTv.ligada);
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume atual: "+ smartTv.volume);
		
		smartTv.ligar();
		
		System.out.println("Tv ligada? " + smartTv.ligada);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		
		smartTv.aumentarVolume();
		
		smartTv.mudarCanal(13);
		
		System.out.println("Novo canal: " + smartTv.canal);
	}

}
