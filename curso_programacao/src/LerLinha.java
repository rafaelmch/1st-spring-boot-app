import java.util.Scanner;

public class LerLinha {
    public static void main(String[] args){
        String linha1, linha2, linha3;
        int inteiro;

        Scanner sc = new Scanner(System.in);

        inteiro = sc.nextInt(); // quando usamos um comando de leitura diferente do nextLine e quebramos a linha,
        // essa quebra linha fica pendente na entrada padrão. Se entao fizermos um nextLine(),
        // aquela quebra de linha pendente serã absorvida pela nextline()
        sc.nextLine(); // consumir quebra pendente / limpar o buffer de leitura
        linha1 = sc.nextLine(); // o next() le apenas uma palavra, o nextLine() le a linha interia
        linha2 = sc.nextLine();
        linha3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(inteiro);
        System.out.println(linha1);
        System.out.println(linha2);
        System.out.println(linha3);

    }
}
