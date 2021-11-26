package com.dio.desafios;

import java.math.*;
import java.util.Scanner;

public class TrigoTabuleiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double qnt;
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			qnt = 1;
			for(int j=1;j<=x;j++) {
				qnt *= 2;
			}
			qnt = Math.floor((qnt/12)/1000);
			System.out.printf("%.0f kg\n",qnt);   //Complete o código aqui.
			//BigInteger base = BigInteger.valueOf(2);
			//BigInteger qntTrigo = base.pow(x);
			//System.out.println(qntTrigo.divide(BigInteger.valueOf(12000))+" kg");   //Complete o código aqui.
			
		}
		sc.close();

	}

}
