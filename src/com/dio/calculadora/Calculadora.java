package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 3;
		int Nome;
		
		Nome = 10;
		
		double a,b;
		System.out.println("Informe o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Informe o segundo valor: ");
		b = scan.nextDouble();
		
		System.out.println("Soma: " + soma(a,b));
		System.out.println("Subtracao: " + subtracao(a,b));
		System.out.println("Multiplicacao: " + multiplicacao(Nome,b));
		System.out.println("Divisao: " + divisao(a,b));
		//chamando nova função criada
		System.out.println("Resto de "+a+" dividido por "+b+" é: " + resto(a,b));
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}

	//criando nova função para resto da divisao
	public static double resto(double a, double b) {
		return a % b;
	}

}
