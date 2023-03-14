package exerciciosAlgoritimo;

public class Ex02 {
    public static void main(String[] args) {
        // a
        int var1 = 10;
        int var2 = 5;
        System.out.println(var1 + var2);
        System.out.println(var1 - var2);
        System.out.println(var1 * var2);
        System.out.println(var1 / var2);
        System.out.println(var1 % var2);

        // b
        int anoAtual = 2023;
        int anoNascimento = 1983;
        System.out.println("Thiago Sant`anna nascido em "+ anoNascimento +
                " com idade de " + (anoAtual - anoNascimento) + " anos.");

        // com printf
        System.out.printf("Thiago Sant`anna nascido em %d com idade de %d anos",
                anoNascimento, (anoAtual - anoNascimento));
/*
PARAMETROS
%c character
%d decimal (integer) number (base 10)
%e exponential floating-point number
%f floating-point number
%i integer (base 10)
%o octal number (base 8)
%s String
%u unsigned decimal (integer) number
%x number in hexadecimal (base 16)
%t formats date/time
%% print a percent sign
\% print a percent sign
\b backspace
\f next line first character starts to the right of current line last character
\n newline
\r carriage return
\t tab
\\ backslash
*/
    }

}
