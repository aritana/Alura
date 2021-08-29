package br.com.alura.escola;

import java.io.Console;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        //Comeco do Menu
       t
        int opcao = -1;
        System.out.println("\n Escolha as opções:\n 1 - para comparar \n 2 - para ver fatura \n 3 - para Encerrar\n");
        System.out.println("Digite sua opção (1, 2 ou 3):");
        do {
            opcao = ler.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    System.out.println("exibir produtos");
                    //coloque seu codigo aqui
                    System.out.println("Digite sua opção (1, 2 ou 3):");
                    break;
                case 2:
                    System.out.println("fatura gerada");
                    //coloque seu codigo aqui
                    System.out.println("Digite sua opção (1, 2 ou 3):");
                    break;
                case 3:
                    System.out.println("Encerrar Programa");
                    //coloque seu codigo aqui
                    System.out.println("Digite sua opção (1, 2 ou 3):");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    //coloque seu codigo aqui
                    System.out.println("Digite sua opção (1, 2 ou 3):");
                    break;
            }
        } while (opcao != 3);
        //Fim do Menu
    }

}
