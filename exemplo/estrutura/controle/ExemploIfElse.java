package exemplo.estrutura.controle;

public class ExemploIfElse {

	//criando o m�todo principal
		public static void main(String[] args) {
			//criar uma variavel do tipo int
			int f = 22;
			// estrutura de deci��o dupla
			if(f != 22) {
			// se condi��o for verdade segue caminho 1 (linha) qualquer coisa diferente de verdadeiro sera exibido como falso
			// se condi��o for falso vai seguir caminho 2 (linha)	
				System.out.println(" f � menor ou igual do que 22 e vale : " + f);
			} else {
				System.out.println("f � maior que 22 e vale : " + f);
			}
		}

	}

