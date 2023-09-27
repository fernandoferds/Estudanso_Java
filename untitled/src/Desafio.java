import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Fernando Higor";
        String tipoConta = "Corrente";
        double saldo = 1000;
        int opcao = 0;


        System.out.println("**********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**********************");

        String menu = """
                ** Digite sua opção **
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo ataul é de R$ " + saldo);
                    break
                    ;
                case 2:
                    System.out.println("Digite o valor a ser transferido ");
                    double tranferencia = leitura.nextDouble();
                    if(tranferencia<= saldo){
                        saldo = saldo - tranferencia;
                    }else {
                        System.out.println("Saldo indisponivel");
                    }
                    break
                    ;
                case 3:
                    System.out.println("Digite valor a ser recebido");
                    double recebido = leitura.nextDouble();
                    saldo = saldo + recebido;
                    break
                    ;
                case 4:
                    System.out.println("Finalizando caixa");
                    break
                    ;
            }
        }
    }
}
