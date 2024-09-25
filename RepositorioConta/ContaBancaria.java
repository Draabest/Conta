import java.util.Scanner; // Importando a utilidade Scanner

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando o objeto scanner


        // Informaçoes sobre a conta e seu proprietario
        System.out.print("Informe o nome do titular: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o número da conta: ");
        int numConta = scanner.nextInt();

        double saldoInicial = 200.00;
        System.out.println("Voce comeca com " +saldoInicial);

        TransacoesBancarias conta = new TransacoesBancarias(nome, numConta, saldoInicial); // Criando a conta

        //Escolha de operaçao
        System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();

        // Fazer a escolha que o usuario digitou
        switch (opcao) {


            //Caso o usuario queira depositar dinheiro em sua conta
            case 1:
                System.out.print("Informe o valor para depósito: ");                    
                double valorDeposito = scanner.nextDouble();
                conta.deposito(valorDeposito);
                break;


            //caso o usuario queira sacar o dinheiro de sua conta
            case 2:


                System.out.print("Informe o valor para saque: ");
                double valorSaque = scanner.nextDouble();                    
                conta.saque(valorSaque);
                break;

            //Caso o usuario queira ver o saldo
            case 3:

                conta.consultarSaldo();
               break;

            //Caso o usuario queira sair
            case 4:

                System.out.println("Saindo...");
                scanner.close();
                return;

            //Caso o usuario tenha digitado algo invalido
            default:

                System.out.println("Opção inválida. Tente novamente.");
        }
        scanner.close();// fechando o teclado
    }
}