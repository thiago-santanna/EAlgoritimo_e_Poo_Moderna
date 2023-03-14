package exerciciosPOO.ex10;

public class ContaInvestimento extends Conta {
    private double taxa;
    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public void sacar(double valor){
        setSaldo(getSaldo() - (valor + this.taxa));
    }

}
