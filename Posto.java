
import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Criando os combustíveis
        Gasolina g1 = new Gasolina("Álcool", 3.0);
        Gasolina g2 = new Gasolina("Gasolina", 5.0);

        System.out.println("=== Bem-vindo ao Posto de Combustível ===");
        System.out.println("1 - " + g1.exibirInfo());
        System.out.println("2 - " + g2.exibirInfo());

        System.out.println("Deseja abastecer? (1 = sim, 2 = não)");
        int s = teclado.nextInt();

        if (s == 1) {
            // Primeiro escolhe o combustível
            System.out.println("Escolha o combustível (1 = Álcool | 2 = Gasolina):");
            int opcaoCombustivel = teclado.nextInt();

            Gasolina escolhido;
            if (opcaoCombustivel == 1) {
                escolhido = g1;
            } else if (opcaoCombustivel == 2) {
                escolhido = g2;
            } else {
                System.out.println("Opção de combustível inválida!");
                teclado.close();
                return; // encerra o programa
            }

            // Depois escolhe se abastece por litros ou valor
            System.out.println("Deseja abastecer por:");
            System.out.println("1 - Litros");
            System.out.println("2 - Valor em R$");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos litros deseja abastecer? ");
                    double litros = teclado.nextDouble();
                    double valorTotal = escolhido.calcularPorLitros(litros);
                    System.out.println("Você abasteceu " + litros + " litros de " + escolhido.getNomeCombustivel()
                            + ". Valor a pagar: R$ " + valorTotal);
                    break;

                case 2:
                    System.out.print("Qual valor em R$ deseja abastecer? ");
                    double valor = teclado.nextDouble();
                    double litrosAbastecidos = escolhido.calcularPorValor(valor);
                    System.out.println("Você abasteceu " + litrosAbastecidos + " litros de " + escolhido.getNomeCombustivel()
                            + ". Valor pago: R$ " + valor);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } else {
            System.out.println("Ok, tenha um bom dia!");
        }

        teclado.close();
    }
}


