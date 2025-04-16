import java.util.Scanner;

public class SomeDiferenca {
    public static void main(String[] args){
        // scanner for input
        Scanner scanner = new Scanner(System.in);

        int valorUm, valorDois, valorTres, valorQuatro, diferenca;
        System.out.println("Informe os 4 valores:");

        valorUm = scanner.nextInt();
        valorDois = scanner.nextInt();
        valorTres = scanner.nextInt();
        valorQuatro = scanner.nextInt();

        diferenca = ((valorUm * valorDois) - (valorTres * valorQuatro));
        System.out.println("A diferença é: " + diferenca);

        scanner.close();
    }
}
