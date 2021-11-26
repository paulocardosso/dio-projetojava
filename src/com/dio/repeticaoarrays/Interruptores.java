package com.dio.repeticaoarrays;

public class Interruptores {

	public static void main(String[] args) {
		//break (aborta toda a estrutura de repeticao que foi chamado)
		System.out.println("Testando o interruptor break");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
			System.out.println("teste: "+i);
		}
		System.out.println("Testando o interruptor break em dois for não marcados");
		for(int j=0;j<=5;j++) {
			for(int i=0;i<=5;i++) { //mesmo sendo encerrada, essa estrutura sera criada 6 vezes
				System.out.println(i);
				if(i == 2) {
					break; //esse comando encerra o ultimo for, já que faz parte dele
				}
				System.out.println("teste i : "+i);
			}
			System.out.println("teste j : "+j); //vai ser exibido as 6 vezes
		}
		System.out.println("Testando o interruptor break em dois for marcados");
		out:
			for(int j=0;j<=5;j++) {
				for(int i=0;i<=5;i++) {
					System.out.println(i);
					if(i == 2) {
						break out; //esse comando encerra todo o label out criado (os dois for)
					}
					System.out.println("teste i : "+i);
				}
				System.out.println("teste j : "+j); //não será exebido na tela
		}
		
		//continue (pula para a proxima interação da repetição)
		System.out.println("Testando o interruptor continue");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i == 5) {
				continue;
			}
			System.out.println("teste: "+i); //no i=5 ele não exibe essa linha, devido o continue
		}
		System.out.println("Testando o interruptor continue em dois for não marcados");
		for(int j=0;j<=5;j++) {
			for(int i=0;i<=5;i++) { 
				System.out.println(i);
				if(i == 2) {
					continue; 
				}
				System.out.println("teste i : "+i); //esse comando não é exibido quando i=2
			}
			System.out.println("teste j : "+j); 
		}
		System.out.println("Testando o interruptor continue em dois for marcados");
		oute:
			for(int j=0;j<=5;j++) {
				for(int i=0;i<=5;i++) {
					System.out.println(i);
					if(i == 2) {
						continue oute; //esse comando retorna ao label oute, desprezando os cod abaixo
					}
					System.out.println("teste i : "+i);
				}
				System.out.println("teste j : "+j); //não será exebido na tela
		}		
		
		//return com valor e sem valor
		//utilizado em metodos
		
		//exercicios multiplos de 2, do 1 ao 14, chegando no 12 aborta o for
		System.out.println("Multiplos de 2 entre 1 ao 14 usando for");
		for (int i=1;i<=14;i++) {
			if(i == 12) break;
			if(i%2 == 0) System.out.println(i);
		}
		//usando o while
		System.out.println("Multiplos de 2 entre 1 ao 14 usando while");
		int i = 1;
		System.out.println(i);
		while(i<=14){
			if(i == 12) break;
			if(i%2 == 0) System.out.println(i);
			i++;
		}
	}

}
