import java.util.Scanner;

public class Senha {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SENHA_CORRETA = 314159;
        int i=1;
        int senha;

        do {
            System.out.println("Digite a senha:");
            senha = sc.nextInt();
            if (senha == SENHA_CORRETA&i<4){
                System.out.println("Acesso autorizado");
            } else if (senha!=SENHA_CORRETA&&i==3) {
                System.out.println("Acesso negado");
            } else {
                System.out.println("Senha incorreta");
            }
            i++;
        } while (i<4&&senha!=SENHA_CORRETA);
           
        sc.close();
    }
}
