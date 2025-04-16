import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // associa ao teclado no modo console
        String x;
        /*
        x = sc.next(); // le apenas uma palavra
        System.out.println("Você digitou:" + x);

        int a;
        a = sc.nextInt();
        System.out.println("Você digitou:" + a);

        double d;
        d = sc.nextDouble();

        System.out.println("Você digitou: " + d);

        char lerChar;
        lerChar = sc.next().charAt(0);

        System.out.println("Primeiro caracter: " + lerChar);
         */

        String s, t, u;
        s = sc.next();
        t = sc.next();
        u = sc.next();

        System.out.println("Você digitou: ");
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);

        sc.close();
    }
}

