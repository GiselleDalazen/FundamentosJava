package br.com.fiap.nanoJava;

public class Operadores {
	public static void main(String[] args) {
		int x = 9;
		int y = 2;
		
		int soma = x+y;
		int subtracao = x-y;
		int multiplicacao = x*y;
		int divisao = x/y;
		int resto = x%y;
		
		System.out.println("Resultado da adicao " + soma);
		System.out.println("Resultado da subtracao " + subtracao);
		System.out.println("Resultado da multiplicacao " + multiplicacao);
		System.out.println("Resultado da divisao " + divisao);
		System.out.println("Resultado do resto da divisao " + resto);
		
		x++;
		System.out.println("Resultado do incremento de x é " + x);
		
		y--;
		System.out.println("Resultado do decremento de y é " + y);
		
		x += 10;
		System.out.println("Atribuicao aditiva de x: " + x);
		
		y -= 10;
		System.out.println("Atribuicao subtrtiva de y: " + y);
		
				
				
}
}