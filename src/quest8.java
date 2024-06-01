import java.util.Scanner;

public class quest8 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];

        Scanner scanner = new Scanner(System.in);

        // Preenchendo a primeira matriz
        System.out.println("Preencha a primeira matriz:");
        preencherMatriz(matriz1, scanner);

        // Preenchendo a segunda matriz
        System.out.println("Preencha a segunda matriz:");
        preencherMatriz(matriz2, scanner);

        // Calculando e imprimindo a soma das matrizes
        System.out.println("Soma das matrizes:");
        int[][] soma = somarMatrizes(matriz1, matriz2);
        imprimirMatriz(soma);

        // Calculando e imprimindo a diferença das matrizes
        System.out.println("Diferença das matrizes:");
        int[][] diferenca = subtrairMatrizes(matriz1, matriz2);
        imprimirMatriz(diferenca);

        scanner.close();
    }

    // Método para preencher uma matriz com números inteiros
    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para somar duas matrizes
    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[5][5];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    // Método para subtrair duas matrizes
    public static int[][] subtrairMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[5][5];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resultado;
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
