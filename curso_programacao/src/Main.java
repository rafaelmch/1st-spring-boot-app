import java.util.Locale;

// todo o código tem que estar dentro de uma classe
// o Main java corresponde a uma classe
// sendo assim
// todo o código TEM QUE ESTAR DENTRO DA CLASSE
public class Main {
    public static void main(String[] args){
        double y = 10.4859;

        System.out.println("Funplex Optmized Learning University!");
        System.out.printf("%.2f%n", y); // formata e arredonda
        System.out.printf("%.4f%n", y); // formata e arredonda
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", y); // formata e arredonda
        System.out.printf("%.4f%n", y); // formata e arredonda
        System.out.println("RESULTADO: " + y + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", y);

        String nome = "Funplex";
        int idade = 3;
        System.out.printf("%s was born %d days ago!%n", nome, idade);

        //Locale.setDefault(Locale.getDefault());
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n%n"
                        + "Record: %d years old, code %d and gender: %c.%n%n"
                        + "Measure with eight decimal places: %.8f%n"
                        + "Rounded (three decimal places): %.3f%n"
                        + "US decimal point: %.3f%n",
                product1, price1, product2, price2, age, code, gender, measure, measure, measure);

        int x, z;
        x = 5;
        z = 10 * x;

        System.out.println("X: " + x);
        System.out.println("Y: " + z);

        double b, B, h, area;
        float f;
        b = 6.0; // colocar o .0 para indicar que é double
        B = 8.0;
        h = 5.0;
        f = 8f; // indica que é um float

        area = (b + B) / 2.0 * h;

        System.out.println("Area: " + area);
        System.out.println("Float: " + f);

        int primeiroNumero, segundoNumero;
        double resultado;

        primeiroNumero = 5;
        segundoNumero = 2;

        resultado = (double) primeiroNumero / segundoNumero; // casting;

        System.out.println("Resultado: " + resultado);

        // casting 2
        double cast1;
        int cast2;
        cast1 = 5.0;
        cast2 = (int) cast1;

        System.out.println(b);


    }

}

