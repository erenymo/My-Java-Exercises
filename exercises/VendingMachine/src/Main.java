import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    private static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int letterCounter = 0;

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        Calculator calculator = new Calculator();
        int selectedID;
        double money, change;

        System.out.printf("\nWELCOME TO ERENYMO'S VENDING MACHINE!\n    Here are the products !  \n\nID\n");
        displayProducts(vendingMachine.getProductArray());

        System.out.print("Select your product ID > ");
        selectedID = scan.nextInt();
        if (selectedID > vendingMachine.productArray.length || selectedID < 0) {
            System.out.println("Wrong ID number !!!");

        } else {
            System.out.print("Insert money > $");
            money = scan.nextDouble();
            if (money < vendingMachine.productArray[selectedID].getPrice()) {
                System.out.println("Insufficient balance !!");
            } else {
                change = calculator.calcChange(money, selectedID);
                DecimalFormat df = new DecimalFormat("$##0.00");
                BigDecimal changeBigDecimal = new BigDecimal(change);
                System.out.println("Thanks for purchasing product !" +
                        "Please take your product, and your " + df.format(changeBigDecimal) + " change!");
            }
        }


    }

    public static void displayProducts(Products[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(ID[letterCounter] + "     " + "$" + products[i].getPrice() + "      " + products[i].getName());
            letterCounter++;
        }
        System.out.printf("\n");
    }

}
