/*
 * Mario Tunchez
 * 5090-18-1890
 */
package bubble;

import java.util.Scanner;

public class Bubble {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int limite = 10;
        int[] A = new int[limite];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.floor(Math.random() * (1- 100 + 1) + 100);
        }

        System.out.println("ARREGLO DESORDENADO\n");
        Show(A);
        System.out.println("ARREGLO ORDENADO\n");
        Bubble(A);
        Show(A);

    }

    public static void Bubble(int vector[]) {
        int i, j, temp;

        for (i = 0; i < vector.length; i++) {
            for (j = 1; j < vector.length-1; j++) {
                if (vector[j] > vector[j + 1]) {
                    temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    public static void Show(int vector[]) {
        int i;

        for (i = 0; i < vector.length; i++) {
            System.out.println((i + 1) + ". " + vector[i]);
        }
        System.out.println(" ");
    }

}
