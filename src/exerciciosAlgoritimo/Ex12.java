package exerciciosAlgoritimo;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos testar qual numereo é maior, informe 5.");
        int[] numeros = new int[5];
        for (int indice = 0; indice < 5; indice++){
            System.out.printf("Informe o número, %d : ", (indice+1));
            numeros[indice] = entrada.nextInt(); entrada.nextLine();
        }
        // desordenado
        System.out.println(Arrays.toString(numeros));

        //Ordenado usando o a lib do Java
        //Arrays.sort(numeros);
        //System.out.println(Arrays.toString(numeros));

        //ordenado usando algoritimo de ordenacao
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j < numeros.length -i - 1; j++) {
                if (numeros[j] > numeros[j +1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
        System.out.println(Arrays.toString(numeros));

        entrada.close();
    }
}
