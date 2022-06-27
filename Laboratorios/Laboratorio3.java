package Laboratorios;

public class Laboratorio3 {

	// passo 1 - criar a clase e sua estrutura base

	public static void main(String[] args) {
		// criar o loop para iterar sobre os anos de realização das copas
			for (int ano = 1930; ano <=2022; ano += 4) {
			// passo 3 - desconsiderando os anos 1942 e 1946
			if(ano == 1942 || ano == 1946) {
				//saltamos a exibição desses valores e continuamos com o loop desses valores expecificos
				continue;
								
			}
			
			// exibindo os valores 
			System.out.println("Copa do mundo de : " + ano);

			}
	}

}

//criar um programa que imprime na tela todos os anos em que houve Copa do Mundo de Futebol. (4
