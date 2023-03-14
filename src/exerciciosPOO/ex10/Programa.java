package exerciciosPOO.ex10;

public class Programa {
    public static void main(String[] args) {
        Conta investimento = new ContaInvestimento();
        Conta aposentadoria = new ContaAposentadoria();

        // INVESTIMENTO
        System.out.println("INVESTIMENTO");
        investimento.setNumero(10209);
        investimento.setSaldo(100);
        //investimento.setTaxa(7);
        System.out.println(investimento.getSaldo());

        investimento.depositar(200);
        investimento.sacar(150);
        System.out.println(investimento.getSaldo());

        //APOSENTADORIA
        System.out.println("APOSENTADORIA");
        aposentadoria.setNumero(10209);
        aposentadoria.setSaldo(100);
        //aposentadoria.setRendimento(7);
        System.out.println(aposentadoria.getSaldo());

        aposentadoria.depositar(200);
        aposentadoria.sacar(150);
        System.out.println(aposentadoria.getSaldo());
    }
}
