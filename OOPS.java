
// import bank.Bank;
import bank.Account;

class Pen {
    String color;
    String type; // ballpoint or gel

    public void write() {
        System.out.println("Writing something");
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Student(Student s2) {
    // this.name = s2.name;
    // this.age = s2.age;
    // }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ballpoint";
        pen1.write();

        Student s1 = new Student("Aditya", 21);
        // s1.name = "Aditya";
        // s1.age = 21;
        s1.printInfo();

        Account account1 = new Account();
        account1.name = "Customer1";
    }
}