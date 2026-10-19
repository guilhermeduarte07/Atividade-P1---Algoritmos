// Ler o consumo em kWh registrado no mês. Se o consumo for maior que 200 kWh, aplicar tarifa de R$ 0,95 por kWh; 
// caso contrário, aplicar tarifa de R$ 0,75 por kWh. Calcular e exibir o valor total da conta.
import java.util.Scanner;

public class ContaLuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consumo, valorFinal;

        System.out.print("kWh registrado no mes: ");
        consumo = scanner.nextDouble();
        
        if (consumo > 200){
            valorFinal = consumo * 0.95;
            System.out.print("Valor final apos a tarifa: R$" + valorFinal);
        } else {
            valorFinal = consumo * 0.75;
            System.out.print("Valor final apos a tarifa: R$" + valorFinal);
        }
        scanner.close();
    }
}
