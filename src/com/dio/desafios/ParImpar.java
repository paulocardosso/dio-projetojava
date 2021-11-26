package com.dio.desafios;

import java.util.Scanner;
import java.io.IOException;

public class ParImpar {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	System.out.println(N);
    	for (int i = 0; i < N; i++) {
    		int x = leitor.nextInt();
    		if(x == 0){
    			System.out.println("NULL");
    			continue;
    		}else if(x>0){
    			if(x%2 == 0) System.out.println("EVEN POSITIVE");
    			else System.out.println("ODD POSITIVE");
    		}else{
    			x *= -1;
    			if(x%2 == 0) System.out.println("EVEN NEGATIVE");
    			else System.out.println("ODD NEGATIVE");
    		}    		
    	}
	}
}
