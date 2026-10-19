// Ler o peso e a altura de uma pessoa, calcular o IMC e exibir se o resultado indica abaixo do peso (IMC < 18,5), 
// peso normal (18,5 a 24,9) ou sobrepeso (IMC ≥ 25).
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura, peso, resultado;

        System.out.print("Informe a sua altura: ");
        altura = scanner.nextDouble();
        System.out.print("Informe o seu peso: ");
        peso = scanner.nextDouble();

        resultado = peso / (altura * altura);

        if (resultado < 18.5){
            System.out.print("Seu IMC e: " + resultado + "\nVoce esta abaixo do peso ideal");
        } else if(resultado >= 18.5 && resultado <= 24.9){
            System.out.print("Seu IMC e: " + resultado + "\nVoce esta no peso ideal");
        } else {
            System.out.print("Seu IMC e: " + resultado + "\nVoce esta acima do peso ideal");
        }
        scanner.close();
    }
}
