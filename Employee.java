// 3. A company initializes its tax rate only once when the program starts, regardless of how
// many Employee objects are created. Write a Java program using a static block to set this
// common tax rate.
public class Employee {
    private static double taxRate;
    static {
        taxRate = 0.15; 
    }
    public static void main(String[] args) {
        System.out.println("Tax Rate: " + taxRate);
    }
}
