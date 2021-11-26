package com.dio.repeticaoarrays;



public class VetoresMatrizes {

	public static void main(String[] args) {
		/* 
		 Vetor(array) é um tipo de dado especial que podem armazenar um conjunto de valores;
		 Caracteristicas: 
		 	Sequencial: possui uma sequencia de elementos (0-10: total de 11 posições)
		 	Finito e fixo: possui uma dimensao fixa e determinada (nao pode aumentar ou reduzir)
		 	Homogeneo: suporta apenas um tipo de dado (nao pode ter mais de um tipo dado diferente)
		 	Indexado: cada elemento do array, possui um indice (para localizar cada elemento)
		 	Unidimensional: apenas uma dimensão
		 Criação de um array
		 tipo[] nome = new tipo[TAMANHO]; (precisa preencher depois) +usado
		 tipo[] nome = new tipo[] {valor1,valor2}; (cria um array ja definido) +usado
		 tipo[] nome = {valor1,valor2,valor3}; (cria um array ja preenchido) -usado
		 */
		//usando o for (+linha -pratico)
		/*
		int[] idades = new int[] {5,12,19,21,25,29,38};
		System.out.print("Os adultos possuem as seguintes idades:");
		for(int i=0;i<idades.length;i++) {
			int idadeComp = idades[i];
			if(idadeComp >= 18) {
				System.out.print(" "+idadeComp);
			}
		}
		//usando o for each (-linha +pratico)
		System.out.print("\nOs adultos possuem as seguintes idades:");
		for(int idadeComp : idades) {
			if(idadeComp >= 18) System.out.print(" "+idadeComp);
		}
		
		*/
		/*
		 Matriz: array de array
		 Duas ou mais dimensões
		 
		 Criação de matriz
		 tipo[][] nome = new tipo[TAMANHO][TAMANHO]; (2 dimensões)
		 tipo[][][] nome = new tipo[TAMANHO][TAMANHO][TAMANHO]; (3 dimensões)
		 
		 */
		
		
		

	}

}
