package exerciciosAlgoritimo;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos selecionar um Mes");
        System.out.print("Informe o número de 1 a 12: ");
        int numeroDoMes = entrada.nextInt(); entrada.nextLine();
        entrada.close();

        switch (numeroDoMes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês informado não existe");
        }

        // CURIOSIDADE a partir do JAVA 17 o SWITCH EXPRESSION

        //Switch statement
        /*switch (value) {
            case "A":
                callMethod1();
                break;
            case "B":
                callMethod2();
                break;
            default:
                callMethod3();
        }

        //Switch Expression
        switch (value) {
            case "A"-> callMethod1();
            case "B"-> callMethod2();
            default -> callMethod3();
        }*/
    }
}
