import java.util.Scanner;

public class Aluno {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frequência do aluno");
        int frequencia = sc.nextInt();
        System.out.println("Digite as notas do aluno");
        double media = sc.nextDouble();
        media = media + sc.nextDouble();
        media = media + sc.nextDouble();
        media = media + sc.nextDouble();
        media = media / 4;
        System.out.printf ("a Média é: %.1f - %s%n", media, (media >=6  && frequencia >= 75) ? "Aprovado" : "Reprovado");

        sc.close();
    }
}