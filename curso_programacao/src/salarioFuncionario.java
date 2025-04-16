import java.util.Scanner;

public class salarioFuncionario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int employeeID, hours;
        double hourlyRate, salary;
        String strHourlyRate;

        System.out.println("Employee ID: ");
        employeeID = scanner.nextInt();
        System.out.println("Hours worked: ");
        hours = scanner.nextInt();
        System.out.println("Hourly rate: ");
        scanner.nextLine();
        strHourlyRate = scanner.nextLine().replace(",", ".");
        hourlyRate = Double.parseDouble(strHourlyRate);
        salary = hours * hourlyRate;
        System.out.println("Employee ID: " + employeeID);
        //System.out.println("SALARY = US$ " + salary);
        System.out.printf("SALARY = US$ %.2f%n", salary);
        System.out.printf("Em reais: R$ %.2f%n", (salary * 6.10));

        scanner.close();
    }
}
