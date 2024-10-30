
import java.util.Scanner ;
public class Student {

    private String firstName ;
    private String lastName ;
    private int gradeYear ;
    private static int id = 1000;
    private String stuId ;
    private String courses = "" ;
    private static int costOfCourse = 600;
    private int tutionBalance = 0;
    private int patTution ;



    public Student (){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name: ");
        this.firstName = input.nextLine();

        System.out.println("enter your last name: ");
        this.lastName = input.nextLine();

        System.out.println("enter your  grade year : ");
        this.gradeYear = input.nextInt();


    }
    public void setId(){
        id++ ;
        stuId = gradeYear + "" + id ;
    }

    public void enrollCourses(){
        System.out.println("enter courses you want to enroll in (Q to quit ): ");

        do {
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q")){
                courses = courses + " \n" + course ;
                tutionBalance = tutionBalance + costOfCourse ;
            }
            else
                break ;
        } while ( 1 != 2);
        System.out.println("courses enrolled in : " + courses);

    }

    public void viewBalance(){
        System.out.println("your balance : " +tutionBalance );
    }

    public void payTuition(){
        viewBalance();
        System.out.println("how much money you wanna pay" );
        Scanner input = new Scanner(System.in);
        int payTution = input.nextInt();
        tutionBalance = tutionBalance -payTution ;

        System.out.println("you paid : "+ payTution );
        viewBalance();
        input.nextLine();


    }

    public String toString (){
        return "\n\n\n"+ " your information:\n"+ firstName + " " +lastName +" "+gradeYear+ " "+ stuId +  " your courses : " + courses +"\n " + tutionBalance  ;
    }

}