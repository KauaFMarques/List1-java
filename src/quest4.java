import java.util.Scanner;

public class quest4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um prato:");
        System.out.println("1-Italiano:");
        System.out.println("2-Japones:");
        System.out.println("3-Salvadoreno:");
        int prato=scanner.nextInt();

        System.out.println("Escolha uma bebida:");
        System.out.println("1-Chá:");
        System.out.println("2-Suco de laranja:");
        System.out.println("3-Refrigerante:");
        int bebida=scanner.nextInt();

        int caloriasPrato = 0;
        int caloriasBebida = 0;

        switch (prato) {
            case 1:
                caloriasPrato = 750;
                break;
            case 2:
                caloriasPrato = 342;
                break;
            case 3:
                caloriasPrato = 545;
                break;
            default:
                System.out.println("Opção de prato inválida.");
        }

        switch (bebida) {
            case 1:
                caloriasBebida = 30;
                break;
            case 2:
                caloriasBebida = 80;
                break;
            case 3:
                caloriasBebida = 90;
                break;
            default:
                System.out.println("Opção de bebida inválida.");
        }

        int totalCalorias = caloriasPrato + caloriasBebida;
        System.out.println("Total de calorias: " + totalCalorias);

        scanner.close();
    }
}
