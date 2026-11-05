// 7. A payroll system needs a method to calculate bonus for an individual employee
// (instance-specific) and another method to calculate the company-wide tax slab (same for
// all employees). Write a Java program for a class Employee demonstrating instance and
// static methods for this.
public class EmployeeBonus {
    String name;
    double salary;
    EmployeeBonus(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    double calculateBonus() {
        return salary * 0.10;
    }
    static void companyTaxSlab() {
        System.out.println("Company Tax Slab = 10%");
    }
    public static void main(String[] args) {
        EmployeeBonus e1 = new EmployeeBonus("Piyush", 50000);
        System.out.println("Employee: " + e1.name);
        System.out.println("Bonus = Rs. " + e1.calculateBonus());
        EmployeeBonus.companyTaxSlab();
    }
}
