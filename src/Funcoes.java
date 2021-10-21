import java.util.Scanner;

public class Funcoes {

	public static void exibirSaudacao() {
		System.out.println("Boa noite! Como você está?");
		
	}
	
	//Função com parâmetro
	public static void elogiar(String nome) {
		System.out.println("Você é uma pessoa inscrivel, " + nome + "!");
	}
	
	public static double somar(double valor1, double valor2) {
    	
    	System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
    	double soma;
    	soma = valor1 + valor2;
    	return soma;
    }
	
	public static void main(String[] args) {
		exibirSaudacao();
		System.out.println("Essa mensagem é da Main");
		//Pasando o parámetro dentro da funcão ao chamá-la
		elogiar("Simone");
		
		Scanner leitor = new Scanner(System.in);
		String nominho;
		System.out.println("Por favor, informe seu nome: ");
		nominho = leitor.next();
		elogiar(nominho);
		System.out.println("A soma é: " + somar(50, 90));
		
		
	}

}
