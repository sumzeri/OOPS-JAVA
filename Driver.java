// 5. A ride-sharing app assigns the same driver object to two different trip bookings. Write a
// Java program to demonstrate that changing the driver's status (available/busy) through
// one booking reference reflects in the other.
class Driver {
    String name;
    String status;
    Driver(String name) {
        this.name = name;
        status = "Available";
    }
    void setStatus(String status) {
        this.status = status;
    }
    void display() {
        System.out.println(name + " - " + status);
    }
}
class Booking {
    Driver driver;
    Booking(Driver driver) {
        this.driver = driver;
    }
    void changeStatus(String status) {
        driver.setStatus(status);
    }
    void displayDriver() {
        driver.display();
    }
}
class DriverBooking {
    public static void main(String[] args) {
        Driver d = new Driver("Rahul");
        Booking b1 = new Booking(d);
        Booking b2 = new Booking(d);
        b1.changeStatus("Busy");
        System.out.println("Booking 1:");
        b1.displayDriver();
        System.out.println("Booking 2:");
        b2.displayDriver();
    }
}
