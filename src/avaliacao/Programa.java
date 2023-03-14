package avaliacao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem vindo(a) Hamburgueria Moderna");
            System.out.println("Informe seus dados e faca seu pedido");
            System.out.println("====================================");
            System.out.println("Informe seu nome");
            String nomeCliente = scanner.nextLine();
            System.out.println("Informe seu telefone");
            String telefoneCliente = scanner.nextLine();
            Cliente cliente = new Cliente(nomeCliente, telefoneCliente);

            System.out.println("vamos ao pedido agora");
            List<Pedido> pedidos = new ArrayList<>();
            boolean emPedido = true;
            long numeroPedido = 0;
            while (emPedido) {
                numeroPedido ++;
                System.out.println("Vamos iniciar o pedido: " + numeroPedido);
                Pedido pedido = new Pedido(numeroPedido, LocalDateTime.now(), cliente);
                System.out.println("Escolha o tipo de carne. (1 - CARNE 2 - FRANGO)");
                int indiceCarne = scanner.nextInt(); scanner.nextLine();

                pedido.selecionarHamburguer(indiceCarne == 1 ? TiposHamburguer.CARNE : TiposHamburguer.FRANGO);

                System.out.print("Deseja verduras no Hamburguer? ");
                System.out.println("(1 - SIM 2 - NAO)");
                boolean queroVerdura = (scanner.nextInt() == 1);
                scanner.nextLine();
                System.out.print("Deseja molho no Hamburguer?");
                System.out.println("(1 - SIM 2 - NAO)");
                boolean queroMolho = (scanner.nextInt() == 1);
                scanner.nextLine();
                System.out.print("Deseja queijo no Hamburguer?");
                System.out.println("(1 - SIM 2 - NAO)");
                boolean queroQueijo = (scanner.nextInt() == 1);
                scanner.nextLine();
                pedido.adicionarAcompanhamentos(queroVerdura, queroMolho, queroQueijo);
                pedidos.add(pedido);

                System.out.println("Deseja fazer outro pedido?");
                System.out.println("(1 - SIM 2 - NAO)");
                int desejaMaisPedido = scanner.nextInt(); scanner.nextLine();
                if (desejaMaisPedido > 1) {
                    emPedido = false;
                }
            }
            pedidos.forEach( pedido -> System.out.println(pedido));
        }
    }
}
