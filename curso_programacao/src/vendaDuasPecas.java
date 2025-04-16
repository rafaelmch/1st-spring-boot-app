import java.util.Scanner;

public class vendaDuasPecas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pecaUm, pecaDois;
        String qtdUm, qtdDois, vlrUm, vlrDois;
        double quantidadeUm, quantidadeDois;
        double valorTotalUm, valorTotalDois, valorTotal;

        // Peça 1
        System.out.println("Código peça um: ");
        pecaUm = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Quantidade peça um: ");
        qtdUm = scanner.nextLine().replace(",", ".");
        quantidadeUm = Double.parseDouble(qtdUm);
        System.out.println("Valor peça um: ");
        vlrUm = scanner.nextLine().replace(",", ".");
        valorTotalUm = Double.parseDouble(vlrUm);

        // Peça 2
        System.out.println("Código peça dois: ");
        pecaDois = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Quantidade peça dois: ");
        qtdDois = scanner.nextLine().replace(",", ".");
        quantidadeDois = Double.parseDouble(qtdDois);
        System.out.println("Valor peça dois: ");
        //scanner.nextLine();
        vlrDois = scanner.nextLine().replace(",", ".");
        valorTotalDois = Double.parseDouble(vlrDois);

        // Valor Total
        valorTotal = (pecaUm * quantidadeUm) + (pecaDois * quantidadeDois);
        System.out.printf("Total a pagar: %.2f%n", valorTotal);

        scanner.close();
    }
}
