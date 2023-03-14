package exerciciosAlgoritimo;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = entrada.nextLine();
        System.out.println("Informe a quantidade de vezes que vai imprimir ele");
        int repeticoes = entrada.nextInt(); entrada.nextLine();

        int vezesQueImprimiu = 0;
        while (vezesQueImprimiu < repeticoes) {
            System.out.println("Nome : " + nome);
            vezesQueImprimiu ++;
        }

        entrada.close();
    }
}
