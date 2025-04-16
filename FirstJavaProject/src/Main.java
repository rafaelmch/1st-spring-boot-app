import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Displays a welcome message
        showWelcomeMessage(Main::returnProgramName);
        // Displays an array
        System.out.println();
        showArray();
        // Displays a while loop
        System.out.println();
        showWhileLoop();
        // Displays my operators method
        System.out.println();
        System.out.println(showOperators());
        // Displays my details
        System.out.println();
        showMyDetails();
        }

        public static String returnProgramName(){
            String s = "This is my first program!";
            return s;
        }

        public static void showWelcomeMessage(Supplier<String> programSupplier){
            System.out.println("Welcome, Raf! You're amazing! " + programSupplier.get());
        }

        // array
        public static void showArray(){
            int[] numbers = {3, 6, 9, 12};
            for (int number : numbers){
                System.out.println("Number: " + number);
            }
        }

        // while loop
        public static void showWhileLoop(){
            int i = 1;
            while(i < 5){
                System.out.println("i = " + i);
                i++;
            }
        }

        public static void showMyDetails(){
            int age = 42;
            String name = "Rafael Masuo Corrêa Hassegawa";
            double height = 1.77;
            boolean isGettingRich = true;

            System.out.println("Age: " + age);
            System.out.println("Name: " + name);
            System.out.println("Height: " + height);
            System.out.println("Are you getting rich? " + isGettingRich);
        }

        // Operators
        public static String showOperators(){
            int a = 10, b = 5;
            StringBuilder result = new StringBuilder();

            result.append("Addition: ").append(a + b).append("\n");
            result.append("Comparison (a > b): ").append(a > 0).append("\n");
            result.append("Logical (a > 5 && b < 10): ").append(a > 5 && b < 10).append("\n");

            return result.toString();
        }
    }
