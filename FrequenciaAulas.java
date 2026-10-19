// Ler o número total de aulas do semestre e o número de aulas que o aluno compareceu,
// calcular o percentual de frequência e exibir se o aluno está apto (frequência ≥ 75%) 
// ou reprovado por falta.
import java.util.Scanner;
public class FrequenciaAulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double faltas, aulasDadas, frequencia;

        System.out.print("Informe quantas aulas: ");
        aulasDadas = scanner.nextDouble();
        System.out.print("Informe quantas faltas: ");
        faltas = scanner.nextDouble();

        frequencia = (aulasDadas - faltas) / aulasDadas * 100;

        if (frequencia >= 75){
            System.out.print("Aluno tem " + frequencia + "% de frequencia, esta apto");
        } else {
            System.out.print("Aluno tem " + frequencia + "% de frequencia, esta reprovado por falta");
        }
        scanner.close();
    }
}
