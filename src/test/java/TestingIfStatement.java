import java.util.Scanner;

public class TestingIfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age :");
        age = input.nextInt();
        if (age > 13){
            System.out.println("You are eligible to register to the website");
            System.out.println("Yoy can register also using the mobile app");
        }
        else
            System.out.println("Sorry, You are not eligible to register to the website");
    }
}
