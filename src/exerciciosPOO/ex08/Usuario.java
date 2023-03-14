package exerciciosPOO.ex08;

public class Usuario {
    final static String OBSERVACAOTRANSFERENCIA = "TRANSFERENCIA";

    private String nome;
    private int idade;
    private String genero;
    private  String cpf;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void realizarLancamento(double valor, String tipo, String observacao) {
        if(tipo.toUpperCase().equals("CREDITO")) {
            this.salario += valor;
        }

        if(tipo.toUpperCase().equals("DEBITO")) {
            this.salario -= valor;
        }
    }

    public void imprimirInformacoes() {
        System.out.println("--------------------- Dados do usuario This(Instancia) -------------------");
        System.out.printf("Nome: %s\t\t\tIdade: %d\t\tGenero: %s\n", this.nome, this.idade, this.genero);
        System.out.printf("CPF: %s  \t\t Salario: R$ %.2f\n", this.cpf, this.salario);
    }

    public void imprimirInformacoes(Usuario usuario) {
        this.imprimirInformacoes();

        System.out.println("--------------------- Dados do Usuario parametro ------------------------");
        System.out.printf("Nome: %s\t\t\tIdade: %d\t\tGenero: %s\n", usuario.nome, usuario.idade, usuario.genero);
        System.out.printf("CPF: %s  \t\t Salario: R$ %.2f\n", usuario.cpf, usuario.salario);
    }

    public void transferirPara(Usuario usuario, double valor) {
        this.realizarLancamento(valor, "credito", OBSERVACAOTRANSFERENCIA);
        usuario.realizarLancamento(valor, "credito", OBSERVACAOTRANSFERENCIA);
    }

}
