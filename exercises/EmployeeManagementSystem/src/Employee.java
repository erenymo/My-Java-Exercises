import java.util.Random;
import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private String employeeID = "";
    private int salary;
    private String department;


    // Constructor
    public Employee() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Çalışan ismini giriniz > ");
        this.firstName = scan.nextLine();

        System.out.print("Çalışan soy ismini giriniz > ");
        this.lastName = scan.nextLine();

        System.out.print("Çalıştığı pozisyonu giriniz > ");
        this.department = scan.nextLine();

        System.out.print("Çalışan maaşını giriniz > $");
        this.salary = scan.nextInt();

        setEmployeeID();
        toString();
    }

    public Employee(String firstName, String lastName, int salary, String department, String employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.employeeID = employeeID;
    }

    // Generate ID
    private void setEmployeeID() {
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(10);
            this.employeeID += randomNumber;
        }
    }

    // Show status
    @Override
    public String toString() {
        return "♦İşçi ID : " + employeeID + " ♦Adı : " + firstName + " " + lastName + " ♦Pozisyon : " + department + " ♦Maaşı : $" + salary;
    }

    // Update Department
    public void setDepartment() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Çalışacağı pozisyonu güncelle > ");
        this.department = scan.nextLine();
    }

    // Update Salary
    public void setSalary() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Maaşı güncelle > $");
        this.salary = scan.nextInt();
    }


    // Getter
    public String getEmployeeID() {
        return employeeID;
    }
}
