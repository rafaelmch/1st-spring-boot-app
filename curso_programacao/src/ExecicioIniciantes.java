import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ExecicioIniciantes {
    public static void main(String[] args){
        // read input data using Scanner(System.in)

        Scanner scanner = new Scanner(System.in);

        // ler o valor do raio de um círculo, depois mostrar o valor da área deste círculo com 4 casas decimaisw
        double pi = 3.14159;
        double raio, valorArea;

        // read input as string and replace comma with dot
        System.out.println("Enter the radius: ");
        String input = scanner.nextLine().replace(",", ".");
        raio = Double.parseDouble(input);

        valorArea = pi * (Math.pow(raio, 2));

        System.out.printf("Area: %.4f%n", valorArea);

        scanner.close();
    }
}
