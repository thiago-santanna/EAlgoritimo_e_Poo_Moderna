package exerciciosAlgoritimo;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome de sua mãe");
        String nomeMae = entrada.nextLine();

        System.out.println("Informe idade de sua mãe");
        int idadeMae = entrada.nextInt(); entrada.nextLine();

        System.out.println("Informe o nome de seu pai");
        String nomePai = entrada.nextLine();

        System.out.println("Informe idade de seu pai");
        int idadePai = entrada.nextInt(); entrada.nextLine();

        System.out.printf("Mãe : %s - Idade: %d\n", nomeMae, idadeMae);
        System.out.printf("Pai : %s - Idade: %d", nomePai, idadePai);



        entrada.close();

    }
}
