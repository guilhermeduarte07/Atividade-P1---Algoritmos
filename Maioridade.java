// Ler o ano de nascimento e o ano atual, calcular a idade da pessoa e exibir se ela é maior de idade
// (18 anos ou mais) ou menor de idade.
import java.util.Scanner;
public class Maioridade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoNasc, anoAtual, idade;

        System.out.print("Informe seu ano de nascimento: ");
        anoNasc = scanner.nextInt();
        System.out.print("informe o ano atual: ");
        anoAtual = scanner.nextInt();

        idade = anoAtual - anoNasc;

        if (idade >= 18){
            System.out.print("Voce tem " + idade + " anos, voce e maior de idade");
        } else if (anoNasc > anoAtual){
            System.out.print("Idade inválida");
        } else {
            System.out.print("Voce tem " + idade + " anos, voce e menor de idade");
        }
        scanner.close();
    }
}
