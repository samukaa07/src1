package exemplo.estrutura.controle;

public class ExemploContinue {

	public static void main(String[] args) {
		// declarando a variavel com valor inicial = 0
		int num = 0;
		// estabelecendo o loop while
		while(num < 10) // while até 10 no caso menor < que até 10
			{
			++num;
			if(num==5) {
			continue;
			}
		System.out.println("Valor de num = " + num);
		
		}

	}

}
