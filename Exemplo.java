import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		while (true) {

			System.out.println("Digite um nome com mais de 3 caracteres:");
			String nome = leitor.next();

			if (nome.length() > 3) {
				System.out.println("Nome digitado: " + nome);
				System.out.println("Encerrando programa! Tchau.");
				break;
			} else {
				System.out.println("Nome inválido! Tente novamente.");
			}
		}
	}
}
