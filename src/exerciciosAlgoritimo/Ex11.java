package exerciciosAlgoritimo;

public class Ex11 {
    public static void main(String[] args) {
        final int ZERO = 0;

        // a
        for (int i = 300; i >= 150; i--) {
            System.out.println("Posicao atual: " + i);
        }

        // b
        for (int i = 1; i <= 100; i++) {
            if( i % 2 == ZERO){
                System.out.println("Numero PAR: " + i);
            }
        }

        // c
        for (int i = 1; i <= 100; i++) {
            if( i % 3 == ZERO){
                System.out.println("Multipli de Tres: " + i);
            }
        }
    }
}
