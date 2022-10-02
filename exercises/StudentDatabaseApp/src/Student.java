import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance =0;
    private static int costOfCourse = 600;

    // Constructor :
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Öğrencinin adını giriniz > ");
        this.firstName = scan.nextLine();

        System.out.print("Öğrencinin soyadını giriniz > ");
        this.lastName = scan.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nÖğrencinin kaçıncı sınıf olduğunu giriniz > ");
        this.gradeYear = scan.nextInt();

        setStudentID();
    }

    // Generate an ID : Grade level + ID
    private void setStudentID() {
        int randomNum = (int) (Math.random() * 10000);
        this.studentID = gradeYear + "" + randomNum;
    }

    // Enroll in courses :
    public void enroll() {
        String[] displayCourses = {
          "History 101" , "Mathematics 101" , "English 101" , "Chemistry 101" , "Computer Science 101"
        };
        System.out.println("#####################");
        for (String i : displayCourses) {
            System.out.println("$600   "+i);
        }
        System.out.println("#####################");

        do {
            System.out.print("Katılmak istediğiniz kursları belirtiniz (Çıkış için Q basınız) > ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (course.equals("Q") || course.equals("q")) {
                break;
            }
            else {
                courses = courses + "\n  " + course;
                tuitionBalance += costOfCourse;
            }
        } while (1 != 0);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Ödemeniz gereken tutar : $" + tuitionBalance + "$");
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        Scanner scan = new Scanner(System.in);
        System.out.print("Ödemek istediğiniz tutarı giriniz > $");
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("$"+payment+" Ödeme için teşekkürler\n");
    }

    // Show status
    public String toString() {
        return "İsim: "+ firstName + " " + lastName + " " + gradeYear+ ". Sınıf " + "\nÖğrenci ID " + studentID +
                "\nEklenilen Dersler: "+ courses +
                "\nÖdemeniz gereken tutar: $" + tuitionBalance;
    }


}
