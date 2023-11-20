class Employee {
    void display() {
        System.out.println("Name of the class is Employee.");
    }

    void calcSalary() {
        System.out.println("Salary of an employee is 10000.");
    }
}

class Engineer extends Employee {
    // Overriding the calcSalary method
    @Override
    void calcSalary() {
        super.calcSalary(); // Call calcSalary method from the superclass (Employee)
        System.out.println("Salary of an engineer is 20000.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();

        // Displaying the name of the class using the Employee class method
        engineer.display();

        // Displaying salary using the overridden calcSalary method in Engineer class
        engineer.calcSalary();
    }
}
