import java.util.Scanner;

public class Ean {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Entre com a primeira parte (1 digito)");      
        long primeiraParte = sc.nextLong();
        System.out.println("Entre com a segunda parte (6 digitos)");  
        long segundaParte = sc.nextLong();
        System.out.println("Entre com a terceira parte (5 digitos)");
        long terceiraParte = sc.nextLong();
        long codigoCompleto = (primeiraParte * 1_000_000_00000l + segundaParte * 100_000l + terceiraParte);

        int d1  = (int)(codigoCompleto / 100000000000L % 10);
        int d2  = (int)(codigoCompleto/ 10000000000L % 10);
        int d3  = (int)(codigoCompleto / 1000000000L % 10);
        int d4  = (int)(codigoCompleto / 100000000L % 10);
        int d5  = (int)(codigoCompleto / 10000000L % 10);
        int d6  = (int)(codigoCompleto / 1000000L % 10);
        int d7  = (int)(codigoCompleto / 100000L % 10);
        int d8  = (int)(codigoCompleto / 10000L % 10);
        int d9  = (int)(codigoCompleto / 1000L % 10);
        int d10 = (int)(codigoCompleto / 100L % 10);
        int d11 = (int)(codigoCompleto / 10L % 10);
        int d12 = (int)(codigoCompleto % 10);

        
        int somaImpares = d1 + d3 + d5 + d7 + d9 + d11;
        int somaPares   = d2 + d4 + d6 + d8 + d10 + d12;
        int total       = somaImpares + somaPares * 3;
        int digito      = (10 - (total % 10)) % 10;

        System.out.println("Dígito verificador: " + digito);

        sc.close();
    }
}
    