// Ler o valor de vendas do mês de um vendedor e o valor da meta estabelecida. 
// Se a meta for atingida, calcular uma comissão de 8% sobre as vendas; 
// caso contrário, calcular uma comissão de 3%. Exibir o valor da comissão.
import java.util.Scanner;


public class Comissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorVenda, valorMeta, comissao;

        System.out.print("Valor da meta: ");
        valorMeta = scanner.nextDouble();
        System.out.print("Insira valor das vendas mensais: ");
        valorVenda = scanner.nextDouble();

        if (valorVenda >= valorMeta){
            comissao = (valorVenda * 8) / 100 + valorVenda;
            System.out.print("Valor da comissao: " + comissao);
        } else {
            comissao = (valorVenda * 3) / 100 + valorVenda;
            System.out.print("Valor da comissao: " + comissao);
        }
        scanner.close();
    }
}
