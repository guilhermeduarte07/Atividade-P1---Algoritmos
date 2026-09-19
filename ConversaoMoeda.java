// Ler o valor em dólares e a cotação do dólar do dia, calcular e exibir o valor correspondente em reais.
import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorDolar, cotacao, valorReais;

        System.out.print("Digite valor em dolar: US$");
        valorDolar = scanner.nextDouble();
        System.out.print("Digite a cotação de hoje: ");
        cotacao = scanner.nextDouble();

        valorReais = valorDolar * cotacao;

        System.out.print("Valor em reais: R$" + valorReais);
        scanner.close();
    }
}