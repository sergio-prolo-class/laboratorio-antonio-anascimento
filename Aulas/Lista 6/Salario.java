import java.util.Scanner;

public class Salario {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        final double SALARIO = 2000.00;
        System.out.println("Entre com o total de vendas");
        int totalVendas = sc.nextInt();
        System.out.println("Entre com a avaliação de desempenho");
        int avaliacao = sc.nextInt();
        double comissao;
        double remuneracaoFinal;

        if (totalVendas>=10000) {
            comissao = totalVendas * 0.07;
        } else {
            comissao = totalVendas * 0.05;
        }
        
        if (avaliacao>=8) {
            remuneracaoFinal = SALARIO + comissao + 500.00;
        } else {
            remuneracaoFinal = SALARIO + comissao;
        }
    
        System.out.printf("A remuneração final é: %.2f%n", remuneracaoFinal);
   }
}