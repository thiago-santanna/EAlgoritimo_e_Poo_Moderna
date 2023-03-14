package exerciciosPOO.ex08;


public class Programa {
    public static void main(String[] args) {
        Usuario john = new Usuario();

        john.setNome("Jon Doe");
        john.setIdade(36);
        john.setGenero("Masculino");
        john.setCpf("044.906.274.09");
        john.setSalario(1500.00);

        john.imprimirInformacoes();
    }
}
