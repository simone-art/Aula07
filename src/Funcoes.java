import java.util.Scanner;

public class Funcoes {

	public static void exibirSaudacao() {
		System.out.println("Boa noite! Como voc� est�?");
		
	}
	
	//Fun��o com par�metro
	public static void elogiar(String nome) {
		System.out.println("Voc� � uma pessoa inscrivel, " + nome + "!");
	}
	
	public static double somar(double valor1, double valor2) {
    	
    	System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
    	double soma;
    	soma = valor1 + valor2;
    	return soma;
    }
	
	public static void main(String[] args) {
		exibirSaudacao();
		System.out.println("Essa mensagem � da Main");
		//Pasando o par�metro dentro da func�o ao cham�-la
		elogiar("Simone");
		
		Scanner leitor = new Scanner(System.in);
		String nominho;
		System.out.println("Por favor, informe seu nome: ");
		nominho = leitor.next();
		elogiar(nominho);
		System.out.println("A soma �: " + somar(50, 90));
		
		
	}

}
