package com.dio.repeticaoarrays;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		//for (repeticao de forma contada, estabelecida)
		System.out.println("Usando a repeticao For");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}	
		//OBS: a variavel i criada, faz parte apenas da estrutur for

		
		//while (repeticao de forma não estabelecida, faz verificacao no inicio)
		System.out.println("Usando a repeticao While");
		int i = 0;
		while(i <= 10 ) {
			System.out.println(i);
			i++;
		}		
		
		//do...while (faz verificacao no final do codigo)
		System.out.println("Usando a repeticao Do...while");
		i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		
		//criar e carregar um vetor para usarmos a estrutura for...each
		int []vetor = new int[5];
		for(int c=0;c<5;c++) {
			vetor[c] = c+1;
		}		
		//for each (percorre todos os itens de um vetor)
		System.out.println("Usando a repeticao For each");
		System.out.print("Vetor:");
		for(int valores:vetor) {
			System.out.print(" "+valores);
		}

	}

}
