class Employee {
    void display() {
        System.out.println("Name of the class is Employee");
    }

    void calcSalary() {
        System.out.println("Salary of Employee is 10000");
    }
}

class Engineer extends Employee {
    void display() {
        System.out.println("Name of the class is Engineer");
    }

    void calcSalary() {
        System.out.println("Salary of Engineer is 20000");
    }
}

public class SingleIn {
    public static void main(String args[]) {
        Engineer e = new Engineer();
        e.display();
        e.calcSalary();
    }
}

