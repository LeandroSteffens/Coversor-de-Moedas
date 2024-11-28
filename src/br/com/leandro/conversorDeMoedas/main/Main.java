import br.com.leandro.conversorDeMoedas.model.ConsultaAPI;
import br.com.leandro.conversorDeMoedas.model.Conversao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var escolha = 0;
        double valor = 0.0;
        String moedaOrigem = "";
        String moedaDestino = "";
        ConsultaAPI consulta = new ConsultaAPI();

        while (escolha != 7) {
            System.out.println("*******************");
            System.out.println("1) USD -> BRL");
            System.out.println("2) BRL -> USD");
            System.out.println("3) USD -> EUR");
            System.out.println("4) EUR -> USD");
            System.out.println("5) USD -> CNY");
            System.out.println("6) CNY -> USD");
            System.out.println("7) SAIR");
            System.out.println("*******************");
            System.out.println("Digite uma opção: ");
            
            try {
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Digite o valor do USD: ");
                        valor = scanner.nextDouble();
                        moedaOrigem = "USD";
                        moedaDestino = "BRL";
                        exibirResultado(consulta, moedaOrigem, moedaDestino, valor);
                        break;
                    case 2:
                        System.out.println("Digite o valor do BRL: ");
                        valor = scanner.nextDouble();
                        moedaOrigem = "BRL";
                        moedaDestino = "USD";
                        exibirResultado(consulta, moedaOrigem, moedaDestino, valor);
                        break;
                    case 3:
                        System.out.println("Digite o valor do USD: ");
                        valor = scanner.nextDouble();
                        moedaOrigem = "USD";
                        moedaDestino = "EUR";
                        exibirResultado(consulta, moedaOrigem, moedaDestino, valor);
                        break;
                    case 4:
                        System.out.println("Digite o valor do EUR: ");
                        valor = scanner.nextDouble();
                        moedaOrigem = "EUR";
                        moedaDestino = "USD";
                        exibirResultado(consulta, moedaOrigem, moedaDestino, valor);
                        break;
                    case 5:
                        System.out.println("Digite o valor do USD: ");
                        valor = scanner.nextDouble();
                        moedaOrigem = "USD";
                        moedaDestino = "CNY";
                        exibirResultado(consulta, moedaOrigem, moedaDestino, valor);
                        break;
                    case 6:
                        System.out.println("Digite o valor do CNY: ");
                        valor = scanner.nextDouble();
                        moedaOrigem = "CNY";
                        moedaDestino = "USD";
                        exibirResultado(consulta, moedaOrigem, moedaDestino, valor);
                        break;
                    case 7:
                        System.out.println("Finalizando o programa!");
                        break;
                    default:
                        System.out.println("Entrada inválida!");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.nextLine(); // Limpa o buffer
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }

    private static void exibirResultado(ConsultaAPI consulta, String moedaOrigem, String moedaDestino, double valor) {
        try {
            Conversao novaConversao = consulta.conversao1(moedaOrigem, moedaDestino, valor);
            System.out.println("Valor após conversão: " + novaConversao + " " + moedaDestino);
        } catch (Exception e) {
            System.out.println("Erro ao realizar a conversão: " + e.getMessage());
        }
    }
}
