package hr.admin;
import hr.Employee;
public class Admin extends Employee {
    public void display() {
        System.out.println("Public Name: " + publicName);
        System.out.println("Protected Salary: " + salary);
    }
    public static void main(String[] args) {
        Admin a = new Admin();
        a.display();
        a.showPrivate();
    }
}
