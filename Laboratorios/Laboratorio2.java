package Laboratorios;

public class Laboratorio2 {

	// passo 1 - executado com sucesso
		public static void main(String[] args) {
			// passo 2 - criando a variavel mes
			
			String mes = "Fevereiro";		//S� alterar o m�s para dar o resultado
					
			// passo 3 - criando o switch/case 
			switch(mes) {
			// criando os cases		
			case "janeiro" :
			case "Mar�o" :
			case "Maio" :
			case "Julho" :
			case "Agosto" :
			case "Outubro" :
			case "Dezembro" :
				System.out.println("O m�s indicado tem 31 dias!");
				break;
			case "Abril" :
			case "Junho" :
			case "Setembro" :
			case "Novembro" :	
				System.out.println("O m�s indicado possui 30 dias !");
				break;
			case"fevereiro":
				System.out.println("O m�s indicado possui 28 ou 29 dias!");
				break;
			default:
				System.out.println("Este n�o � considerado um m�s que comp�e o ano");
																		
			}

		}
	}
	
	// Criar um programa que imprime na tela a quantidade de dias existentes no m�s, dada uma vari�vel que contenha o nome do m�s em quest�o.
