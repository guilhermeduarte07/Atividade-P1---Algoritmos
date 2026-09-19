// Ler uma velocidade em quilômetros por hora, converter para metros por segundo e exibir o resultado.
import java.util.Scanner;
public class ConversaoVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km, ms;

        System.out.print("Informe a velocidade em Km/h: ");
        km = scanner.nextDouble();

        ms = km / 3.6;

        System.out.print("Velocidade em m/s: " + ms);
        scanner.close();
    }
}
