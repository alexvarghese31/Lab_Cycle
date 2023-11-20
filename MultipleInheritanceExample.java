import java.util.Scanner;

// Interface Sports
interface Sports {
    float sportwt = 6.0F;

    void putwt();
}

// Class Student
class Student {
    int rollnumber;

    void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollnumber = scanner.nextInt();
    }

    void putNumber() {
        System.out.println("Roll Number: " + rollnumber);
    }
}

// Subclass Test extending Student and implementing Sports
class Test extends Student implements Sports {
    float term1, term2;

    void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Term 1 Marks: ");
        term1 = scanner.nextFloat();
        System.out.print("Enter Term 2 Marks: ");
        term2 = scanner.nextFloat();
    }

    void putMarks() {
        System.out.println("Marks obtained");
        System.out.println("Term 1=" + term1);
        System.out.println("Term 2=" + term2);
    }

    // Implementing the putwt() method from the Sports interface
    public void putwt() {
        System.out.println("Sports weightage=" + sportwt);
    }
}

// Class Results derived from Test
class Results extends Test {
    void display() {
        putNumber();
        putMarks();
        putwt();
        float totalScore = term1 + term2 + sportwt;
        System.out.println("Total Score=" + totalScore);
    }
}

// Main class to run the program
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Results result = new Results();
        result.getNumber();
        result.getMarks();
        result.display();
    }
}
