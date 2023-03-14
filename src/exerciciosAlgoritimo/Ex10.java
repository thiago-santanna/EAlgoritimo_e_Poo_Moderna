package exerciciosAlgoritimo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //se atendar ao bloco de visibilidade e inicializacoes
        String nome = null;
        int idade = 0;
        String sexo = null;
        LocalDate nascimento = null;

        String rua = null;
        int numero = 0;
        String bairro = null;
        String cep = null;

        System.out.println("Vamos criar um sistema com opções");
        System.out.print("Informe o número de 1 a 5: ");
        System.out.println("Sendo");
        System.out.println(
                "1 - Cadastrar Aluno\n" +
                "2 - Cadastrar Endereço\n" +
                "3 - Imprimir Aluno\n" +
                "4 - Imprimir Endereço\n" +
                "5 - Sair");
        int operacaoSelecionada = entrada.nextInt(); entrada.nextLine();

        while (true) {
            if(operacaoSelecionada < 1 || operacaoSelecionada > 5) {
                System.out.println("Opcao invalida");
            }
            else if (operacaoSelecionada == 1){
                System.out.println("Cadasrtando um ALuno");
                System.out.println("Informe o nome : ");
                nome = entrada.nextLine();
                System.out.println("Informe a idade: ");
                idade = entrada.nextInt(); entrada.nextLine();
                System.out.println("Informe o Sexo");
                sexo = entrada.nextLine();
                System.out.println("Informe a data de nascimento formato -> (dd/mm/aaaa)");
                nascimento = LocalDate.parse(entrada.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }else if (operacaoSelecionada == 2){
                System.out.println("Cadasrtando um Endereco");
                System.out.println("Informe a rua");
                rua = entrada.nextLine();
                System.out.println("Informe o numero");
                numero = entrada.nextInt(); entrada.nextLine();
                System.out.println("Informe o bairro");
                bairro = entrada.nextLine();
                System.out.println("Informe o cep");
                cep = entrada.nextLine();
            }else if (operacaoSelecionada == 3){
                System.out.println("Imprimir um ALuno");
                System.out.println("########### Aluno ##########");
                System.out.printf("Nome: %s Idade: %d\n", nome, idade);
                System.out.printf("Sexo: %s   A. de Nasc.: %s\n", sexo, nascimento.toString());
                System.out.println(" ");
            }else if (operacaoSelecionada == 4){
                System.out.println("Imprimir um endereco");
                System.out.println("########## Endereço #########");
                System.out.printf("Rua: %s Nº: %d\n", rua, numero);
                System.out.printf("Bairro: %s CEP: %s\n", bairro, cep);
                System.out.println(" ");
            }

            System.out.println(" ");
            System.out.println("Ainda temos algo a fazer? ou digite 5 pra sair.");
            System.out.println(
                    "1 - Cadastrar Aluno\n" +
                    "2 - Cadastrar Endereço\n" +
                    "3 - Imprimir Aluno\n" +
                    "4 - Imprimir Endereço\n" +
                    "5 - Sair");
            operacaoSelecionada = entrada.nextInt(); entrada.nextLine();

            if(operacaoSelecionada == 5){
                entrada.close();
                break;
            }
        }
    }
}
