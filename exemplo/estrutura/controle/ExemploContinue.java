package exemplo.estrutura.controle;

public class ExemploContinue {

	public static void main(String[] args) {
		// declarando a variavel com valor inicial = 0
		int num = 0;
		// estabelecendo o loop while
		while(num < 10) // while at� 10 no caso menor < que at� 10
			{
			++num;
			if(num==5) {
			continue;
			}
		System.out.println("Valor de num = " + num);
		
		}

	}

}
