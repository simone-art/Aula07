import java.util.Scanner;

public class Calculadora {

	// Argumento ou par�metro � um valor preexistente para que a fun��o funcione
//	public static double somar(double valor1, double valor2) {
//
//		System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
//		double soma;
//		soma = valor1 + valor2;
//		return soma;
//	}
//
//	public static double subtrair(double valor1, double valor2) {
//
//		System.out.println("\n\nRealizando a subtra��o entre " + valor1 + " e " + valor2);
//		double subtracao;
//		subtracao = valor1 - valor2;
//		return subtracao;
//	}
//
//	public static double dividir(double valor1, double valor2) {
//
//		System.out.println("\n\nRealizando a divis�o entre " + valor1 + " e " + valor2);
//		double divisao;
//		divisao = valor1 / valor2;
//		return divisao;
//
//	}

//	public static double multiplicar(double valor1, double valor2) {
//
//		System.out.println("\n\nRealizando a multiplica��o entre " + valor1 + " e " + valor2);
//		double multiplicacao;
//		multiplicacao = valor1 * valor2;
//		return multiplicacao;
//
//	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2 = 0;
		//double soma, subtracao, divisao, multiplicacao;
		int opcao = 0;

		while (opcao != 6) {
			FuncoesCalculadora.exibirMenu();
			opcao = leitor.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\n\nDigite o 1� valor:");
				valor1 = leitor.nextDouble();
				System.out.print("\n\nDigite o 2� valor:");
				valor2 = leitor.nextDouble();
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				break;
			case 2:
				System.out.println("A soma �: " + FuncoesCalculadora.somar(valor1, valor2));
				break;
			case 3:
				System.out.println("A subtra��o �: " + FuncoesCalculadora.subtrair(valor1, valor2));
				break;
			case 4:
				System.out.println("A divis�o �: " + FuncoesCalculadora.dividir(valor1, valor2));
				break;
			case 5:
				System.out.println("A multiplica��o �: " + FuncoesCalculadora.multiplicar(valor1, valor2));
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}

		}
		leitor.close();

	}

}
