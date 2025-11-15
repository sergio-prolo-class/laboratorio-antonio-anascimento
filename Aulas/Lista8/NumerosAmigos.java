import java.util.Scanner;

public class NumerosAmigos {

    
    static int somaDivisores(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) { 
            if (n % i == 0) {
                soma += i;
            }
        }
        return soma;
    }


    static boolean saoAmigos(int n1, int n2) {
        return somaDivisores(n1) == n2 && somaDivisores(n2) == n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        do {
            System.out.print("Entre com um inteiro positivo: ");
            a = sc.nextInt();
        } while (a <= 0);

        do {
            System.out.print("Entre com um inteiro positivo: ");
            b = sc.nextInt();
        } while (b <= 0);

        if (saoAmigos(a, b)) {
            System.out.println("Os números são amigos :)");
        } else {
            System.out.println("Os números não são amigos");
        }

        sc.close();
    }
}
