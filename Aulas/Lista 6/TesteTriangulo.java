import java.util.Scanner;

public class TesteTriangulo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os lados do triângulo");
        double l1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        double l3 = sc.nextDouble();
        boolean triangulo;

        if (l1+l2>l3&&l2+l3>l1&&l1+l3>l2&&l1>0&&l2>0&&l3>0) {
            triangulo = true;
        } else {
            triangulo = false;
            System.out.println("Inválido");
        }

        if (triangulo) { 
            if (l1==l2&&l1==l3) {
            System.out.println("O triangulo é equilatero");
            } else if(l1==l2||l2==l3||l3==l1) {
            System.out.println("O triangulo é Isoceles");
            } else if (l1!=l2&&l2!=l3&&l3!=l1) {
            System.out.println("O triangulo é escaleno");
            }
        }
        sc.close();
    }
}