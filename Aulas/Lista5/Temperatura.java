import java.util.Scanner;

public class Temperatura {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Farenheit: ");
        double tempF = sc.nextDouble(); //Lê a entrada em número
        double tempC = (tempF-32)*(5.0/9.0);
        System.out.println("A temperatura em graus Celsius é: " + tempC );

        sc.close();
    }
}