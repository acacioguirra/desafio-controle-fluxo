import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		ParametrosInvalidosException exceção = new ParametrosInvalidosException();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (RuntimeException exception) {
			ParametrosInvalidosException.exceção();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			ParametrosInvalidosException.exceção();
		}

		else{
		int contagem = parametroDois - parametroUm;
		for(int i = 0;i < contagem;i++)
		System.out.println("Imprimindo o numero: " + (i+1));
		}
	}
}