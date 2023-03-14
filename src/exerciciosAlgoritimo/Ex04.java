package exerciciosAlgoritimo;

public class Ex04 {
    public static void main(String[] args) {
        String nome = "Thiago";
        String emailp1 = "thiago";
        String emailp2 = "yahoo.com.br";
        String senha = "123456";

        int cpfp1 = 44;
        int cpfp2 = 906;
        int cpfp3 = 274;
        int cpfp4 = 8;


        System.out.println("######### USUÁRIO #########");
        System.out.println("Nome: " + nome);
        System.out.printf("CPF: %s . %s . %s - %s\n", String.format("%03d", cpfp1), String.format("%03d", cpfp2),
                String.format("%03d", cpfp3), String.format("%02d", cpfp4));
        System.out.printf("Email: %s@%s\n", emailp1, emailp2);
        System.out.println("Senha: " + senha);
        System.out.println("###########################");
    }
}
