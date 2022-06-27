package exemplo.estrutura.controle;

public class ExemploSwitchCaseDefault {

	public static void main(String[] args) {
		// criar variavel de avaliação com seu respectivo valor
		
		String pais = "Brasil";
		
		// estrutura do bloco switch
		switch(pais) {
		//estabelecendo os cases
		case "Brasil":
		case "Portugal":
			System.out.println("Bom dia !");
			break;
			
		case "Franca":
			System.out.println("Bon Jour !");
			break;
			
		case "Mexico":
		case "Chile":
		case "Argentina":
		System.out.println("Buenos dias !");
		break;
		
		default:
			System.out.println("Good Mornig !");
			
		}

	}

}
