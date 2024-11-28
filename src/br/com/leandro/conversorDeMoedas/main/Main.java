package br.com.leandro.conversorDeMoedas.main;

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

        while(escolha != 7){
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
            escolha = scanner.nextInt();
        
            switch (escolha){
                case 1:
                    System.out.println("Digite o valor do USD: ");
                    valor = scanner.nextDouble();
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    Conversao novaConversao = consulta.conversao1(moedaOrigem, moedaDestino, valor);
                    System.out.println("Valor após conversão: " + novaConversao + moedaDestino);
                    break;
                case 2:
                    System.out.println("Digite o valor do BRL: ");
                    valor = scanner.nextDouble();
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    Conversao novaConversao1 = consulta.conversao1(moedaOrigem, moedaDestino, valor);
                    System.out.println("Valor após conversão: " + novaConversao1 + moedaDestino);
                    break;
                case 3:
                    System.out.println("Digite o valor do USD: ");
                    valor = scanner.nextDouble();
                    moedaOrigem = "USD";
                    moedaDestino = "EUR";
                    Conversao novaConversao2 = consulta.conversao1(moedaOrigem, moedaDestino, valor);
                    System.out.println("Valor após conversão: " + novaConversao2 + moedaDestino);
                    break;
                case 4:
                    System.out.println("Digite o valor do EUR: ");
                    valor = scanner.nextDouble();
                    moedaOrigem = "EUR";
                    moedaDestino = "USD";
                    Conversao novaConversao3 = consulta.conversao1(moedaOrigem, moedaDestino, valor);
                    System.out.println("Valor após conversão: " + novaConversao3 + moedaDestino);
                    break;
                case 5:
                    System.out.println("Digite o valor do USD: ");
                    valor = scanner.nextDouble();
                    moedaOrigem = "USD";
                    moedaDestino = "CNY";
                    Conversao novaConversao4 = consulta.conversao1(moedaOrigem, moedaDestino, valor);
                    System.out.println("Valor após conversão: " + novaConversao4 + moedaDestino);
                    break;
                case 6:
                    System.out.println("Digite o valor do CNY: ");
                    valor = scanner.nextDouble();
                    moedaOrigem = "CNY";
                    moedaDestino = "USD";
                    Conversao novaConversao5 = consulta.conversao1(moedaOrigem, moedaDestino, valor);
                    System.out.println("Valor após conversão: " + novaConversao5 + moedaDestino);
                    break;
                case 7:
                    System.out.println("Finalizando o programa!");
                    break;
                default:
                    System.out.println("Entrada inválida!");
                    main();
                    break;
            }

        }
    }
}
