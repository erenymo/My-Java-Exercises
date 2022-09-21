import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = new Random().nextInt(50) + 1; // Generates random number between 1-50
        int hak = 0;
        int guess;
        System.out.println("----Sayı Tahmini Oyunu----");
        while (hak<5) {
            System.out.printf("%d Hakkınız var !%n",(5 - hak));
            System.out.print("Tahmin et : ");
            guess = sc.nextInt();
            if (randomNum == guess) {
                System.out.println("Tebrikler, Bildiniz !");
                break;
            } else {
                if (hak != 4) {
                    if (guess<randomNum) {
                        System.out.print("Maalesef, Bilemediniz ! ");
                        System.out.println("Yukarı Çık !");
                        hak++;
                    } else {
                        System.out.print("Maalesef, Bilemediniz ! ");
                        System.out.println("Aşağı İn !");
                        hak++;
                    }
                } else {
                    if (guess<randomNum) {
                        System.out.print("Maalesef, Bilemediniz ! ");
                        hak++;
                    } else {
                        System.out.print("Maalesef, Bilemediniz ! ");
                        hak++;
                    }
                }

            }
        }
        System.out.println("Doğru sayı  : "+ randomNum);
    }
}