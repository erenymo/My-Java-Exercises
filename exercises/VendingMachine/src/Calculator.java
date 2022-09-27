public class Calculator {

    VendingMachine vendingMachine = new VendingMachine();


    public double calcChange(double money, int selectedID) {
        return (double) money - (double) vendingMachine.productArray[selectedID].getPrice();
    }
}
