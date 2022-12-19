package Week5;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex88_3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner myObj = new Scanner(System.in);
        String studentName = "name";
        String studentNumber = "studentNumber";

        while (!studentName.equals("")) {
            System.out.println("name:");
            studentName = myObj.nextLine();
            System.out.println("studentnumber:");
            studentNumber = myObj.nextLine();

            Student student = new Student(studentName, studentNumber);
            if ( !studentName.equals("") || !studentNumber.equals("")){
                list.add(student);
            }
        }
        for ( Student student : list ) {
            System.out.println(student);
        }
        System.out.println("");
        System.out.println("Give search term");
        String searchTerm = myObj.nextLine();
        System.out.println("Result:");
        for ( Student student : list ) {
            if ( student.getName().contains(searchTerm) ) {
                System.out.println(student);
            }
        }
    }
}