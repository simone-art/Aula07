import java.util.Scanner;

public class Funcoes {

	public static void exibirSaudacao() {
		System.out.println("Boa noite! Como voc� est�?");
		
	}
	
	//Fun��o com par�metro
	public static void elogiar(String nome) {
		System.out.println("Voc� � uma pessoa inscrivel, " + nome + "!");
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
		
		
	}

}
