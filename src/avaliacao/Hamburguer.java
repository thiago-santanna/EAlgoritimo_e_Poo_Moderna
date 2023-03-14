package avaliacao;

public class Hamburguer {
    private String nome;
    private Hamburguer(){}
    public static Hamburguer criarHamburgerDeFrango() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setNome("Frango");
        return hamburguer;
    }
    public static Hamburguer criarHamburgerDeCarne() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setNome("Carne");
        return hamburguer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
