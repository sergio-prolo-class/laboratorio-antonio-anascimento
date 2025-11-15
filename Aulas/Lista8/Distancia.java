import java.util.Scanner;

public class Distancia {

    static double hav(double theta) {
        return Math.pow(Math.sin(theta / 2), 2);
    }

    static double distancia(double lat1, double lon1, double lat2, double lon2) {
        final double R = 6378.13;

        double radLat1 = Math.toRadians(lat1);
        double radLon1 = Math.toRadians(lon1);
        double radLat2 = Math.toRadians(lat2);
        double radLon2 = Math.toRadians(lon2);

        double dLat = radLat2 - radLat1;
        double dLon = radLon2 - radLon1;

        double h = hav(dLat)
                + Math.cos(radLat1) * Math.cos(radLat2) * hav(dLon);

        return 2 * R * Math.asin(Math.sqrt(h));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lat1, lon1, lat2, lon2;

        System.out.print("Entre com a latitude do primeiro ponto (em graus): ");
        lat1 = sc.nextDouble();
        if (lat1 < -90 || lat1 > 90) {
            System.out.println("Latitude inválida.");
            return;
        }

        System.out.print("Entre com a longitude do primeiro ponto (em graus): ");
        lon1 = sc.nextDouble();
        if (lon1 < -180 || lon1 > 180) {
            System.out.println("Longitude inválida.");
            return;
        }

        System.out.print("Entre com a latitude do segundo ponto (em graus): ");
        lat2 = sc.nextDouble();
        if (lat2 < -90 || lat2 > 90) {
            System.out.println("Latitude inválida.");
            return;
        }

        System.out.print("Entre com a longitude do segundo ponto (em graus): ");
        lon2 = sc.nextDouble();
        if (lon2 < -180 || lon2 > 180) {
            System.out.println("Longitude inválida.");
            return;
        }

        double d = distancia(lat1, lon1, lat2, lon2);

        System.out.printf("A distância é: %.2f km%n", d);

        sc.close();
    }
}
