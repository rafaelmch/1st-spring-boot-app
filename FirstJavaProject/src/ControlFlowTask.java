// Control Flow
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ControlFlowTask {
    public static void main(String[] args){
        //System.out.println("Control Flow");
        //Scanner scanner = new Scanner(System.in);
        String input = JOptionPane.showInputDialog("Enter a number: ");
        try{
            int day = Integer.parseInt(input);
            dayOfTheWeek(day);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please, enter a valid number!");
        }
        // ifs
        firstControl();
        System.out.println();
        // switch
        //System.out.println();
        // loops
        whileLoop();
        System.out.println();
        // do while loop
        doWhileLoop();
        System.out.println();
        // for loop
        forLoop();
        System.out.println();
        // break loop
        breakLoop();
        System.out.println();
        // continue loop
        continueLoop();
    }
    // if
    public static void firstControl(){
        int number = 42;
        if (number > 0) {
            System.out.println("Positive number!");
        } else if (number < 0) {
            System.out.println("Negative number!");
        } else {
            System.out.println("It's my age!");
        }
    }
    // switch
    public static void dayOfTheWeek(int day) {
        //int day = 5;
        switch(day) {
            case 1:
                //System.out.println("Sunday");
                JOptionPane.showMessageDialog(null,"Sunday");
                break;
            case 2:
                //System.out.println("Monday");
                JOptionPane.showMessageDialog(null,"Monday");
                break;
            case 3:
                //System.out.println("Tuesday");
                JOptionPane.showMessageDialog(null,"Tuesday");
                break;
            case 4:
                //System.out.println("Wednesday");
                JOptionPane.showMessageDialog(null,"Wednesday");
                break;
            case 5:
                //System.out.println("Thursday");
                JOptionPane.showMessageDialog(null,"Thursday");
                break;
            case 6:
                //System.out.println("Friday");
                JOptionPane.showMessageDialog(null,"Friday");
                break;
            case 7:
                //System.out.println("Saturday");
                JOptionPane.showMessageDialog(null,"Saturday");
                break;
            default:
                //System.out.println("Any other day!");
                JOptionPane.showMessageDialog(null,"Whatever!");
                break;
        }
    }
    // while loop
    public static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println("I = " + i);
            i++;
        }
    }
    // do while loop
    public static void doWhileLoop() {
        int x = 10;
        do {
            System.out.println("X: " + x);
            x++;
        } while(x <= 15);
    }
    // for loop
    public static void forLoop() {
        for (int y = 25; y <= 30; y++) {
            System.out.println("Y: " + y);
        }
    }
    // break (exit loop)
    public static void breakLoop() {
        int a = 10;
        do {
            System.out.println("A: " + a);
            if(a == 12) {
                break;
            }
            a++;
        } while(a <= 15);
    }
    // continue (skips iteration and moves to the next one
    public static void continueLoop() {
        for(int b = 40; b <= 50; b++) {
            if(b == 45) {
                continue;
            }
            System.out.println("B: " + b);
        }
    }
}




