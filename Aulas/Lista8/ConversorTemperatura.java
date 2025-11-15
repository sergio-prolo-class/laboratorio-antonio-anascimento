import java.util.Scanner;

public class ConversorTemperatura {

    static double deCparaK(double t) {
        return t + 273.15;
    }

    static double deCparaF(double t) {
        return 1.8 * t + 32;
    }

    static double deKparaC(double t) {
        return t - 273.15;
    }

    static double deFparaC(double t) {
        return (t - 32) / 1.8;
    }

    static double deFparaK(double t) {
        return deCparaK(deFparaC(t));
    }

    static double deKparaF(double t) {
        return deCparaF(deKparaC(t));
    }

    static double converteTemp(double t, char origem, char destino) {

        if (origem == destino)
            return t;

        switch (origem) {
            case 'C':
                if (destino == 'K') return deCparaK(t);
                if (destino == 'F') return deCparaF(t);
                break;

            case 'K':
                if (destino == 'C') return deKparaC(t);
                if (destino == 'F') return deKparaF(t);
                break;

            case 'F':
                if (destino == 'C') return deFparaC(t);
                if (destino == 'K') return deFparaK(t);
                break;
        }

        return Double.NaN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma temperatura: ");
        double temp = sc.nextDouble();

        System.out.print("Entre com a escala de origem (C, K ou F): ");
        char o = sc.next().toUpperCase().charAt(0);

        System.out.print("Entre com a escala de destino (C, K ou F): ");
        char d = sc.next().toUpperCase().charAt(0);

        if (o == 'K' && temp < 0) {
            System.out.printf("Temperatura %.2f inválida para escala de origem Kelvin%n", temp);
            return;
        }

        double convertido = converteTemp(temp, o, d);

        System.out.printf("Temperatura convertida: %.2f%n", convertido);

        sc.close();
    }
}
