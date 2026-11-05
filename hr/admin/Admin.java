package hr.admin;

import hr.Employee;

public class Admin extends Employee {

    public void display() {
        // Public field - accessible
        System.out.println("Public Name: " + publicName);

        // Protected field - accessible in subclass
        System.out.println("Protected Salary: " + salary);

        // Private field cannot be accessed directly
        // System.out.println(password); // ERROR
    }

    public static void main(String[] args) {
        Admin a = new Admin();

        a.display();

        // Private field is accessed through method of its own class
        a.showPrivate();
    }
}
