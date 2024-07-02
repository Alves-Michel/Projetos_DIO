package Projeto2;

import java.util.Scanner;

public class simulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Depositar \n2. Sacar \n3. Consultar Saldo \n0. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor de deposito: ");
                    double deposito = scanner.nextDouble();

                    saldo += deposito;
                    System.out.println(String.format("Saldo Atual: %.2f",saldo) );
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor de saque: ");
                    double saque = scanner.nextDouble();

                    if(saque <= saldo){
                        saldo -= saque;
                        System.out.println(String.format("Saldo Atual: %.2f",saldo) );
                    }else{
                        System.out.println("Saldo Insuficiente! ");
                    }

                    break;
                case 3:
                    System.out.println(String.format("Saldo Atual: %.2f",saldo) );
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
