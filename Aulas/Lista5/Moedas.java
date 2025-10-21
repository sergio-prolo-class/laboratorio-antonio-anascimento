import java.util.Scanner;

public class Moedas {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor em centavos");
        int valor = sc.nextInt();
        int moeda = valor/50;
        valor = valor%50;
        System.out.println("Moedas de 50: " + moeda);
        moeda = valor/25;
        valor = valor%25;
        System.out.println("Moedas de 25: " + moeda);
        moeda = valor/10;
        valor = valor%10;
        System.out.println("Moedas de 10: " + moeda);
        moeda = valor/5;
        valor = valor%5;
        System.out.println("Moedas de 5: " + moeda);
        moeda = valor/1;
        valor = valor%1;
        System.out.println("Moedas de 1: " + moeda);
        
        sc.close();
    }
}
