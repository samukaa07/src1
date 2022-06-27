package exemplo.estrutura.controle;

public class InstrucoesRotuladas {

	public static void main(String[] args) {
		// primeira instrução rotulada
		instrucao1:
			for(int i = 1; i < 4; i++) {
				// segunda instrução rotulada
				instrucao2:
					for(int j = 1; j < 4; j++) {
						// instrução de decisão
						if(j == 2) 						
						// aqui não foi pq j não é  = 2
							{
							System.out.println("Saindo da instrução 1");
							break instrucao1;
													
						}
						System.out.println("Texto instrução 2");
					}
				System.out.println("Texto instrução1");
			}

	}

}
