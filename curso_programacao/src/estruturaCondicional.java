import java.util.Scanner;

public class estruturaCondicional {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("Informe o valor:");
        valor = scanner.nextInt();
        scanner.nextLine();
        if (valor < 10){
            System.out.println("Valor é menor que 10!");
        } else {
            System.out.println("Valor nao é menor que 10!");
        }
        scanner.close();
    }
}
