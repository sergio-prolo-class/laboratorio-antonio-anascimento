import java.util.Scanner;

public class Aposentadoria{
    public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com a idade ");
    System.out.println("Entre com o tempo de serviço");

    int idade = sc.nextInt();
    int tempoDeServico = sc.nextInt();
    
    if (idade>=65||tempoDeServico>=30||(idade>=60&&tempoDeServico>=25)) {
        System.out.println("Pode se aposentar");
    } else {
        System.out.println("Não pode se aposentar");
    }
    sc.close();
    }
}