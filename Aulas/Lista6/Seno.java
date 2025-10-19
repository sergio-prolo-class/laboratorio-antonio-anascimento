import java.util.Scanner;

public class Seno {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um ângulo entre 0° e 360°");
        double graus = sc.nextDouble();
        double senAprox;
        double senReal;
        double radianos;
        if (graus>=0 && graus<=180) {
            senAprox = (4*graus*(180-graus)) / (40500-graus*(180-graus));
        } else {
            double novoGrau = 360-graus;
            senAprox = -(4*novoGrau*(180-novoGrau)) / (40500-novoGrau*(180-novoGrau));
        }

        radianos = graus*(Math.PI/180);
        senReal = Math.sin(radianos);

        System.out.printf("O seno aproximado é: %.4f%nO seno real é: %.4f%n", senAprox, senReal);
        sc.close();
    }
}