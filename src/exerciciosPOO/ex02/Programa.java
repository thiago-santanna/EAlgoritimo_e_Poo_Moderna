package exerciciosPOO.ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno john = new Aluno();
        Endereco rua = new Endereco();

        System.out.println("Vamos criar um sistema com opções");
        System.out.print("Informe o número de 1 a 5: ");
        System.out.println("Sendo");
        System.out.println(
                "1 - Cadastrar Aluno\n" +
                        "2 - Cadastrar Endereco\n" +
                        "3 - Vincular o endereco ao Aluno\n" +
                        "4 - Imprimir\n" +
                        "5 - Sair");
        int operacaoSelecionada = entrada.nextInt(); entrada.nextLine();

        while (true) {
            if(operacaoSelecionada < 1 || operacaoSelecionada > 5) {
                System.out.println("Opcao invalida");
            }else if (operacaoSelecionada == 1){
                System.out.println("Cadasrtando um ALuno");
                john.nome = "Jon Doe";
                john.idade = 36;
                john.genero = "Masculino";
            }else if (operacaoSelecionada == 2){
                System.out.println("Cadasrtando um Endereco");
                rua.rua = "Rua do barulho";
                rua.cep = "52120315";
                rua.complemento = "proximo a esquina do bar";
                rua.numero =  122;
            }else if (operacaoSelecionada == 3){
                System.out.println("Vinculando o endereco ao aluno");
                john.endereco = rua;
            }else if (operacaoSelecionada == 4){
                System.out.println("Imprimir");
                System.out.println("--------------------- Dados ------------------------");
                System.out.printf("Nome: %s\t\t\tIdade: %d\t\tGenero: %s\n", john.nome, john.idade, john.genero);
                System.out.printf("Telefone: %s\n", john.telefone);
                System.out.println("--------------------- Endereco ------------------------");
                System.out.printf("Rua: %s \t\t Numero: %d \t\t CEP: %s\n", john.endereco.rua, john.endereco.numero, john.endereco.cep);
                System.out.printf("Complemento: %s\n", john.endereco.complemento);
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
