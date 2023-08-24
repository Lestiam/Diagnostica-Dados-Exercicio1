/* Criar um algoritmo em Java para a seguinte situação:
✓ Existem 5 armários com 4 prateleiras cada um, em cada prateleira podem ser colocadas, no
máximo 10 caixas (considere todas as caixas iguais), construiremos um programa que indica
quando uma prateleira está cheia e não permite a inserção de novos itens, para isso iremos
declarar uma matriz de inteiros com nome estoque e dimensões 4 linhas (prateleiras) por 5
colunas (armários).
✓ Faça a entrada de dados para inserir uma caixa em uma determinada prateleira e armário.
Mostrar mensagem de espaço insuficiente se for inserido maior que 10 caixas em um
determinado armário.
✓ Ao final o programa deve mostrar na tela a quantidade de caixas em cada prateleira/armário.
OBS: coloque um flag no programa para encerrar e mostrar o resultado na tela. */
package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] estoque = new int[4][5];

        estoque = new int[4][5];

        boolean encerrar = false;
        while (!encerrar) {
            System.out.println("Insira a prateleira (1-4): ");
            int prateleira = sc.nextInt();
            System.out.println("Insira o armário (1-5): ");
            int armario = sc.nextInt();

            if (estoque[prateleira - 1][armario - 1] >= 10) {
                System.out.println("Prateleira cheia.");
            } else {
                estoque[prateleira - 1][armario - 1]++;
            }

            System.out.println("Deseja encerrar? (S/N): ");
            String resposta = sc.next();
            encerrar = resposta.toUpperCase().equals("S");
        }

        imprimeQuantidade(estoque);

        sc.close();
    }

    public static void imprimeQuantidade(int[][] estoque) {
        for (int i = 0; i < estoque.length; i++) {
            System.out.println("Prateleira " + (i + 1) + ":");
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.println("Armário " + (j + 1) + ": " + estoque[i][j]);
            }
        }
    }
}
