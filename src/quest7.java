import java.util.Scanner;

public class quest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor para armazenar os nomes
        String[] nomes = new String[3];

        // Preenchendo o vetor com os nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Contando as letras "A" e "E" nos nomes
        int totalA = 0;
        int totalE = 0;
        for (String nome : nomes) {
            for (int i = 0; i < nome.length(); i++) {
                char letra = nome.charAt(i);
                if (letra == 'A' || letra == 'a') {
                    totalA++;
                } else if (letra == 'E' || letra == 'e') {
                    totalE++;
                }
            }
        }

        // Exibindo o resultado
        System.out.println("Quantidade de letras 'A' nos nomes: " + totalA);
        System.out.println("Quantidade de letras 'E' nos nomes: " + totalE);

        scanner.close();
    }
}
