import java.util.Scanner;

public class CalendarioMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes, primeiroDia, diasNoMes = 0;

        while (true) {
            System.out.print("Entre com o número do mês: ");
            mes = sc.nextInt();

            System.out.print("Entre com o primeiro dia da semana: ");
            primeiroDia = sc.nextInt();

            if (mes < 1 || mes > 12 || primeiroDia < 1 || primeiroDia > 7) {
                System.out.println("Valores inválidos. Tente novamente.\n");
                continue; 
            }

            switch (mes) {
                case 2:
                    diasNoMes = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diasNoMes = 30;
                    break;
                default:
                    diasNoMes = 31;
            }

            System.out.println();
            System.out.println("D S T Q Q S S");

            for (int i = 1; i < primeiroDia; i++) {
                System.out.printf(" ");
            }

            for (int dia = 1; dia <= diasNoMes; dia++) {
                System.out.printf("%2d ", dia);

                if ((dia + primeiroDia - 1) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println("\n");
            break;
        }

        sc.close();
    }
}
