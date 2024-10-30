
import java.util.Scanner;

public class StudentDatabaseApp {


    public static void main(String[] args) {
        System.out.println("how much students you wanna add :");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        Student [] students = new Student [numOfStudents];
        for (int i = 0 ; i<numOfStudents ; i++ ){
            students[i] = new Student();
            students[i].setId();
            students[i].enrollCourses();
            students[i].payTuition();
            students[i].toString();
            System.out.println("student added successfully \n");


        }

    }

}