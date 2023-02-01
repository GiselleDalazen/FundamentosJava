package br.com.fiap.nanoJava;

import java.util.Scanner;

public class CalculadoraIMC {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite a sua altura: ");
		double altura = sc.nextDouble();
		System.out.print("Digite o seu peso: ");
		double peso = sc.nextDouble();
		
		double imc = peso / (altura*altura);
		if (imc < 18.5) {
			System.out.print("Abaixo do peso ideal");
		}else if (imc >= 18.5 && imc <= 25) {
			System.out.print("Dentro do peso ideal");
		}else {
			System.out.print("Acima do peso ideal");
			
		}
		sc.close();
}
}