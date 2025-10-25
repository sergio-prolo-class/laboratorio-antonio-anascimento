import java.util.Scanner;

public class Rpg {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        int vitalidadeInicial = 0;
        int level=0;
        int incremento=0;


        System.out.println("Entre com a classe, (1-Arqueiro, 2-Bárbaro, 3-Druída, 4-Mago)");
        int classe = sc.nextInt();
        switch (classe) {
            case 1:
            vitalidadeInicial = 150;
            incremento = 10;
            break;
            case 2:
            vitalidadeInicial = 200;
            incremento = 15;
            break;
            case 3:
            vitalidadeInicial = 100;
            incremento =5;
            break;
            case 4:
            vitalidadeInicial = 80;
            incremento = 4;
            break;
            default:
            System.out.println("Classe inválida");
            sc.close();
            return;
        }

        System.out.println("Entre com a vitalidade desejada");
        int vitalidadeDesejada = sc.nextInt();
        while (vitalidadeInicial<=vitalidadeDesejada) {
            if (level%5==0) {
                level++;
                vitalidadeInicial+=(incremento*2);
            }else {
                level++;
                vitalidadeInicial+=incremento;
            }
        }
        System.out.printf("O Nivel nescessário é: %d%n",level);
        sc.close();
    }
}
    

    
