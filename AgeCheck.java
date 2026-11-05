// 8. A form validation system in an application accepts age as text input (String) from a user
// and needs to convert it to an integer for eligibility checking (e.g., age ≥ 18). Write a Java
// program using wrapper classes to perform this conversion and check.
import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        String input = sc.nextLine();
        Integer age = Integer.valueOf(input);
        if (age >= 18)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}
