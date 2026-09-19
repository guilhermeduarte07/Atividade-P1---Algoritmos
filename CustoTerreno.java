// Ler a largura e o comprimento de um terreno retangular e o preço do metro quadrado,
// calcular a área e o valor total do terreno.
import java.util.Scanner;
public class CustoTerreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double largura, comprimento, area, precoMetro, valorTotal;

        System.out.print("Informe a largura: ");
        largura = scanner.nextDouble();
        System.out.print("Informe o comprimento: ");
        comprimento = scanner.nextDouble();
        System.out.print("Informe o preço por metro quadrado: ");
        precoMetro = scanner.nextDouble();

        area = largura * comprimento;
        valorTotal = area * precoMetro;

        System.out.println("O terreno tem " + area + " metros quadrados");
        System.out.println("O valor total e R$" + valorTotal);

        scanner.close();
    }
}
