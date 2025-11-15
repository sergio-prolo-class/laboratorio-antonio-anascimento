
import java.util.Scanner;

public class Media {

    static double menorDeTres(double a, double b, double c) {
        double min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    static double calcularMediaDosMaiores(double x1, double x2, double x3) {
        return (x1 + x2 + x3 - menorDeTres(x1, x2, x3)) / 2;
    }

    static double calcularMediaFinal(double p, double t) {
        return 0.8 * p + 0.2 * t;
    }

    static double lerNotaValida(Scanner sc) {
        double nota;
        do {
            System.out.print("Nota: ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! A nota deve ser entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

    static int lerNumeroAlunos(Scanner sc) {
        int n;
        do {
            System.out.print("Entre com o número de alunos: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Valor inválido! Deve ser pelo menos 1 aluno.");
            }
        } while (n < 1);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAlunos = lerNumeroAlunos(sc);
        double somaMedias = 0;

        for (int i = 1; i <= numAlunos; i++) {

            System.out.println("Entre com as notas das provas do aluno " + i + ":");
            double p1 = lerNotaValida(sc);
            double p2 = lerNotaValida(sc);
            double p3 = lerNotaValida(sc);

            System.out.println("Entre com as notas dos trabalhos do aluno " + i + ":");
            double t1 = lerNotaValida(sc);
            double t2 = lerNotaValida(sc);
            double t3 = lerNotaValida(sc);

            double mediaProvas = calcularMediaDosMaiores(p1, p2, p3);
            double mediaTrabalhos = calcularMediaDosMaiores(t1, t2, t3);

            double mediaFinal = calcularMediaFinal(mediaProvas, mediaTrabalhos);

            System.out.printf("Média final do aluno %d: %.2f%n", i, mediaFinal);

            somaMedias += mediaFinal;
        }

        double mediaDisciplina = somaMedias / numAlunos;
        System.out.printf("Média da disciplina: %.2f%n", mediaDisciplina);

        sc.close();
    }
}
