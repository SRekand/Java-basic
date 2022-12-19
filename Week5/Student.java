package Week5;

public class Student {
    String name;
    String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public String toString() {
        return this.name + " " + "(" + this.studentNumber + ")";
    }
}