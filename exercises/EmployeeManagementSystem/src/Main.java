import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static ArrayList<Employee> employees = new ArrayList<Employee>();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee emp1 = new Employee("Eren", "BALTA", 18000, "CEO", "00001");
        Employee emp2 = new Employee("Şulenur", "DURGUT", 12000, "CFO", "00002");
        Employee emp3 = new Employee("Mecnun Yiğit", "Yılmaz", 375, "Güvenlik", "00003");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        //  Menu
        int select = 0;
        while (select != 5) {
            System.out.println("######İşçi Yönetim Paneli######");
            System.out.println("1. İşçileri Görüntüle");
            System.out.println("2. İşçi Ekle");
            System.out.println("3. İşçi Güncelle");
            System.out.println("4. İşçi Sil");
            System.out.println("5. Çıkış");
            System.out.print("Hangi işlemi yapmak istiyorsunuz ? > ");
            select = scan.nextInt();

            if (select == 1) {
                viewEmployees();
            } else if (select == 2) {
                addEmployee();
            } else if (select == 3) {
                updateEmployee();
            } else if (select == 4) {
                deleteEmployee();
            } else if (select == 5) {
                System.out.println("Çıkış Yapılıyor !");
            } else {
                System.out.println("Geçersiz İşlem");
            }
        }

    }

    // Add Employee
    public static void addEmployee() {
        Scanner scan = new Scanner(System.in);
        int numOfEmployees;
        System.out.print("Kaç adet işçi eklemek istiyorsunuz? > ");
        numOfEmployees = scan.nextInt();
        for (int n = 0; n < numOfEmployees; n++) {
            System.out.print((n + 1) + ". ");
            employees.add(new Employee());
            System.out.println((n + 1) + ". Çalışan Sisteme başarıyla eklendi");
        }
    }


    // Delete Employee
    public static void deleteEmployee() {
        Scanner scan = new Scanner(System.in);
        String deleteID;
        boolean isEmployee = false;
        while (!isEmployee) {
            System.out.print("Silmek istediğiniz işçinin ID giriniz > ");
            deleteID = scan.nextLine();
            for (Employee employee : employees) {
                if (employee.getEmployeeID().equals(deleteID)) {
                    employees.remove(employee);
                    isEmployee = true;
                    System.out.println("İşçi başarıyla silindi !");
                    break;
                }
            }
            if (!isEmployee) {
                System.out.println("Geçersiz ID !");
            }
        }


    }


    // Update Employee
    public static void updateEmployee() {
        Scanner scan = new Scanner(System.in);
        String selectID = "";
        boolean isEmployee = false;
        while (!isEmployee) {
            System.out.print("Güncellemek istediğiniz çalışanın ID'sini giriniz > ");
            selectID = scan.nextLine();
            for (Employee employee : employees) {
                if (employee.getEmployeeID().equals(selectID)) {
                    System.out.println(employee.toString());
                    employee.setDepartment();
                    employee.setSalary();
                    System.out.println("Başarıyla Güncellendi !");
                    isEmployee = true;
                    break;
                }
            }
            if (!isEmployee) {
                System.out.println("Geçersiz ID !");
            }

        }
    }


    // View All Employee
    public static void viewEmployees() {
        Scanner scan = new Scanner(System.in);
        String select = "";
        for (int n = 0; n < employees.size(); n++) {
            System.out.println(employees.get(n).toString());
        }
        while (!"Q".equals(select)) {
            System.out.print("Menüye dönmek için Q basınız > ");
            select = scan.nextLine().toUpperCase();
            if ("Q".equals(select)) {
                continue;
            } else {
                System.out.println("Geçersiz işlem !");
            }
        }
        System.out.println("Menüye dönülüyor ...");
    }


}
