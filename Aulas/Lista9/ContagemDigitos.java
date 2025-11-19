import java.util.Scanner;

public class ContagemDigitos {

    public static void main(String[] args) {
        int numero = lerNumeroValido();
        int[] contagem = new int[10];

        contarDigitos(numero, contagem);
        exibirResultado(contagem);
    }

    private static int lerNumeroValido() {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();

            if (numero < 1 || numero > 999_999_999) {
                System.out.println("Número inválido! Digite entre 1 e 999999999.");
            }

        } while (numero < 1 || numero > 999_999_999);

        return numero;
    }

    private static void contarDigitos(int numero, int[] contagem) {
        int temp = numero;

        while (temp > 0) {
            int digito = temp % 10;
            contagem[digito]++;
            temp /= 10;
        }
    }

    private static void exibirResultado(int[] contagem) {
        System.out.println("Quantidade de cada dígito");

        for (int i = 0; i < 10; i++) {
            if (contagem[i] > 0) {
                System.out.printf(
                    "%d: %d %s%n",
                    i,
                    contagem[i],
                    contagem[i] == 1 ? "vez" : "vezes"
                );
            }
        }
    }
}
