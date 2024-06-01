import java.util.Scanner;

public class quest9 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[3];
        int totalLetrasA = 0;
        int totalLetrasE = 0;
        
        System.out.println("Digite os três nomes:");
        for (int i = 0; i < 3; i++) {
            nomes[i] = scanner.nextLine().toLowerCase(); // Converter para minúsculas para facilitar a contagem
            totalLetrasA += contarLetras(nomes[i], 'a');
            totalLetrasE += contarLetras(nomes[i], 'e');
        }
        
        System.out.println("Total de letras A: " + totalLetrasA);
        System.out.println("Total de letras E: " + totalLetrasE);
        
        scanner.close();
    }
    
    public static int contarLetras(String nome, char letra) {
        int count = 0;
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == letra) {
                count++;
            }
        }
        return count;
    }

}
