import java.util.Scanner;

public class ComparacaoPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho dos arranjos: ");
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];


        System.out.print("Entre com os valores do primeiro: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.print("Entre com os valores do segundo: ");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        int resultado = comparaArranjos(x, y);

        if (resultado == 0) {
            System.out.println("Os arranjos possuem o mesmo número de pares");
        } else if (resultado == -1) {
            System.out.println("O primeiro arranjo possui mais pares");
        } else {
            System.out.println("O segundo arranjo possui mais pares");
        }

        sc.close();
    }

    public static int contaPares(int[] vals) {
        int cont = 0;
        for (int v : vals) {
            if (v % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static int comparaArranjos(int[] x, int[] y) {
        int px = contaPares(x);
        int py = contaPares(y);

        if (px == py) {
            return 0;
        } else if (px > py) {
            return -1;
        } else {
            return 1;
        }
    }
}
