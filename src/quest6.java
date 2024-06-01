import java.util.Scanner;

public class quest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para calcular média de salário, média de filhos e maior salário
        double somaSalarios = 0;
        int totalPessoas = 0;
        int totalFilhos = 0;
        double maiorSalario = Double.MIN_VALUE;

        // Loop para coletar informações dos habitantes
        while (true) {
            System.out.print("Digite o salário (ou -1 para encerrar): ");
            double salario = scanner.nextDouble();
            
            // Verifica se o usuário deseja encerrar a entrada de dados
            if (salario == -1) {
                break;
            }
            
            // Solicita o número de filhos
            System.out.print("Digite o número de filhos: ");
            int filhos = scanner.nextInt();

            // Atualiza os valores acumulados
            somaSalarios += salario;
            totalPessoas++;
            totalFilhos += filhos;
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
        }

        // Verifica se há habitantes cadastrados
        if (totalPessoas > 0) {
            // Calcula média de salário, média de filhos e exibe o maior salário
            double mediaSalario = somaSalarios / totalPessoas;
            double mediaFilhos = (double) totalFilhos / totalPessoas;

            System.out.println("Média de salário da população: " + mediaSalario);
            System.out.println("Média de filhos: " + mediaFilhos);
            System.out.println("Maior salário: " + maiorSalario);
        } else {
            System.out.println("Nenhum habitante cadastrado.");
        }

        scanner.close();
    }
}
