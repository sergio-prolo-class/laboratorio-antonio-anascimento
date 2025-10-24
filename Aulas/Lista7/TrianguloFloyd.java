import java.util.Scanner;

public class TrianguloFloyd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a quantidade de linhas do triângulo de Floyd: ");
        int numLinhas = sc.nextInt();
        int num = 1;
        
        int contLinhas;
        int contColunas;
        for (contLinhas=1; contLinhas<=numLinhas ; contLinhas++) {
            for (contColunas=1; contColunas<=contLinhas ; contColunas++)
            System.out.print (num+" ");
            num++;
            System.out.println();
        }
    
        sc.close();
    }
}