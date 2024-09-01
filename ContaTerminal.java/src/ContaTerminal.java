import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);


            System.out.print("Insira o numero da agencia: ");
                int agencia = scanner.nextInt();
                scanner.nextLine();

                //Solicatando o numero da conta ao usuario;
            System.out.print("Digite aqui o numero da conta em que deseja: ");
                int numeroConta = scanner.nextInt();
                scanner.nextLine();
                
                //Solicita o nome do usuario;
            System.out.print("Insira seu nome: ");
                String nomeCliente = scanner.nextLine();
            
                //Solicitar e ler o saldo;
            System.out.print("Digite o saldo inicial: ");
                double saldo = scanner.nextDouble();
                scanner.nextLine();
            
                //Solicita qual conta o usuario quer ter;
            System.out.print("Digite aqui o tipo de conta (Corrente ou poupança): ");
                String tipoConta = scanner.nextLine();


                // Exibir os dados da conta;

                System.out.println("\n Dados da conta: ");
                System.out.println("");
                System.out.println("Numero da agência: " + agencia);
                System.out.println("Numero da conta: " + numeroConta);
                System.out.println("Nome do cliente: " + nomeCliente);
                System.out.println("Saldo do cliente: " + saldo);
                System.out.println("Selecione o tipo de conta: " + tipoConta);
                System.out.println("");

                System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, " + "sua agência é " + agencia + ", conta " + numeroConta + ", e seu saldo " + saldo + " já está disponivel para saque. ");

                scanner.close();    
    }
}

