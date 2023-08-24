/*Preencher um vetor de 8 elementos inteiros Mostrar o vetor e informar quantos números são
maior que 30 Imprimir a soma dos números maiores que 30 números Imprimir a soma total de
todos os 8 elementos do vetor*/

package Q1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;; //gera números de forma aleatória
        }

        System.out.println("Seu vetor é:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        int numMaiores30 = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 30) {
                numMaiores30++;
            }
        }

        int somaNumerosMaiores = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 30) {
                somaNumerosMaiores += vetor[i];
            }
        }
        System.out.println("Quantidade de números maiores que 30: " + numMaiores30);
        System.out.println("Soma dos números maiores que 30: " + somaNumerosMaiores);

        int total = 0;
        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }
        System.out.println("Soma total de todos os elementos do vetor: " + total);
    }
}