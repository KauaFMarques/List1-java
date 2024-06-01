import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor do deposito: ");
        double deposito = scanner.nextDouble();

        System.out.print("Digite valor do juros: ");
        double juros = scanner.nextDouble();

        double rendimento = deposito * (juros / 100);

        System.out.println("Valor do rendimento: " + rendimento);
        System.out.println("Valor total: " + (deposito + rendimento));

        scanner.close();
    }
}
