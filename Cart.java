// 6. An e-commerce cart system calculates the total bill using a method calculateTotal()
// that should work whether the customer buys a single item, multiple items of the same
// type, or applies a discount. Write a Java program demonstrating method overloading for
// this scenario.
public class Cart {
    double calculateTotal(double price) {
        return price;
    }
    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
    double calculateTotal(double price, int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
    public static void main(String[] args) {
        Cart c = new Cart();
        System.out.println("Single item: Rs. " + c.calculateTotal(500));
        System.out.println("Multiple items: Rs. " + c.calculateTotal(500, 3));
        System.out.println("With discount: Rs. " + c.calculateTotal(500, 3, 10));
    }
}
