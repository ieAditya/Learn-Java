class Student {
    String name;
    static String school;

    Student(String name) {
        this.name = name;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student.school = "JUIT";
        Student st1 = new Student("Aditya");
        Student st2 = new Student("Ritik");

        System.out.println(st1.school);
        st1.school = "GHSS";
        // Student.school = "GHSS";
        System.out.println(st2.school);
    }
}
