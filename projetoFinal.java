import java.util.Scanner;

public class projetoFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n***********************");
        System.out.println("BEM VINDO AO BANCO JULIABANK!");
        System.out.println("\nDigite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua conta: Corrente ou Poupança");
        String conta = scanner.nextLine();
        System.out.println("Digite seu saldo atual: ");
        double saldoAtual = scanner.nextDouble();

        System.out.println("\n***********************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + conta);
        System.out.println("Saldo inicial: " + saldoAtual);
        System.out.println("***********************");

        int opção = 0;
        String menu = """
                \nOperações:\n
                1- Consultar valor
                2- Transferir valor
                3- Sacar valor
                4- Sair
                                
                Digite a opção desejada: 
                """;

        while (opção != 4) {
            System.out.println(menu);
            opção = scanner.nextInt();

            if (opção == 1) {
                System.out.println("Seu saldo atualizado é: " + saldoAtual);
            } else if (opção == 2) {
                System.out.println("Qual o valor que deseja transferir?: ");
                double valor = scanner.nextDouble();
                if (valor > saldoAtual) {
                    System.out.println("Não ha saldo suficiente!");
                } else {
                    saldoAtual -= valor;
                    System.out.println("Novo saldo: " + saldoAtual);
                }
            } else if (opção == 3) {
                System.out.println("Digite o valor que deseja sacar: ");
                double valor = scanner.nextDouble();
                saldoAtual += valor;
                System.out.println("Você sacou: R$" + valor + ", seu novo saldo é: R$" + saldoAtual);
            } else{
                System.out.println("Até a proxima! O JuliaBank agradece sua visita!");
            }
        }
    }
}