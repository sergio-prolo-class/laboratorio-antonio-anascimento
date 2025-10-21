import java.util.Scanner;

public class Corretora {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da transação");
        double valorTransacao = sc.nextDouble();
        double taxaCorretagem;

        if (valorTransacao<2500) {
            taxaCorretagem=30+(valorTransacao*0.017);
            if (taxaCorretagem<39) {
                taxaCorretagem=39;
            }
        } else if (valorTransacao<6250) {
            taxaCorretagem = 56+(valorTransacao*.0066);
        } else if (valorTransacao<20000) {
            taxaCorretagem = 76 + (valorTransacao*0.0034);
        } else if (valorTransacao<50000) {
            taxaCorretagem = 100 + (valorTransacao*0.0022);
        }else if (valorTransacao<500000) {
            taxaCorretagem = 155 +(valorTransacao*0.0011);
        } else {
            taxaCorretagem = 255 +(valorTransacao*0.0009);
        }
        
        System.out.printf("Taxa de corretagem: $%.2f%n", taxaCorretagem);
        sc.close();
    }
}