package exerciciosAlgoritimo;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("informe o nome:");
        String nome = entrada.nextLine();
        System.out.print("Informe idade:");
        int idade = entrada.nextInt();entrada.nextLine();
        System.out.print("informe o cpf (___.___.___-__) : ");
        String cpf = entrada.nextLine();
        System.out.print("informe o genero:");
        String genero = entrada.nextLine();
        System.out.print("informe o email:");
        String email = entrada.nextLine();
        System.out.print("informe o telefone:(__ _ ____- ____) : ");
        String telefone = entrada.nextLine();
        System.out.print("informe a rua:");
        String rua = entrada.nextLine();
        System.out.print("Informe o numero:");
        int numero = entrada.nextInt();entrada.nextLine();
        System.out.print("informe o bairro:");
        String bairro = entrada.nextLine();
        System.out.print("informe a cidade:");
        String cidade = entrada.nextLine();
        entrada.close();

        System.out.println("################## Formulário Moderna #################\n");
        System.out.printf("Nome:%s Idade:%d\n", nome, idade);
        System.out.printf("CPF: %s \t\t\t\t\t\t\tGenero: %s\n", cpf, genero);
        System.out.printf("Email: %s\t\t       \t Tel: %s\n", email, telefone);
        System.out.println("----------------------- Endereço ----------------------\n");
        System.out.printf("Nº %d Rua: %s\n", numero, rua);
        System.out.printf("Bairro: %s\t\t\t\t\tCidade: %s\n", bairro, cidade);
        System.out.println("#####################################################");
    }
}
