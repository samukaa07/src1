package exemplo.estrutura.controle;

public class InstrucoesRotuladas {

	public static void main(String[] args) {
		// primeira instru��o rotulada
		instrucao1:
			for(int i = 1; i < 4; i++) {
				// segunda instru��o rotulada
				instrucao2:
					for(int j = 1; j < 4; j++) {
						// instru��o de decis�o
						if(j == 2) 						
						// aqui n�o foi pq j n�o �  = 2
							{
							System.out.println("Saindo da instru��o 1");
							break instrucao1;
													
						}
						System.out.println("Texto instru��o 2");
					}
				System.out.println("Texto instru��o1");
			}

	}

}
