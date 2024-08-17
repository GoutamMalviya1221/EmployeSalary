package employeSalary;

import java.util.Scanner;

public class Main {

    // Method to get employee details from user
    public static Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter Id: ");
        employee.setEmployeeId(scanner.nextInt());

        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter Name: ");
        employee.setEmployeeName(scanner.nextLine());

        System.out.print("Enter salary: ");
        employee.setSalary(scanner.nextDouble());

        return employee;
    }

    // Method to get PF percentage from user
    public static int getPFPercentage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PF percentage: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Get employee details
        Employee employee = getEmployeeDetails();

        // Get PF percentage
        int pfPercentage = getPFPercentage();

        // Calculate net salary
        employee.calculateNetSalary(pfPercentage);

        System.out.println("-----------------------------------------------------------");
        // Print employee details
        System.out.println("Id : " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Net Salary: " + employee.getNetSalary());
    }
}