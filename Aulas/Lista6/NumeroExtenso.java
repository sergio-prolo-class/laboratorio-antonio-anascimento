import java.util.Scanner;

public class NumeroExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número inteiro de 1 a 99: ");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("Número fora do intervalo permitido!");
        } 
        else if (numero < 20) {
            switch (numero) {
                case 1:  System.out.println("Número por extenso: um"); break;
                case 2:  System.out.println("Número por extenso: dois"); break;
                case 3:  System.out.println("Número por extenso: três"); break;
                case 4:  System.out.println("Número por extenso: quatro"); break;
                case 5:  System.out.println("Número por extenso: cinco"); break;
                case 6:  System.out.println("Número por extenso: seis"); break;
                case 7:  System.out.println("Número por extenso: sete"); break;
                case 8:  System.out.println("Número por extenso: oito"); break;
                case 9:  System.out.println("Número por extenso: nove"); break;
                case 10: System.out.println("Número por extenso: dez"); break;
                case 11: System.out.println("Número por extenso: onze"); break;
                case 12: System.out.println("Número por extenso: doze"); break;
                case 13: System.out.println("Número por extenso: treze"); break;
                case 14: System.out.println("Número por extenso: quatorze"); break;
                case 15: System.out.println("Número por extenso: quinze"); break;
                case 16: System.out.println("Número por extenso: dezesseis"); break;
                case 17: System.out.println("Número por extenso: dezessete"); break;
                case 18: System.out.println("Número por extenso: dezoito"); break;
                case 19: System.out.println("Número por extenso: dezenove"); break;
            }
        } else {
            int dezenas = numero / 10;
            int unidades = numero % 10;

            System.out.print("Número por extenso: ");

            switch (dezenas) {
                case 2: System.out.print("vinte"); break;
                case 3: System.out.print("trinta"); break;
                case 4: System.out.print("quarenta"); break;
                case 5: System.out.print("cinquenta"); break;
                case 6: System.out.print("sessenta"); break;
                case 7: System.out.print("setenta"); break;
                case 8: System.out.print("oitenta"); break;
                case 9: System.out.print("noventa"); break;
            }

            if (unidades != 0) {
                System.out.print(" e ");
                switch (unidades) {
                    case 1: System.out.print("um"); break;
                    case 2: System.out.print("dois"); break;
                    case 3: System.out.print("três"); break;
                    case 4: System.out.print("quatro"); break;
                    case 5: System.out.print("cinco"); break;
                    case 6: System.out.print("seis"); break;
                    case 7: System.out.print("sete"); break;
                    case 8: System.out.print("oito"); break;
                    case 9: System.out.print("nove"); break;
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
