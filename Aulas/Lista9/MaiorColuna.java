import java.util.Scanner;

public class MaiorColuna {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho da matriz quadrada: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Entre com os valores:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int indice = indiceColunaMaiorSoma(matriz);

        System.out.printf("O índice da coluna com maior soma é: %d%n", indice);

        sc.close();
    }

    public static int somaColuna(int[][] m, int col) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) soma += m[i][col];
        return soma;
    }

    public static int indiceColunaMaiorSoma(int[][] m) {
        int maiorIndice = 0;
        int maiorSoma = somaColuna(m, 0);

        for (int col = 1; col < m.length; col++) {
            int somaAtual = somaColuna(m, col);
            if (somaAtual > maiorSoma) {
                maiorSoma = somaAtual;
                maiorIndice = col;
            }
        }

        return maiorIndice;
    }
}
