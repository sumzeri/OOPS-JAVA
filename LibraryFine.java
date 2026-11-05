// 2. A library issues a fine of ₹5 per day for books returned after the due date. Write a Java
// program to calculate the fine based on the number of days late, using conditional
// statements.
import java.util.Scanner;
public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();
        int fine;
        if (days > 0)
            fine = days * 5;
        else
            fine = 0;
        System.out.println("Fine = Rs. " + fine);
    }
}
