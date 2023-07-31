package Day32;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDatabase {

    HashMap<String, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        Employee employee1 = new Employee("Allen", "Finance", 6700);
        Employee employee2 = new Employee("Catherine", "Programmer", 11000);
        Employee employee3 = new Employee("Andrew", "Project Manager", 8500);
        Employee employee4 = new Employee("Zak", "Accountant", 6500);

        EmployeeDatabase employeeDatabase1 = new EmployeeDatabase();

//        employeeDatabase2.employees.put(employee1.name, employee1);
//        employeeDatabase2.employees.put(employee2.name, employee2);
//        employeeDatabase2.employees.put(employee3.name, employee3);
//        employeeDatabase2.employees.put(employee4.name, employee4);

        employeeDatabase1.addEmployee(employee1);
        employeeDatabase1.addEmployee(employee2);
        employeeDatabase1.addEmployee(employee3);
        employeeDatabase1.addEmployee(employee4);

        EmployeeDatabase employeeDatabase2 = new EmployeeDatabase();

        employeeDatabase1.printEmployeeMap();

        employeeDatabase1.updateEmployee();

        employeeDatabase1.printEmployeeMap();

        employeeDatabase1.updateEmployee();

        employeeDatabase1.printEmployeeMap();


        // remove some employee


    }

    public void addEmployee(Employee employee){
        employees.put(employee.name, employee);
    }

    public void printEmployeeMap(){
        for (Map.Entry<String, Employee> e: employees.entrySet()){
            System.out.println("Key: " + e.getKey());
            System.out.println("Name: " + e.getValue().name);
            System.out.println("Job: " + e.getValue().job);
            System.out.println("Salary: " + e.getValue().salary);
            System.out.println();
        }
    }

    public void updateEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of employee to update:");
        String updateKey = scanner.nextLine(); // Zak
        System.out.println("Enter a new name to set:");
        String changeNameTo = scanner.nextLine(); // Bob
        System.out.println("Enter a new job to set ");
        String changeJobTo = scanner.nextLine();
        System.out.println("Enter a new salary to set");
        double changeSalaryTo = scanner.nextDouble();

        Employee newObject = employees.get(updateKey);
        newObject.name = changeNameTo;
        newObject.job = changeJobTo;
        newObject.salary = changeSalaryTo;

        employees.remove(updateKey);
        employees.put(changeNameTo, newObject);
    }

}
