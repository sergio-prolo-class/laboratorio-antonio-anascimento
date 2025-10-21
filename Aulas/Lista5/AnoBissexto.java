import java.util.Scanner;

public class AnoBissexto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano");
        int ano = sc.nextInt();
        String resultado = (ano%400==0||(ano%4==0&&ano%100!=0)) ? "Bissexto" : "Não bissexto";

        System.out.println("O ano " + ano + " é " + resultado + ".");
        sc. close();

        }
    }
   

        