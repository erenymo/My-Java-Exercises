public class VendingMachine {

    // Products
    private Products p1 = new Products("Twix", 0.65);
    private Products p2 = new Products("Chips", 0.55);
    private Products p3 = new Products("Water", 0.25);
    private Products p4 = new Products("Cola", 0.45);
    private Products p5 = new Products("Gum", 0.15);

    public Products[] productArray = {p1, p2, p3, p4, p5};


    public Products[] getProductArray() {
        return productArray;
    }
}
