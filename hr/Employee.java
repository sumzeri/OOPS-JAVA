// 10. An employee management system across two packages, hr and admin, needs to
// demonstrate that a public field is accessible everywhere, a protected field is accessible
// in a subclass in another package, and a private field is accessible only within its own
// class. Write a Java program demonstrating all three cases.
package hr;

public class Employee {
    public String publicName = "Piyush";
    protected double salary = 50000;
    private String password = "12345";

    public void showPrivate() {
        System.out.println("Private password: " + password);
    }
}