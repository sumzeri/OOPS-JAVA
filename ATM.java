// 1. An ATM machine needs to display whether a customer entered a valid 4-digit PIN. Write
// a Java program using loops and conditional constructs to validate the PIN (must be
// exactly 4 digits, numeric only).
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();
        boolean valid = true;
        if (pin.length() != 4) {
            valid = false;
        } else {
            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    valid = false;
                    break;
                }
            }
        }
        if (valid)
            System.out.println("Valid 4-digit PIN");
        else
            System.out.println("Invalid PIN");
    }
}
