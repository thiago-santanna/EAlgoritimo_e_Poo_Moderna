package exerciciosPOO.ex01;

public class Programa {
    public static void main(String[] args) {
        Usuario john = new Usuario();
        Usuario jane = new Usuario();

        john.nome = "Jon Doe";
        john.idade = 36;
        john.genero = "Masculino";
        john.cpf = "044.906.274.09";
        john.salario = 1500.00;

        jane.nome = "Jane Doe";
        jane.idade = 29;
        jane.genero = "Feminino";
        jane.cpf = "024.666.274.09";
        jane.salario = 2500.00;

        System.out.println("--------------------------------------- Usuário 1 ---------------------------------");
        System.out.printf("Nome: %s\t\t\tIdade: %d\t\tGenero: %s\n", john.nome, john.idade, john.genero);
        System.out.printf("CPF: %s\t\t\tSalário: R$ %.2f\n", john.cpf, john.salario);
        System.out.println("--------------------------------------- Usuário 2 ---------------------------------");
        System.out.printf("Nome: %s\t\t\t\tIdade: %d\t\tGenero: %s\n", jane.nome, jane.idade, jane.genero);
        System.out.printf("CPF: %s\t\t     \t     Salário: R$ %.2f\n", jane.cpf, jane.salario);
    }
}
