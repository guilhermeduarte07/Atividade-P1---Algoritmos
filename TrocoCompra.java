// Ler o valor da compra e o valor pago em dinheiro. 
// Se o valor pago for menor que o da compra, exibir mensagem de "pagamento insuficiente";
// caso contrário, calcular e exibir o troco.

import java.util.Scanner;

public class TrocoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra, valorPago, valorTroco;

        System.out.print("Insira o valor da Compra: R$");
        valorCompra = scanner.nextDouble();
        System.out.print("Insira o valor Pago: R$");
        valorPago = scanner.nextDouble();

        if (valorPago >= valorCompra) {
            valorTroco = valorPago - valorCompra;
            System.out.print("O troco e de: R$" + valorTroco);
        } else {
            System.out.print("Pagamento insuficiente");
        }
        scanner.close();
    }
}