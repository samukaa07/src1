package exemplo.estrutura.controle;

public class IfElseAninhado {

	public static void main(String[] args) {
		// Criando uma nova variavel
		int hora = 17;
		
		// aninhamento de ifs e elses
		if (hora < 12) {
			System.out.println("Bom dia! como voc�s est�o?");
		} else if(hora < 18) {
			System.out.println("Boa tarde! Tudo bem?");
		}else {
			System.out.println("Entendi ! � noite, ent�o, boa noite!");
		}

	}

}
