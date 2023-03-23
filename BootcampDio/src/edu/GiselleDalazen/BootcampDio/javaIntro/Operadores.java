package edu.GiselleDalazen.BootcampDio.javaIntro;

public class Operadores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// operador de atribuicao =
		String nome = "Giselle";
		int idade = 41;
		double altura = 1.70;
		char sexo = 'F';
		boolean doadorOrgaos = true;

		// operadores aritmeticos
		double soma = 10.5 + 15.7;
		int subtracao = 113 - 25;
		int multuplicacao = 20 * 7;
		double divisao = 15 / 3;
		int modulo = 18 % 3;
		double resultado = (10 * 7) + (20 / 4);

		// operadores incrementais
		int numero = 5;
		System.out.println(numero++);
		System.out.println(numero);

		int numero2 = 5;
		System.out.println(numero2--);
		System.out.println(numero2);

		// operadores comparativos
		int a, b;
		a = 5;
		b = 6;
		String resultado1 = a == b ? "verdadeiro" : "falso";
		System.out.println(resultado1);
		if (a > b) {
			System.out.println("A e maior");
		} else {
			System.out.println("B e maior");
		}
		
		//expressoes logicas e tabela verdade (&&, || , !)
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if (condicao1 && condicao2) {
			System.out.println("Amabas sao verdadeiras");
		}else if(condicao1 || condicao2) {
			System.out.println("Uma e verdadeira");
		}
	}
}
