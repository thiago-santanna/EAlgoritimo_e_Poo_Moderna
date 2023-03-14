package exerciciosAlgoritimo;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // a
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos testar se um número é Par ou Ímpar");
        System.out.print("Informe o número: ");
        int numeroTestado = entrada.nextInt(); entrada.nextLine();

        String resultado = numeroTestado % 2 > 0 ? "Ímpar" : "Par";
        System.out.println("O número é: " + resultado);

        // b
        System.out.println("Vamos testar umas operações matemáticas");
        System.out.print("Informe o número UM: ");
        int numeroUM = entrada.nextInt(); entrada.nextLine();
        System.out.print("Informe o número DOIS: ");
        int numeroDOIS = entrada.nextInt(); entrada.nextLine();

        entrada.close();

        int soma = numeroUM + numeroDOIS;
        int multiplicacao = numeroUM * numeroDOIS;
        boolean somaIgualMultiplicacao = soma == multiplicacao;

        System.out.println("Resultado se a soma e a multiplicação dos número são iguais");
        System.out.println("Resultado -> " + (somaIgualMultiplicacao ? "Sim são iguais" : "Não são iguais"));
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicacao: " + multiplicacao);
    }
}
