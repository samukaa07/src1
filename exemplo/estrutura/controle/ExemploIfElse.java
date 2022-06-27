package exemplo.estrutura.controle;

public class ExemploIfElse {

	//criando o método principal
		public static void main(String[] args) {
			//criar uma variavel do tipo int
			int f = 22;
			// estrutura de decição dupla
			if(f != 22) {
			// se condição for verdade segue caminho 1 (linha) qualquer coisa diferente de verdadeiro sera exibido como falso
			// se condição for falso vai seguir caminho 2 (linha)	
				System.out.println(" f é menor ou igual do que 22 e vale : " + f);
			} else {
				System.out.println("f é maior que 22 e vale : " + f);
			}
		}

	}

