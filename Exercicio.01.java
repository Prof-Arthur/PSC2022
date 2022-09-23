import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

        /* Questão 01
        *
        * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
        * seja inválido e continue pedindo até que o usuário informe um valor válido. (Dica: Enquanto a nota
        * não for válida, execute o bloco de código)
        *
        */

        double x;
        // Solução 1
        System.out.println();
        System.out.println("Questão 1, solução 1:");
        while (true) {
            System.out.println("Informe a nota: ");
            x = ler.nextDouble();
            if((x<0)||(x>10)){
                System.out.println("Nota inválida");
            } else {
                System.out.println("Nota válida");
                break;
            }
        }

        // Solução 2
        System.out.println();
        System.out.println("Questão 1, solução 2:");
        do{
            System.out.println("Informe a nota: ");
            x = ler.nextDouble();
            if((x<0)||(x>10)){
                System.out.println("Nota inválida");
            }
        } while((x<0)||(x>10));
        ler.nextLine(); // Para limpar o "\n" no buffer que o nextDouble não removeu


        // ---------------------------------------------------------------------------------------

        /* Questão 02
        *
        * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
        * mostrando uma mensagem de erro e voltando a pedir as informações.
        *
        */

        System.out.println();
        System.out.println("Questão 2:");
        System.out.println("Digite o usuário: ");
        String user = ler.nextLine();
        String senha;
        do{
            System.out.println("Senha: ");
            senha = ler.nextLine();
            // senha == user -> Não funciona para esse propósito
            if(senha.equals(user)){ // .equals -> Compara valores das Strings
                System.out.println("ERRO. A senha não pode ser igual ao nome de usuário.");
                }
            else {
                System.out.println("Logado");
            }
        } while(senha.equals(user));
        
        // ---------------------------------------------------------------------------------------

        /*
        * Questão 03
        *
        * Faça um programa que leia e valide as seguintes informações:
        *   01. Nome: maior que 3 caracteres;
        *   02. Idade: entre 0 e 150;
        *   03. Salário: maior que zero;
        *   04. Sexo: 'f' ou 'm';
        *   05. Estado Civil: 's', 'c', 'v', 'd';
        *
        */ 

        System.out.println();
        System.out.println("Questão 3:");
        // 03.01        
        String nome = "";
        do{
            System.out.println("Nome: ");
            nome = ler.nextLine();
            if(nome.length() < 3){
                System.out.println("ERRO. Digite um nome válido.");
            }
        } while(nome.length() < 3);

        // 03.02
        int idade = 0;
        do{
            System.out.println("Idade: ");
            idade = ler.nextInt();
            if ((idade < 0) || (idade > 150)){
                System.out.print("ERRO. Digite uma idade válida.");
            }
        }while((idade < 0) || (idade > 150));

        // 03.03
        double salario = 0;
        do{
                System.out.println("Sálario: R$");
                salario = ler.nextDouble();
                if (salario < 0){
                    System.out.println("ERRO. Digite um salário válido.");
                }
        } while(salario < 0);
        ler.nextLine(); // Para limpar o "\n" no buffer que o nextDouble não removeu

        // 03.04
        String sexo = "";
        do{

            System.out.println("Sexo f ou m: ");
            sexo = ler.nextLine();
            if ((!sexo.equals("f")) && (!sexo.equals("m"))){
                System.out.println("ERRO. Digite uma letra correspondente");
            }
        } while((!sexo.equals("f")) && (!sexo.equals("m"))); // !(sexo.equals("f") || sexo.equals("m"))

        // 03.05
        char estcivil = 'n';
        do{
            System.out.println("Digite a sigla do Estado Civil sendo S de SOLTEIRO, C de CASADO, V de VIÚVO e D de DIVORCIADO");
            estcivil = ler.nextLine().charAt(0);
            if(estcivil != 'S' && estcivil != 'C' && estcivil != 'V' && estcivil != 'D'){
                System.out.println("ERRO. Digite uma letra correspondente.");
            }
        } while(estcivil != 'S' && estcivil != 'C' && estcivil != 'V' && estcivil != 'D');

	}
}
