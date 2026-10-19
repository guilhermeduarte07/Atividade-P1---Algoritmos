// Ler dois números e exibir qual deles é o maior, ou se são iguais.
import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2;

        System.out.print("Digite o primeiro numero: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        n2 = scanner.nextDouble();

        if (n1 > n2){
            System.out.print(n1 + " e maior que " + n2);
        } else if (n1 < n2){
            System.out.print(n2 + " e maior que " + n1);
        } else{
            System.out.print(n1 + " e " + n2 + " sao iguais");
        }
        scanner.close();
    }
}
