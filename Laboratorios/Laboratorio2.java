package Laboratorios;

public class Laboratorio2 {

	// passo 1 - executado com sucesso
		public static void main(String[] args) {
			// passo 2 - criando a variavel mes
			
			String mes = "Fevereiro";		//Só alterar o mês para dar o resultado
					
			// passo 3 - criando o switch/case 
			switch(mes) {
			// criando os cases		
			case "janeiro" :
			case "Março" :
			case "Maio" :
			case "Julho" :
			case "Agosto" :
			case "Outubro" :
			case "Dezembro" :
				System.out.println("O mês indicado tem 31 dias!");
				break;
			case "Abril" :
			case "Junho" :
			case "Setembro" :
			case "Novembro" :	
				System.out.println("O mês indicado possui 30 dias !");
				break;
			case"fevereiro":
				System.out.println("O mês indicado possui 28 ou 29 dias!");
				break;
			default:
				System.out.println("Este não é considerado um mês que compõe o ano");
																		
			}

		}
	}
	
	// Criar um programa que imprime na tela a quantidade de dias existentes no mês, dada uma variável que contenha o nome do mês em questão.
