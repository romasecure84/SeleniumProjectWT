import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int assignment_total = 40;
        int exam_total = 200;
        int assignment_grade;
        int exam_grade;
        //Get Input
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter your assignment grade: ");
        assignment_grade = input.nextInt();

        System.out.println("Please enter your exam grade: ");
        exam_grade = input.nextInt();

        int student_grade = assignment_grade + exam_grade;
        int total = assignment_total + exam_total;
        float percentage = (float)student_grade/total * 100;

        //Print output
        System.out.println("Your total grade is: " + student_grade);
        System.out.println("Your percentage is: " + percentage);
    }
}
