import java.util.Scanner;

public class quest3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor da sua idade: ");
        double idade = scanner.nextDouble();

        if (idade < 16) {
            System.out.println("Não eleitor");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatório");
        } else {
            System.out.println("Eleitor facultativo");
        }
        
        scanner.close();
    }
}
