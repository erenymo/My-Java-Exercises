import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfStudents;
        // How many new users we want to add
        System.out.print("Sisteme girilecek öğrenci sayısını giriniz > ");
        numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students.
        for (int n =0; n < numOfStudents; n++) {
            System.out.print(n+1 +". ");
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
            System.out.println("");
        }
    }

}