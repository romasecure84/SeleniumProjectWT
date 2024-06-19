import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age :");
        int age = input.nextInt();
        if (age > 0) {
            if (age > 18) {
                System.out.println("Welcome the website");
            } else
                System.out.println("You are not eligible to register");
        } else
            System.out.println("Invalid value for age");

    }
}
