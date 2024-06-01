import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os comprimentos dos três pedaços de madeira
        System.out.print("Digite o comprimento do primeiro pedaço de madeira: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo pedaço de madeira: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro pedaço de madeira: ");
        double c = scanner.nextDouble();

        // Verifica se os três pedaços podem formar um triângulo
        if (podeFormarTriangulo(a, b, c)) {
            System.out.println("Os comprimentos fornecidos podem formar um triângulo.");
        } else {
            System.out.println("Os comprimentos fornecidos não podem formar um triângulo.");
        }

        scanner.close();
    }

    public static boolean podeFormarTriangulo(double a, double b, double c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}

